import java.util.*;
/**
 * This class is the player class which will be used to create the player character.
 * It has the basics of the player like name, hp, attack, and magic attack.
 * It also has a method to heal the player and a method to attack the monster.
 *
 * @author Tanish Kanga
 * @version 11/3/26
 */
public class Player extends Characters {
    private int maxHp = 50;
    Random randy = new Random();
    
    public Player() {
        super("Monster Killer", 50, 2, 1);
    }
    
    public int attack() {
        int damage = randy.nextInt(5) + 2; //Attack can be from 2-6 damage
        double magicChance = randy.nextDouble();

        if(magicChance < 0.25) {
            damage += randy.nextInt(3) + 1;
        }
        
    return damage;
    }
    
    //Makes sure health doesn't go over max health when healing
    public void healing(int heals) {
        health += heals;

        if(health > maxHp) {
            health = maxHp;
        }
    }
}