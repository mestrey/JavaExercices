package ru.mirea.pr9.student;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import ru.mirea.pr9.student.sorting.SortStudentByGpa;
import ru.mirea.pr9.student.sorting.SortStudentById;

public class App {
    Group group;
    JFrame frame;

    public App() {
        group = new Group();
        group.fillRandomly(30);

        JTable table = new JTable(group);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
        TableColumnModel colModel = table.getColumnModel();
        colModel.getColumn(0).setPreferredWidth(50);
        colModel.getColumn(1).setPreferredWidth(250);
        colModel.getColumn(2).setPreferredWidth(50);

        frame = new JFrame("Sorting students");
        frame.add(table);
        frame.setJMenuBar(getJMenuBar());
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JMenuBar getJMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu appMenu = new JMenu("App");
        JMenu sortingMenu = new JMenu("Sort");
        JMenu searchMenu = new JMenu("Search");

        appMenu.add(new JMenuItem(new AbstractAction("About") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "App created by Yovan Mestre :)");
            }
        }));

        appMenu.add(new JMenuItem(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }));

        sortingMenu.add(new JMenuItem(new AbstractAction("By ID") {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentManager.sort(group.getStudents(), 0, group.getStudents().size() - 1, new SortStudentById());
                group.fireTableDataChanged();
            }
        }));

        sortingMenu.add(new JMenuItem(new AbstractAction("By GPA") {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentManager.sort(group.getStudents(), 0, group.getStudents().size() - 1, new SortStudentByGpa());
                group.fireTableDataChanged();
            }
        }));

        searchMenu.add(new JMenuItem(new AbstractAction("By name") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Name:");

                try {
                    Student student = StudentManager.find(group.getStudents(), name);
                    JOptionPane.showMessageDialog(frame, String.format(
                            "%d: %s (%s)",
                            student.getId(),
                            student.getName(),
                            student.getGpa()));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(frame, error.getMessage());
                }
            }
        }));

        menuBar.add(appMenu);
        menuBar.add(sortingMenu);
        menuBar.add(searchMenu);

        return menuBar;
    }

    public static void main(String[] args) {
        new App();
    }
}