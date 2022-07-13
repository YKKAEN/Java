package Lesson14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudents extends JPanel {

    private MainFrame parent;
    private JLabel label;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox Box;
    private String[] group = {" ", "Information Technologies", "Economics", "Mathematics"};
    private JButton back;
    private JButton button;
    private JTextArea area;

    public AddStudents(MainFrame parent) {

        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        label = new JLabel("ADD STUDENTS");
        label.setSize(300, 30);
        label.setLocation(200, 70);
        add(label);

        back = new JButton("BACK");
        back.setSize(120, 30);
        back.setLocation(280, 300);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getFirstPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
        label = new JLabel("NAME :");
        label.setSize(300, 30);
        label.setLocation(100, 100);
        add(label);

        textField1 = new JTextField("");
        textField1.setSize(200, 30);
        textField1.setLocation(200, 150);
        add(textField1);

        label = new JLabel("SURNAME :");
        label.setSize(300, 30);
        label.setLocation(100, 150);
        add(label);

        textField2 = new JTextField("");
        textField2.setSize(200, 30);
        textField2.setLocation(200, 100);
        add(textField2);

        label = new JLabel("FACULTY :");
        label.setSize(300, 30);
        label.setLocation(100, 200);
        add(label);

        Box = new JComboBox(group);
        Box.setSize(200, 30);
        Box.setLocation(200, 200);
        add(Box);

        label = new JLabel("GROUP :");
        label.setSize(300, 30);
        label.setLocation(100, 250);
        add(label);

        textField3 = new JTextField("");
        textField3.setSize(200, 30);
        textField3.setLocation(200, 250);
        add(textField3);

        button = new JButton("ADD");
        button.setSize(120, 30);
        button.setLocation(90, 300);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                String text3 = textField3.getText();
                Object box = Box.getSelectedItem();
                if (!text1.equals("") && !text2.equals("") && !text3.equals("")) {
                    // area.append(text1 + " " + text2 + " " + text3 + " " + box);
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    Box.setSelectedIndex(0);
                }

            }
        });
        add(button);
    }
}
