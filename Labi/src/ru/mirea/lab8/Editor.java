package ru.mirea.lab8;

import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.*;

public class Editor {
    private JFrame frame;
    private JTextArea textArea;
    private File file;

    public Editor() {
        textArea = new JTextArea();
    }

    private boolean isTextAreaEmpty() {
        return textArea.getText().trim().equals("");
    }

    private int saveConfirm() {
        return JOptionPane.showConfirmDialog(
                frame,
                "Sure to perform?",
                "Not saved!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
    }

    private void saveFile() {
        if (file == null)
            return;

        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(file, false));
            writer.write(textArea.getText());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void fileSaveChooser() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save as");
        int selection = fileChooser.showSaveDialog(frame);
        if (selection == JFileChooser.APPROVE_OPTION)
            file = fileChooser.getSelectedFile();
        saveFile();
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int selection = fileChooser.showOpenDialog(frame);
        if (selection == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();

            try {
                textArea.setText(new String(Files.readString(Paths.get(file.getAbsolutePath()))));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private JMenuBar getMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu appMenu = new JMenu("App");

        JMenuItem aboutApp = new JMenuItem(new AbstractAction("About") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "App created by Yovan Mestre :)");
            }
        });

        JMenuItem exitApp = new JMenuItem(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (saveConfirm() == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });

        appMenu.add(aboutApp);
        appMenu.add(exitApp);

        JMenu fileMenu = new JMenu("File");

        JMenuItem newFile = new JMenuItem(new AbstractAction("New") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isTextAreaEmpty() || (!isTextAreaEmpty() && saveConfirm() == JOptionPane.YES_OPTION))
                    textArea.setText("");
            }
        });

        JMenuItem openFile = new JMenuItem(new AbstractAction("Open") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isTextAreaEmpty() || (!isTextAreaEmpty() && saveConfirm() == JOptionPane.YES_OPTION))
                    openFile();
            }
        });

        JMenuItem saveFile = new JMenuItem(new AbstractAction("Save") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (file == null)
                    fileSaveChooser();
                else
                    saveFile();
            }
        });

        JMenuItem saveAsFile = new JMenuItem(new AbstractAction("Save as") {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileSaveChooser();
            }
        });

        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(saveAsFile);

        menuBar.add(appMenu);
        menuBar.add(fileMenu);

        return menuBar;
    }

    public void run() {
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        frame = new JFrame("Editor");
        frame.setJMenuBar(getMenuBar());
        frame.add(scroll);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
