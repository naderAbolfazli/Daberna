package ir.maktab;

/**
 * Created by Nader on 12/23/2017.
 */
public class Player {
    private String name;
    private Card[] cards;

    public Player(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public Card[] getCards() {
        return cards;
    }

    public boolean isWinner() {
        for (Card c : cards
                ) {
            for (int i = 1; i < 4; i++) {
                int rowMarked = 0;
                for (int j = 1; j < 6; j++)
                    if (c.isMarked(i, j))
                        rowMarked++;
                if (rowMarked==5)
                    return true;
            }
        }
        return false;
    }

    public void markNumber(int number) {
        for (Card c : cards
                ) {
            c.markNumber(number);
        }
    }
}
