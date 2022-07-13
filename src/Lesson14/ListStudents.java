package Lesson14;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListStudents extends JPanel {

    private MainFrame parent;

    private JLabel label;
    private JButton back;

    private String header[] = {"Id", "Name", "Surname", "Faculty", "Group"};
    private JTable table;
    private JScrollPane scrollPane;

    public ListStudents(MainFrame parent) {

        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        label = new JLabel("LIST STUDENTS");
        label.setSize(300, 30);
        label.setLocation(200, 90);
        add(label);

        back = new JButton("Back");
        back.setSize(300, 30);
        back.setLocation(100, 330);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getSecondPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });

        table = new JTable();
        table.setFont(new Font("Harvard", Font.PLAIN, 12));
        table.setRowHeight(30);

        scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 200);
        scrollPane.setLocation(100, 120);
        add(scrollPane);

    }

    public void generateTable(Students[] students) {

        Object data[][] = new Object[students.length][5];

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getId());
            data[i][0] = students[i].getId();
            data[i][1] = students[i].getName();
            data[i][2] = students[i].getSurname();
            data[i][3] = students[i].getFaculty();
            data[i][4] = students[i].getGroup();

        }
        DefaultTableModel model = new DefaultTableModel(data, header);
        table.setModel(model);
    }
}
