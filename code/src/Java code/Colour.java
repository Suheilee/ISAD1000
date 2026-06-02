public class Colour {
    static String getLuckyColour(int lifePath) {
        String colour;
        switch (lifePath) {
        case 1:
            colour = "Red";
            break;

        case 2:
            colour = "Orange";
            break;

        case 3:
            colour = "Yellow";
            break;

        case 4:
            colour = "Green";
            break;

        case 5:
            colour = "Sky Blue";
            break;

        case 6:
            colour = "Indigo";
            break;

        case 7:
            colour = "Violet";
            break;

        case 8:
            colour = "Magenta";
            break;

        case 9:
            colour = "Gold";
            break;

        case 11:
            colour = "Silver";
            break;

        case 22:
            colour = "White";
            break;

        case 33:
            colour = "Crimson";
            break;

        default:
            colour = "Invalid lifepath";
            break;
        }
        return colour;
    }
}
