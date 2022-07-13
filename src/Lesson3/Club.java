package Lesson3;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player[] players;

    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public Club() {

    }

    public void printClubData() {
        System.out.println(name + " " + country + " " + ratingPoints);
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
}