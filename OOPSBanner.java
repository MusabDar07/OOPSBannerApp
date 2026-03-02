public class OOPSBanner {
    public static void main(String[] args) {

        String[][] letters = {
            // O
            {
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
            },
            // O
            {
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
            },
            // P
            {
                " **** ",
                "*    *",
                "*    *",
                "****  ",
                "*     ",
                "*     ",
                "*     "
            },
            // S
            {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
            }
        };

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


