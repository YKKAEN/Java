package Lesson3;

public class Main {
    public static void main(String[] args) {

        Player[] players1 = new Player[5];
        players1[0] = new Player(1, "Messi", "Lionel", "Forward");
        players1[1] = new Player(2, "Ronaldo", "Cristiano", "Forward");
        players1[2] = new Player(3, "Karim", "Benzema", "Forward");
        players1[3] = new Player(4, "Wayne", "Rooney", "Forward");
        players1[4] = new Player(5, "Ozil", "Mesut", "Forward");

        Player[] players2 = new Player[5];
        players2[0] = new Player(1, "Messi", "Lionel", "Forward");
        players2[1] = new Player(2, "Ronaldo", "Cristiano", "Forward");
        players2[2] = new Player(3, "Karim", "Benzema", "Forward");
        players2[3] = new Player(4, "Wayne", "Rooney", "Forward");
        players2[4] = new Player(5, "Ozil", "Mesut", "Forward");

        Club club1 = new Club("Barcelona", "Spain", 90, players1);
        Club club2 = new Club("Chealsea", "England", 95, players2);

        Club[] clubs = {club1, club2};

        for (int i = 0; i < clubs.length; i++) {
            clubs[i].printClubData();
            System.out.println();
        }
    }
}
