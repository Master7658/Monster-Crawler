# CS-193-Final-Project-Monster-Crawler

## Monster Crawler

A Java-based game where the player must navigate through multiple boards filled with monsters to reach the finish.

## The Problem

I enjoy playing video games and have always wanted to make one, so I decided to make a game using Java. I wanted to focus more on the back end and see how I could make the actual game work while implementing different concepts and ideas. This project allows me to learn more about object-oriented programming, inheritance, arrays, and game mechanics while creating a playable game.

## How It Works

- The player starts in the bottom-left corner of a 10×10 board and must reach the top-right corner.
- The player can move up, down, left, and right using WASD controls.
- Monsters are randomly placed throughout the board.
- There are four types of monsters: Goblin, HobGoblin, Cave Troll, and Mountain Troll.
- When the player encounters a monster, a turn-based battle begins.
- The player and monster take turns attacking until one is defeated.
- The player recovers health after defeating monsters and can receive additional healing from HobGoblin potions.
- The game contains three levels with increasing difficulty.
- Level 1 contains 10 monsters, Level 2 contains 15 monsters, and Level 3 contains 20 monsters.
- When the player reaches the finish, a new board is generated, and the player advances to the next level while keeping their remaining health.
- The game ends when the player completes all three levels or loses all their health.

## Tech Stack

- **Language:** Java
- **Libraries:** Java's built-in Scanner and Random classes.
- **External Tools:** Git and GitHub for version control and Visual Studio Code for development.
- **Data Storage:** Two-dimensional arrays are used to store the game board and monster objects. Player health, position, and level information are stored in memory while the game is running. No external database is required.

## Setup

1. Install the Java Development Kit (JDK) on your computer.
2. Install Git on your computer.
3. Open a terminal.
4. Clone the GitHub repository:

```bash
git clone https://github.com/Master7658/CS-193-Final-Project-Monster-Crawler.git
```

5. Navigate into the project folder:

```bash
cd CS-193-Final-Project-Monster-Crawler
```

6. Compile the Java files:

```bash
javac src/*.java
```

7. Run the Main file to start the game:

```bash
java -cp src Main
```

## Example Input and Output

When the game starts, the terminal will display a randomly generated board similar to the following:

```text
Level: 1/3
HP: 50
_ _ _ _ _ _ _ _ _ E
_ _ G _ _ _ _ _ _ _
_ _ _ _ C _ _ _ _ _
_ H _ _ _ _ _ _ _ _
_ _ _ _ _ _ M _ _ _
_ _ _ G _ _ _ _ _ _
_ _ _ _ _ C _ _ _ _
_ _ M _ _ _ _ _ _ _
_ _ _ _ _ _ H _ _ _
P _ _ G _ _ _ C _ _

Enter W, A, S, or D to move
```

Example input:

```text
W
```

Example output:

```text
Moved to (8, 0)
Level: 1/3
HP: 50
_ _ _ _ _ _ _ _ _ E
_ _ G _ _ _ _ _ _ _
_ _ _ _ C _ _ _ _ _
_ H _ _ _ _ _ _ _ _
_ _ _ _ _ _ M _ _ _
_ _ _ G _ _ _ _ _ _
_ _ _ _ _ C _ _ _ _
_ _ M _ _ _ _ _ _ _
P _ _ _ _ _ H _ _ _
_ _ _ G _ _ _ C _ _
```

The player moves one space up, and the updated board is displayed.

When the player completes the first level, the output will look similar to this:

```text
You have completed level 1!
---------------------------------------------
Welcome to level 2!
Number of monsters: 15
Your current HP: 45
---------------------------------------------
```

After completing all three levels, the following message is displayed:

```text
Congratulations you have won the game!
```

Monster positions and battle results are randomly generated, so each game may be different.

## Roadmap

### MVP Milestones

- [x] Set up the project and GitHub repository.
- [x] Create the main Character.java class.
- [x] Create the Player.java and Monster.java classes that extend Character.
- [x] Create the four types of monsters: Goblin, HobGoblin, Cave Troll, and Mountain Troll.
- [x] Create a 10×10 board where the player starts in the bottom-left corner and the finish is in the top-right corner.
- [x] Add WASD movement with boundaries and randomly place monsters.
- [x] Create a battle system between the player and monsters.
- [x] Add win and lose conditions.

### Schedule Features

- [ ] Add more types of monsters with different abilities.
- [x] Add multiple levels with increasing difficulty.
- [ ] Add more advanced combat features and items.

## Author

Tanish Kanga

## Github
[https://github.com/Master7658](https://github.com/Master7658)

## Demo
[https://app.screencastify.com/watch/vzluTFyncIibj2UQZQl8](https://app.screencastify.com/watch/vzluTFyncIibj2UQZQl8)
