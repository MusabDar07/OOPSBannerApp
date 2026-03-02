public class OOPSBannerApp {
    public static void main(String[] args) {
        public class OOPSBanner {
    public static void main(String[] args) {
        System.out.println(String.jpublic class OOPSBanner {
    public static void main(String[] args) {

        String[] O = {
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };

        String[] P = {
            " **** ",
            "*    *",
            "*    *",
            "****  ",
            "*     ",
            "*     ",
            "*     "
        };

        String[] S = {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };

        String[][] letters = { O, O, P, S };

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < letters.length; col++) {
                if (col > 0) line.append("  ");
                line.append(letters[col][row]);
            }
            System.out.println(line);
        }
    }
}
```

