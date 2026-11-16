
import java.util.*;

public class Main {
    //variables
    static int size = 10;
    static String[][] monsterGrid = new String[size][size];

    //starting position
    static int PlayerX = 9;
    static int PlayerY = 0;

    //ending position
    static int endX = 0;
    static int endY = 9;

    //objects
    static Random randy = new Random();
    static Scanner reader = new Scanner(System.in);
    static Monster[][] monsterObjects = new Monster[size][size];

    //10x10 grid
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

    //method to place 10 monsters randomly on the board
    public static void placeMonsters() {
        int monsterCount = 0;

        while (monsterCount < 10) {
            int rows = randy.nextInt(size);
            int colums = randy.nextInt(size);

            if (monsterGrid[rows][colums].equals("_") && (rows != 9 && colums != 0) && (rows != 0 && colums != 0)) {
                int monsterType = randy.nextInt(4);
                
                //random monster type generator
                if (monsterType == 0) {
                    monsterGrid[rows][colums] = "C"; //Cave Troll
                    monsterObjects[rows][colums] = new CaveTroll();
                } else if (monsterType == 1) {
                    monsterGrid[rows][colums] = "G"; //Goblin
                    monsterObjects[rows][colums] = new Goblins();
                } else if (monsterType == 2) {
                    monsterGrid[rows][colums] = "M"; //Mountain Troll
                    monsterObjects[rows][colums] = new MountainTroll();
                } else if (monsterType == 3) {
                    monsterGrid[rows][colums] = "H"; //Hob Goblin
                    monsterObjects[rows][colums] = new HobGoblin();
                }

                monsterCount++;
            }
        }
    }

    public static void movePlayer(String direction) {
        monsterGrid[PlayerX][PlayerY] = "_";

        int changeX = PlayerX;
        int changeY = PlayerY;

        //north, east, south, west movement
        if (direction.equals("W") || direction.equals("w")) {  //North
            if (PlayerX > 0) {
                changeX--;
            } else {
                System.out.println("You can't move north");
            }

        } else if (direction.equals("D") || direction.equals("d")) {   //East
            if (PlayerY < 9) {
                changeY++;
            } else {
                System.out.println("You can't move east");
            }

        } else if (direction.equals("S") || direction.equals("s")) {  //South
            if (PlayerX < 9) {
                changeX++;
            } else {
                System.out.println("You can't move south");
            }

        } else if (direction.equals("A") || direction.equals("a")) {   //West
            if (PlayerY > 0) {
                changeY--;
            } else {
                System.out.println("You can't move west");
            }
        } else {
            System.out.println("You didn't enter a valid move, please enter using WASD movement");
        }

        PlayerX = changeX;
        PlayerY = changeY;
        monsterGrid[PlayerX][PlayerY] = "P";

        System.out.println("Moved to (" + PlayerX + ", " + PlayerY + ")");
    }

    public static void main(String[] args) {
        makeGrid();
        placeMonsters();

        while (true) {
            monsterGrid[PlayerX][PlayerY] = "P";
            displayGrid();
            System.out.println("Enter W, A, S, or D to move");
            String move = reader.nextLine();
            movePlayer(move);
        }
    }
}
