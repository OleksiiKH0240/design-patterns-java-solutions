/**
 * Троль
 */
public class Troll extends CharacterTemplate {

  /**
   * Підняти булаву
   */
  public void pickUpWeapon() {
    System.out.println("Pick up club");
  }

  /**
   * Захищатися за допомогою булави
   */
  public void defenseAction() {
    System.out.println("Defend with club");
  }

  /**
   * Повернутися в безпечне місце в горах
   */
  public void moveToSafety() {
    System.out.println("Return to the mountain");
  }

}
