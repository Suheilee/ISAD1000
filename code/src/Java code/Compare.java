public class Compare {
    static void compareLifePaths(int lifePath1, int lifePath2) {
        if (lifePath1 == lifePath2) {
            System.out.println("Congratulations! Your lifepaths are the same!");
        } else {
            System.out.println("Your life paths are not the same");
        }
    }

    static void checkMasterNumber(int lifePath) {
        if (lifePath == 11 || lifePath == 22 || lifePath == 33) {
            System.out.println("Your life path is a master number!");
        } else {
            System.out.println("Your life path is not a master number");
        }
    }
}
