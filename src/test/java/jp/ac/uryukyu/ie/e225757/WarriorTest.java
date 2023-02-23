package jp.ac.uryukyu.ie.e225757;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    @Test void attackTest() {
        Warrior demoWarrior = new Warrior("勇者", 10, 100);
        Enemy slime = new Enemy("スライム", 450, 0);

        for(int count=0; count<3; count++){
            int hpBeforeAattcked = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int hpAfterAattcked = slime.getHitPoint();
            assertEquals((int)(demoWarrior.getAttack()*1.5), hpBeforeAattcked - hpAfterAattcked);
        }
    } 
 }
