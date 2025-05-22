public class Card implements Comparable<Card> {

    private String name;
    private String suit;

    public Card (String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

     
    public String getName() {
        return this.name;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    
    public int getValue() {
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};

        int namesIndex = -1;
        int suitsIndex = -1;
        // Find the index of the current card's name
        for (int i = 0; i < names.length; i++) {
            if (this.name.equals(names[i])) {
                namesIndex = i;
                break;
            }
        }
        // Find the index of the current card's suit
        for (int i = 0; i < suits.length; i++) {
            if (this.suit.equals(suits[i])) {
                suitsIndex = i;
                break;
            }
        }

        return (namesIndex * suits.length) + suitsIndex;
        /**
         * The name is checked before suits, everything in brackets will be a multiple of 4, 
         * higher the card is without the suit,the later in the deck it will appear, 
         * then the suits index (0/1/2/3) will be added on to further increase the value in the order that we check suits last.
         */
    }


    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }

    @Override
    public int compareTo(Card other) {
        return this.getValue() - other.getValue();
    }

}