/**
 * This is the Goblin class which is a subclass of the Monster class. 
 * It has the basics of the goblin like name, hp, attack, and magic attack.
 * HP: 5 + randomSet()
 * Attack: randomSet() + 3
 * Magic Attack: randomSet() + 2
 * Armor and Potion: 0
 * 
 *
 * @author Tanish Kanga
 * @version 11/4/26
 */
public class Goblins extends Monster
{
    public Goblins() {
    super("Goblin", (5 + randomSet()), (randomSet() + 3), (randomSet() + 2), 0, 0);
    
    }
}