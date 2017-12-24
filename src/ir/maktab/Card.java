package ir.maktab;

/**
 * Created by Nader on 12/23/2017.
 */
public class Card {
    private int[][] numbers = new int[3][5];
    private boolean[][] isMark = new boolean[3][5];

    public Card(int[][] numbers) {
        this.numbers = numbers;
    }

    public int getNumber(int row, int column) {
        return numbers[row - 1][column - 1];
    }

    public boolean isMarked(int row, int column) {
        return isMark[row - 1][column - 1];
    }

    public void markNumber(int number) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                if (numbers[i][j] == number)
                    isMark[i][j] = true;
    }
}
