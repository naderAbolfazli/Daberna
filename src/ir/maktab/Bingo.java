package ir.maktab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Nader on 12/23/2017.
 */
public class Bingo {
    private List<Player> players = new ArrayList<>();

    public Bingo(Player[] players) {
        Collections.addAll(this.players, players);
    }

    public String play(int number) {
        String winners = "";
        for (Player p : players
                ) {
            p.markNumber(number);
            if (p.isWinner())
                winners = winners.concat(p.getName() + " ");
        }
        return winners;
    }
}
