package semonster2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

public class PlayerTest {
  @Test
  public void TestSeMonster() {
    LinkedList<Integer> randNumList = new LinkedList<>();
    for (int i = 0; i < 2; i++) {
      randNumList.add(0);
    }
    Player player = new Player(randNumList, "user", 10);
    for (int i = 0; i < 1; i++) {
      player.monsterDeck.add(new Monster(randNumList.pop(), randNumList.pop()));
    }
    assertEquals("Deck:user, HP:10\nスライム:レア度[0]\n", player.toString());

  }
}
