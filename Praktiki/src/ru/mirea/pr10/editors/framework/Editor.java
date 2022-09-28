package ru.mirea.pr10.editors.framework;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class Editor {
    private String name;
    private ICreateDocument factory;
    private JFrame frame;
    private IDocument currentDocument;

    public Editor(String name, ICreateDocument factory) {
        this.name = name;
        this.factory = factory;

        frame = new JFrame(name);
        frame.setJMenuBar(getJMenuBar());
        frame.pack();
        frame.setSize(200, 200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private JMenuBar getJMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu appMenu = new JMenu(name);

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

        JMenu fileMenu = new JMenu("File");

        fileMenu.add(new JMenuItem(new AbstractAction("New") {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentDocument = factory.createNew();
            }
        }));

        fileMenu.add(new JMenuItem(new AbstractAction("Open") {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentDocument = factory.createOpen();
            }
        }));

        fileMenu.add(new JMenuItem(new AbstractAction("Save") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentDocument != null)
                    currentDocument.save();
            }
        }));

        menuBar.add(appMenu);
        menuBar.add(fileMenu);

        return menuBar;
    }
}
