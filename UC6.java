public class UC6 {
    public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }
    public static String[] getPPattern() {
        return new String[]{
                " ****** ",
                "*      *",
                "*      *",
                " ****** ",
                "*       ",
                "*       ",
                "*       "
        };
    }
    public static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String arrays to hold patterns for each letter
        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print each line of the banner
        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(
                    oPattern1[i] + "   " +
                    oPattern2[i] + "   " +
                    pPattern[i] + "   " +
                    sPattern[i]
            );
        }
    }
}

