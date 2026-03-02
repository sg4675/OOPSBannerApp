public class UC7 {

    // ===== Static Utility Methods =====
    static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    static String[] getP() {
        return new String[]{
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        };
    }

    static String[] getS() {
        return new String[]{
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    // ===== Inner Class =====
    class InnerPrinter {

        void printOOPS() {

            String[] o1 = getO();
            String[] o2 = getO();
            String[] p  = getP();
            String[] s  = getS();

            for (int i = 0; i < 5; i++) {
                System.out.println(o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i]);
            }
        }
    }

    // ===== Main Method =====
    public static void main(String[] args) {

        UC7 outer = new UC7();
        UC7.InnerPrinter inner = outer.new InnerPrinter();

        inner.printOOPS();
    }
}