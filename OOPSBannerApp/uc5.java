public class uc5 {
    public class OOPSBanner {
    public static void main(String[] args) {

        String[][] oops = {
            {"  ***  ", "  ***  ", " ****  ", "  **** "},
            {" *   * ", " *   * ", " *   * ", " *     "},
            {" *   * ", " *   * ", " ****  ", "  ***  "},
            {" *   * ", " *   * ", " *     ", "     * "},
            {"  ***  ", "  ***  ", " *     ", " ****  "}
        };

        for (int row = 0; row < 5; row++) {
            System.out.println(String.join("  ", oops[row][0], oops[row][1], oops[row][2], oops[row][3]));
        }
    }
}
}
