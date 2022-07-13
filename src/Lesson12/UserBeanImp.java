package Lesson12;

public class UserBeanImp implements UserBean {

    private User[] users;

    public UserBeanImp(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {

        

        }


    @Override
    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName() == "John") {
                System.out.println(users[i].getName());
            }
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getSurname() == "Smith") {
                System.out.println(users[i].getSurname());
            }
        }
    }
}
