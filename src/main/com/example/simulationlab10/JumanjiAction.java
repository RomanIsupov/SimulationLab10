package main.com.example.simulationlab10;

public enum JumanjiAction {

    ANTS,
    JUMANJI,
    BATS,
    COLLAPSING_BUILDING,
    CROCODILE,
    DISEASE,
    DISINTEGRATION,
    EARTHQUAKE,
    ELEPHANT,
    HAILSTORM,
    HIPPOPOTAMUS,
    HYENAS,
    JAGUAR,
    LEECHES,
    LION,
    MONKEYS,
    MOSQUITO,
    MONSOON,
    PELICAN,
    PIRANHAS,
    POD;

    public static JumanjiAction fromInteger(int number) {
        return switch (number) {
            case 11 -> ANTS;
            case 12 -> JUMANJI;
            case 13 -> BATS;
            case 14 -> COLLAPSING_BUILDING;
            case 15 -> CROCODILE;
            case 16 -> DISEASE;
            case 22 -> DISINTEGRATION;
            case 23 -> EARTHQUAKE;
            case 24 -> ELEPHANT;
            case 25 -> HAILSTORM;
            case 26 -> HIPPOPOTAMUS;
            case 33 -> HYENAS;
            case 34 -> JAGUAR;
            case 35 -> LEECHES;
            case 36 -> LION;
            case 44 -> MONKEYS;
            case 45 -> MOSQUITO;
            case 46 -> MONSOON;
            case 55 -> PELICAN;
            case 56 -> PIRANHAS;
            case 66 -> POD;
            default -> null;
        };
    }

    public static String getPhrase(int number) {
        return switch (number) {
            case 11 -> """
                    They march and eat
                    And march and eat;
                    If I were you
                    I'd watch my feet.""";
            case 12 -> "JUMANJI";
            case 13 -> """
                    At night they fly;
                    You better run.
                    These winged things
                    Are not much fun.""";
            case 14 -> """
                    Splintered rafters
                    All around;
                    Duck them or
                    They'll pin you down.""";
            case 15 -> """
                    Like a great white shark
                    Down the Nile;
                    Beware the 25-foot
                    Crocodile.""";
            case 16 -> """
                    Jungle plague germs
                    There's a melody,
                    You can't see them
                    But they're deadly.""";
            case 22 -> """
                    Don't stop the game
                    You realize.
                    Or one of you
                    May vaporize!""";
            case 23 -> """
                    You're almost there,
                    With much at stake;
                    But now the ground
                    Begins to shake.""";
            case 24 -> """
                    Elephants charging!
                    You must confess,
                    A freight train's damage
                    Would be far less.""";
            case 25 -> """
                    Big as fists
                    These balls of ice;
                    Through umbrellas
                    They will slice.""";
            case 26 -> """
                    A cavernous yawn
                    With tusks of course,
                    Be sure to skirt
                    This river horse.""";
            case 33 -> """
                    Their boisterous laughing
                    Does provoke;
                    in this adventure
                    They are no joke.""";
            case 34 -> """
                    Feline spots
                    In the jungle blend;
                    Be cautious of her
                    She's not your friend.""";
            case 35 -> """
                    Crawling and slithering
                    Up from the flood;
                    Come thousands of leeches
                    To suck your blood.""";
            case 36 -> """
                    His fangs are sharp
                    He likes your taste;
                    Your party better
                    Move posthaste.""";
            case 44 -> """
                    This will not be
                    An easy mission;
                    Monkeys slow
                    The expedition.""";
            case 45 -> """
                    A tiny bite
                    Can make you itch,
                    Make you sneeze,
                    Make you twitch.""";
            case 46 -> """
                    Every month
                    At the quarter moon,
                    There is a monsoon
                    In your lagoon.""";
            case 55 -> """
                    With six-foot wingspan,
                    Sound of swish;
                    It thinks the gameboard
                    Is a fish.""";
            case 56 -> """
                    Raging waters
                    Ebb and flow;
                    Beware piranhas
                    Down below.""";
            case 66 -> """
                    Enormous and yellow
                    These flowers grew;
                    Their flesh-eating blossoms
                    Are hungry for you!""";
            default -> null;
        };
    }
}
