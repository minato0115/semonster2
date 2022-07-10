package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  String name;// Player name
  ArrayList<Monster> monsterDeck = new ArrayList<>();
  LinkedList<Integer> randomNumberList;// randomな0~4の数値を必要な数保存しておく
  int hp;

  Player(LinkedList<Integer> randomNumberList, String playerName, int hp) {
    this.randomNumberList = randomNumberList;
    this.name = playerName;
    this.hp = hp;
  }

  /**
   * モンスターを8体分drawする．利用するランダムな値(0~4)はrandomNumberListから取得する
   */
  public void drawMonsters() {
    for (int i = 0; i < 8; i++) {
      this.monsterDeck.add(new Monster(this.randomNumberList.pop(), this.randomNumberList.pop()));

    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck:" + this.name + ", HP:" + this.hp + "\n");
    for (Monster m : this.monsterDeck) {
      sb.append(m);
    }

    return sb.toString();
  }

}
