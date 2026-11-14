
public class Main {
    static int size = 10;
    static String[][] monsterGrid = new String[size][size];

    // Starting position (bottom left)
    static int PlayerX = 9;
    static int PlayerY = 0;

    // Ending position (top right)
    static int endX = 0;
    static int endY = 9;

    // 10x10 board
    public static void makeGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                monsterGrid[i][j] = "_";
            }
        }

        monsterGrid[PlayerX][PlayerY] = "P";
        monsterGrid[endX][endY] = "E";
    }

    // Method to display the board
    public static void displayGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(monsterGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        makeGrid();
        displayGrid();
    }
}
