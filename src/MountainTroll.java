/**
 * This is the MountainTroll class which is a subclass of the Monster class. 
 * It has the basics of the mountain troll like name, hp, attack, and magic attack.
 * HP: randomSet() + 11
 * Attack: randomSet() + 3
 * Magic Attack and Potion: 0
 * Armor: randomSet() + 3
 * 
 *
 * @author Tanish Kanga
 * @version 11/5/26
 */
public class MountainTroll extends Monster {
    
    public MountainTroll () {
        super("Mountain Troll", (randomSet() + 11), (randomSet() + 3), 0, (randomSet() + 3), 0);
    }
}