import java.util.*;
/**
 * This is the main monster class that all types of monsters will 
 * extend off of and extends of the Characters class
 *
 * @author Tanish Kanga
 * @version 11/2/26
 */
public class Monster extends Characters
{
    protected int armor, potion;
    Random randy = new Random();
    
    public Monster(String name, int hp, int att, int mag, int arm, int pot) {
        super(name, hp, att, mag);
        this.armor = arm;
        this.potion = pot;
    }
    
    public int attack() {
        int attackDamage = attack + randy.nextInt(3) - 1;
        
        if (this instanceof CaveTroll) {
            attackDamage = 5 + (randy.nextInt(3) - 1);
        } else if (this instanceof MountainTroll) {
            attackDamage = 3 + (randy.nextInt(3) - 1); 
        } else if (this instanceof Goblin) {
            attackDamage = 3 + (randy.nextInt(3) - 1);
        int goblinMagic = randy.nextInt (3) + 1;
            attackDamage += goblinMagic;
        } else if (this instanceof HobGoblin) {
            attackDamage = 5 + (randy.nextInt(3) - 1);
        int hobMagic = randy.nextInt(3) + 2;
            attackDamage += hobMagic;
        }
        
        return attackDamage;
    }
    
    public void takeDamageMonster(int damage) {
        int monsterArmor = 0;
    
        if (this instanceof CaveTroll) {
            monsterArmor = randy.nextInt(3) + 1;
            System.out.println("Cave Troll has armor of " + monsterArmor + " and will take " + monsterArmor + " less damage");
        } else if (this instanceof MountainTroll) {
            monsterArmor = randy.nextInt(3) + 2;
            System.out.println("Mountaint Troll has armor of " + monsterArmor + " and will take " + monsterArmor + " less damage");
        }
        
        int finalDamage = damage - monsterArmor;
        
        if (finalDamage < 0) {
        finalDamage = 0;
        }
        
        super.takeDamage(finalDamage);
    }
    
    public int getPotion() {
    return potion;
    }
    
    public static int randomSet() {
    Random randy = new Random();
    int offSet = randy.nextInt(3) - 1;
    return offSet;
    }
    
    public int potionHealth() {
    return randomSet() + 4;
    }
    }