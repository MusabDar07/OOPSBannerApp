package OOPSBannerApp;

public class uc8 {
    import java.util.LinkedHashMap;
import java.util.Map;

public class OOPSBanner {

    static Map<Character, String[]> buildPatterns() {
        Map<Character, String[]> patterns = new LinkedHashMap<>();

        patterns.put('O', new String[]{
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        });

        patterns.put('P', new String[]{
            " ****  ",
            " *   * ",
            " ****  ",
            " *     ",
            " *     "
        });

        patterns.put('S', new String[]{
            "  **** ",
            " *     ",
            "  ***  ",
            "     * ",
            " ****  "
        });

        return patterns;
    }

    static void printBanner(String word, Map<Character, String[]> patterns) {
        for (int row = 0; row < 5; row++) {
            String[] rowParts = new String[word.length()];
            for (int col = 0; col < word.length(); col++) {
                char ch = word.charAt(col);
                rowParts[col] = patterns.get(ch)[row];
            }
            System.out.println(String.join("  ", rowParts));
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patterns = buildPatterns();
        printBanner("OOPS", patterns);
    }
}
}
