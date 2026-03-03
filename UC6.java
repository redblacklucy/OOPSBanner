public class UC6 {
    static String[] getO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }
    static String[] getP() {
        return new String[] {
            "***** ",
            "*    *",
            "***** ",
            "*     ",
            "*     "
        };
    }
    static String[] getS() {
        return new String[] {
            " *****",
            "*     ",
            " *****",
            "     *",
            "***** "
        };
    }

    public static void main(String[] args) {
        String[][] banner = {
            getO(), getP(), getP(), getS()
        };
        for (int line = 0; line < 5; line++) { 
            for (String[] letter : banner) {
                System.out.print(letter[line] + "  "); 
            }
            System.out.println();
        }
    }
}