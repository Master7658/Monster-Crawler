/**
 * This class is the main character class that everything will extend off of
 * It has the basics of the character like name, hp, attack, and magic attack
 * with a few methods inside of it.
 *
 * @author Tanish Kanga
 * @version 11/2/26
 */
public class Characters {
    protected String name;
    protected int health, attack, magicAttack;
    
    public Characters(String n, int hp, int att, int mag) {
        this.name = n;
        this.health = hp;
        this.attack = att;
        this.magicAttack = mag;
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }
    
    public int getHp() {
        return health;
    }
}