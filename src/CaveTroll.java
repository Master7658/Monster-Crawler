/**
 * This is the CaveTroll class which is a subclass of the Monster class. 
 * It has the basics of the cave troll like name, hp, attack, and magic attack.
 * HP: 7 + randomSet()
 * Attack: randomSet() + 5
 * Armor: randomSet() + 2
 * Magic Attack and Potion: 0
 * 
 *
 * @author Tanish Kanga
 * @version 11/4/26
 */
public class CaveTroll extends Monster {
    
    public CaveTroll () {
        super("Cave Troll", (randomSet() + 7), (randomSet() + 5), 0, (randomSet() + 2), 0);
    }
}