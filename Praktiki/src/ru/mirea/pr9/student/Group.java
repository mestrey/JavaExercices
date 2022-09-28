package ru.mirea.pr9.student;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.table.AbstractTableModel;

public class Group extends AbstractTableModel {
    private String[] columns = { "ID", "FIO", "GPA" };
    private ArrayList<Student> students = new ArrayList<Student>();

    public void fillRandomly(int number) {
        Random r = new Random();
        students.clear();

        String[] first = { "Alexander", "Pyotr", "Dmitry", "Vladimir", "Slava" };
        String[] name = { "Spiridonov", "Putin", "Orgutsov", "Vasiliev", "Popov" };
        String[] father = { "Nikolaevich", "Adreyevich", "Vladimorovich", "Ivanovich" };

        for (int i = 0; i < number; i++) {
            String fio = String.format(
                    "%s %s %s",
                    first[r.nextInt(first.length)],
                    name[r.nextInt(name.length)],
                    father[r.nextInt(father.length)]);
            students.add(new Student(i + 1, fio, r.nextInt(100)));
        }
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Object temp = null;
        if (col == 0)
            temp = students.get(row).getId();
        else if (col == 1)
            temp = students.get(row).getName();
        else if (col == 2)
            temp = students.get(row).getGpa();
        return temp;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
