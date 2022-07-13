package Lesson14;

import javax.swing.*;

public class MainFrame extends JFrame {

    private MainMenu mainMenuPage;
    private AddStudents firstPage;
    private ListStudents secondPage;

    private Students[] students = {
    };
    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENT APPLICATION");
        setSize(500, 500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        firstPage = new AddStudents(this);
        firstPage.setVisible(false);
        add(firstPage);

        secondPage = new ListStudents(this);
        secondPage.setVisible(false);
        add(secondPage);

    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public AddStudents getFirstPage() {
        return firstPage;
    }

    public ListStudents getSecondPage() {
        return secondPage;
    }
    public Students[] getStudents() {
        return students;
    }

    public void setPlayers(Students[] players) {
        this.students = players;
    }
}