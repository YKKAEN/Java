package Lesson16;

public class Library {
    private String name;
    private String city;
    private Book books[] = new Book[20];
    private int index = 0;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public Library() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void addBook(Book book) {
        try{
            books[index] = book;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full");
        }
            index++;
    }
    public void printBooks() {
        for (int i = 0; i < index; i++) {
            try {
                System.out.println(books[i].getData());
            }catch (NullPointerException e){
                System.out.println("The book is empty");;
            }
        }
    }
}
