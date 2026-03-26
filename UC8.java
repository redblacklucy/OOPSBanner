import java.util.HashMap;
import java.util.Map;

public class UC8 {
    public static void printBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

          
            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                } else {
                    line.append("?????  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        
        Map<Character, String[]> patternMap = new HashMap<>();

        
        patternMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        patternMap.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        patternMap.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });

        
        String word = "OOPS";

        
        printBanner(word, patternMap);
    }
}