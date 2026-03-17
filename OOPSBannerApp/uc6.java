package OOPSBannerApp;

public class uc6 {
    public class OOPSBanner {

    static String[] getO() {
        return new String[]{
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };
    }

    static String[] getP() {
        return new String[]{
            " ****  ",
            " *   * ",
            " ****  ",
            " *     ",
            " *     "
        };
    }

    static String[] getS() {
        return new String[]{
            "  **** ",
            " *     ",
            "  ***  ",
            "     * ",
            " ****  "
        };
    }

    static void printBanner(String[]... letters) {
        for (int row = 0; row < 5; row++) {
            String[] rowParts = new String[letters.length];
            for (int col = 0; col < letters.length; col++) {
                rowParts[col] = letters[col][row];
            }
            System.out.println(String.join("  ", rowParts));
        }
    }

    public static void main(String[] args) {
        printBanner(getO(), getO(), getP(), getS());
    }
}
}
