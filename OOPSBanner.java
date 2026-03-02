public class OOPSBanner {

    // Function to get pattern for each character
    static String[] getPattern(char c) {
        switch (c) {
            case 'O': return new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
            };
            case 'P': return new String[]{
                " **** ",
                "*    *",
                "*    *",
                "****  ",
                "*     ",
                "*     ",
                "*     "
            };
            case 'S': return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
            };
            default: return new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
            };
        }
    }

    // Function to build 2D array of patterns from a word
    static String[][] buildPatterns(String word) {
        String[][] patterns = new String[word.length()][];
        for (int i = 0; i < word.length(); i++) {
            patterns[i] = getPattern(word.charAt(i));
        }
        return patterns;
    }

    // Function to print the banner
    static void printBanner(String word) {
        String[][] patterns = buildPatterns(word);
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < patterns.length; col++) {
                if (col > 0) line.append("  ");
                line.append(patterns[col][row]);
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}


