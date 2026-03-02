import java.util.*;

public class OOPSBanner {

    // Build and return the pattern map
    static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new LinkedHashMap<>();

        map.put('O', new String[]{
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        });
        map.put('P', new String[]{
            " **** ",
            "*    *",
            "*    *",
            "****  ",
            "*     ",
            "*     ",
            "*     "
        });
        map.put('S', new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });
        map.put(' ', new String[]{
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        });

        return map;
    }

    // Lookup pattern for a character from the map
    static String[] getPattern(char c, Map<Character, String[]> patternMap) {
        return patternMap.getOrDefault(c, patternMap.get(' '));
    }

    // Build patterns array for the word
    static String[][] buildPatterns(String word, Map<Character, String[]> patternMap) {
        String[][] patterns = new String[word.length()][];
        for (int i = 0; i < word.length(); i++) {
            patterns[i] = getPattern(word.charAt(i), patternMap);
        }
        return patterns;
    }

    // Print the banner for the given word
    static void printBanner(String word, Map<Character, String[]> patternMap) {
        String[][] patterns = buildPatterns(word, patternMap);
        int height = patterns[0].length;
        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < patterns.length; col++) {
                if (col > 0) line.append("  ");
                line.append(patterns[col][row]);
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        printBanner("OOPS", patternMap);
    }
}
