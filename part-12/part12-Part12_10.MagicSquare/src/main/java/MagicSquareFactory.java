import java.util.Random;

public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // 1. Starting position: centermost column of the top row
        int row = 0;
        int col = size / 2;

        // Total numbers to place is size * size (e.g., 9 for a 3x3)
        for (int i = 1; i <= size * size; i++) {
            // Place the current number
            square.placeValue(row, col, i);

            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;

            // 3. Check if the potential spot is already occupied
            if (square.readValue(nextRow, nextCol) != 0) {
                // If occupied, move one step DOWN from the CURRENT position
                row = (row + 1) % size;
                // Column stays the same as current
            } else {
                // If empty, move to the potential Up/Right spot
                row = nextRow;
                col = nextCol;
            }
        }

        return square;
    }
}