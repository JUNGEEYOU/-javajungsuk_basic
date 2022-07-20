public class Ex6_2 {
    public static void main(String[] args) {
        System.out.println(Card.height);
        Card c1 = new Card();
        c1.number = 7;
        c1.kind = "Heart";
        System.out.println(c1.kind);
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}