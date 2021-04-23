package main.com.example.simulationlab10;

import java.util.Scanner;

public class Listener {

    public static void main(String[] args) {
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        sayHello();
        while (true) {
            int number = input.nextInt();
            if (number == 2) {
                return;
            }

            int combination = game.getDicesCombination();
            String action = JumanjiAction.getPhrase(combination);

            System.out.println(action);
            if (combination == 12) {
                return;
            }
            System.out.println("\nHint: " + JumanjiAction.fromInteger(combination) + "...");
        }
    }

    private static void sayHello() {
        System.out.println("""
                JUMANJI
                A GAME FOR THOSE WHO SEEK TO FIND...
                A WAY TO LEAVE THEIR WORLD BEHIND.
                
                Now and then enter 1 to roll the dices or 2 to exit.
                And remember that the Game will be finished only when you get 12.
                """);
    }
}
