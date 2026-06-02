
public class LifePath {
    static int calcLifePath(int date, int month, int year) {

        // calculate individual digital roots
        int dateInt = getDigitalRoot(date);
        int monthInt = getDigitalRoot(month);
        int yearInt = getDigitalRoot(year);

        // calculate lifepath
        int sum = dateInt + monthInt + yearInt;
        int lifePath = getDigitalRoot(sum);

        // return the lifepath
        return lifePath;
    }

    static int getDigitalRoot(int day) {
        int root = 0;
        // don't reduce master numbers
        if (day == 11 || day == 22) {
            root = day;
        } else {
            // calculating the digital root; dividing the number by 10 and adding the digit
            // to the 'root' variable
            while (day > 0) {
                root = root + (day % 10);
                day /= 10;
            }
            // reducing the root to 1 digit
            while (root > 9 && !(root == 11 || root == 22 || root == 33)) {
                root = (root / 10) + (root % 10);
            }
        }
        // return the calculated digital root
        return root;
    }
}
