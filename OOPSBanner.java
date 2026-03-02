public class OOPSBanner {

    // Class to store a character and its pattern
    static class CharPattern {
        char letter;
        String[] pattern;

        // Constructor
        CharPattern(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        // Method to get a specific row of the pattern
        String getRow(int row) {
            return pattern[row];
        }

        // Method to get the height of the pattern
        int getHeight() {
            return pattern.length;
        }
    }

    // Function to get CharPattern for each character
    static CharPattern getCharPattern(char c) {
        switch (c) {
            case 'O': return new CharPattern('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
            });
            case 'P': return new CharPattern('P', new String[]{
                " **** ",
                "*    *",
                "*    *",
                "****  ",
                "*     ",
                "*     ",
                "*     "
            });
            case 'S': return new CharPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
            });
            default: return new CharPattern(' ', new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
            });
        }
    }

    // Function to build list of CharPattern from a word
    static CharPattern[] buildPatterns(String word) {
        CharPattern[] patterns = new CharPattern[word.length()];
        for (int i = 0; i < word.length(); i++) {
            patterns[i] = getCharPattern(word.charAt(i));
        }
        return patterns;
    }

    // Function to print the banner
    static void printBanner(String word) {
        CharPattern[] patterns = buildPatterns(word);
        for (int row = 0; row < patterns[0].getHeight(); row++) {
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < patterns.length; col++) {
                if (col > 0) line.append("  ");
                line.append(patterns[col].getRow(row));
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}
