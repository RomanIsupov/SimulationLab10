package main.com.example.simulationlab10;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private final double[] probabilities;
    private static final int sidesAmount = 6;

    {
        probabilities = new double[sidesAmount];
        double maximumProbability = 1.0;
        for (int i = 0; i < sidesAmount - 1; i++) {
            probabilities[i] = ThreadLocalRandom.current().nextDouble(0.0, maximumProbability / 2.0);
            maximumProbability -= probabilities[i];
        }
        probabilities[sidesAmount - 1] = maximumProbability;
    }

    public double[] getProbabilities() {
        return this.probabilities;
    }

    public int getSidesAmount() {
        return sidesAmount;
    }
}
