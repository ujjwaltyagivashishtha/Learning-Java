// Simulate a dice roll using Math.random() and display the outcome (1 to 6).

public class DiceRollSimulation {
  public static void main(String[] args) {
    int diceRoll = (int)(Math.random() * 6) + 1;

    System.out.println("You rolled a " + diceRoll);
  }
}
