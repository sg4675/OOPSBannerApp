import java.util.*;

public class UC8 {

    public static void main(String[] args) {

        // Create Map to store patterns of characters
        Map<Character, String[]> map = new HashMap<>();

        // Pattern for O
        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        // Pattern for P
        map.put('P', new String[]{
            "***** ",
            "*    *",
            "***** ",
            "*      ",
            "*      "
        });

        // Pattern for S
        map.put('S', new String[]{
            " ***** ",
            " *      ",
            " ***** ",
            "     *",
            "***** "
        });

        String word = "OOPS";

        for (int i = 0; i < 5; i++) {   // 6 rows
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                System.out.print(map.get(ch)[i] + "   ");
            }
            System.out.println();
        }
    }
}