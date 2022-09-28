package ru.mirea.pr12;

import java.util.StringTokenizer;

public class Shirt {
    static String[] shirts = new String[11];
    String index;
    String model;
    String color;
    String size;

    void fillArray() {
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
    }

    public Shirt(String shirt) {
        if (shirt.equals("root"))
            return;

        StringTokenizer tokenizer = new StringTokenizer(shirt, ",");
        this.index = tokenizer.nextToken();
        this.model = tokenizer.nextToken();
        this.color = tokenizer.nextToken();
        this.size = tokenizer.nextToken();
    }

    @Override
    public String toString() {
        return ("index: " + this.index + "; model: " + this.model + "; color: " + this.color + "; size: " + this.size);
    }

    public Shirt[] toShirtArray() {
        Shirt[] newShirts = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++) {
            Shirt tempShirt = new Shirt(shirts[i]);
            newShirts[i] = tempShirt;
        }

        return newShirts;
    }
}
