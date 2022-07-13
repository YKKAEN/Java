package Lesson12;

public class Main {
    public static void main(String[] args) {
        User users1 = new User("John", "B");
        User users2 = new User("C", "D");
        User users3 = new User("E", "F");
        User users4 = new User("G", "H");
        User users5 = new User("J", "Smith");
        User users6 = new User("L", "M");
        User users7 = new User("John", "O");
        User users8 = new User("P", "Q");
        User users9 = new User("R", "S");
        User users10 = new User("T", "Smith");
        User[] users = {users1, users2, users3, users4, users5, users6, users7, users8, users9, users10};

        UserBeanImp userBeanImp = new UserBeanImp(users);
        userBeanImp.getAllUsers();

    }
}
