package Lesson11;

public class ERPSystem {
    private User[] memory = new User[1000];
    private int sizeOfUsers = 0;

    public ERPSystem(User[] memory, int sizeOfUsers) {
        this.memory = memory;
        this.sizeOfUsers = sizeOfUsers;
    }
    public ERPSystem(int i, int sizeOfUsers) {

    }

    public User[] getMemory() {
        return memory;
    }

    public void setMemory(User[] memory) {
        this.memory = memory;
    }

    public int getSizeOfUsers() {
        return sizeOfUsers;
    }

    public void setSizeOfUsers(int sizeOfUsers) {
        this.sizeOfUsers = sizeOfUsers;

    }
    public void addUser(User u) {
        for (int i = 0; i < memory.length; i++) {
            memory[i] = u;
            sizeOfUsers++;
        }
    }
    public void printAllUsers() {
        for (int i = 0; i < sizeOfUsers; i++) {
            System.out.println(i + 1 + ") " + memory[i]);
        }
    }
    public void printUser(int index) {
        if (index < sizeOfUsers) {
            System.out.println(memory[index]);
        } else {
            System.out.println("No such user in this index");
        }
    }
}
