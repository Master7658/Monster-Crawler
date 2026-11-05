/**
 * This is the HobGoblin class which is a subclass of the Monster class. 
 * It has the basics of the hob goblin like name, hp, attack, magic attack, and potion.
 * HP: 7 + randomSet()
 * Attack: randomSet() + 5
 * Magic Attack: randomSet() + 3
 * Potion: randomSet() + 4
 * Armor: 0
 *
 * @author Tanish Kanga
 * @version 11/4/26
 */
public class HobGoblin extends Monster {
    protected int potion;

    public HobGoblin() {
        super("Hob Goblin", (randomSet() + 7), (randomSet() + 5), (randomSet() + 3), 0, (randomSet() + 4));
    }

}