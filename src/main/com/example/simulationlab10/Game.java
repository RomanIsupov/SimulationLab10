package main.com.example.simulationlab10;

import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private final Dice dice1;
    private final Dice dice2;

    public Game() {
        dice1 = new Dice();
        dice2 = new Dice();
    }

    private int getDiceSide(Dice dice) {
        double[] probabilities = dice.getProbabilities();
        double alpha = ThreadLocalRandom.current().nextDouble(0.0, 1.0);
        int side;

        for (side = 1; side < dice.getSidesAmount() && alpha > probabilities[side - 1]; side++) {
            alpha -= probabilities[side - 1];
        }
        return side;
    }

    public int getDicesCombination() {
        int side1 = getDiceSide(dice1);
        int side2 = getDiceSide(dice2);
        return side1 < side2 ? side1 * 10 + side2 : side2 * 10 + side1;
    }
}
