package ru.mirea.pr12;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        {
            Person person1 = new Person("Vladimir", "Putin", "Vladimirovich");
            Person person2 = new Person("Yovan");
            System.out.println(person1.getShort());
            System.out.println(person2.getShort());
        }
        System.out.println();
        {
            new Address("Russia, Moscow oblast, Moscow, Vernadskogo, 78, building 4, IVC_104").print();
            System.out.println();
            new Address("Germany-Bavaria-Munich-MerkelStreet-21- -9696").print();
            System.out.println();
            new Address("France; Val de Loire; Paris; Champs Élysées; 1979; bâtiment 1; IVC_104").print();
            System.out.println();
            new Address("Japan.TokyoDistrict.Tokyo.AnimeTop.2007.noBuildingJustHokage.10007").print();
        }
        System.out.println();
        {
            Shirt shirtStore = new Shirt("root");
            shirtStore.fillArray();
            for (Shirt a : shirtStore.toShirtArray())
                System.out.println(a.toString());
        }
        System.out.println();
        {
            StringBuilder number = new StringBuilder();

            number.append("+79175655655");
            System.out.println(new PhoneNumber(number).getNumber());

            number.setLength(0);
            number.append("89175655655");
            System.out.println(new PhoneNumber(number).getNumber());
        }
        System.out.println();
        {
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            String[] s = fileName.split(" ");

            StringBuilder result = getLine(s);
            System.out.println(result);

            scanner.close();
        }
    }

    private static StringBuilder getLine(String... words) {
        StringBuilder sb = new StringBuilder();
        String[] w;

        if (words == null || words.length == 0)
            return sb;
        else
            w = words;

        sb.append(w[0]);

        for (int j = 0; j < w.length; j++) {
            for (int i = 1; i < w.length; i++) {
                if (w[i].length() == 0)
                    continue;
                if (sb.toString().toLowerCase().charAt(0) == w[i].toLowerCase().charAt(w[i].length() - 1)) {
                    sb.insert(0, w[i] + " ");
                    w[i] = "";
                } else if (sb.toString().toLowerCase().charAt(sb.length() - 1) == w[i].toLowerCase().charAt(0)) {
                    sb.append(" ").append(w[i]);
                    w[i] = "";
                }
            }
        }

        return sb;
    }
}
