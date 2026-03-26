public class UC7 {

    
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        
        public String[] getPattern() {
            return pattern;
        }

        
        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {

        
        CharacterPattern O = new CharacterPattern('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[] {
            "***** ",
            "*    *",
            "***** ",
            "*     ",
            "*     "
        });

        CharacterPattern S = new CharacterPattern('S', new String[] {
            " *****",
            "*     ",
            " *****",
            "     *",
            "***** "
        });

        
        CharacterPattern[] bannerWord = {O, P, P, S};

        
        for (int line = 0; line < 5; line++) { 
            for (CharacterPattern letter : bannerWord) {
                System.out.print(letter.getPattern()[line] + "  "); 
            }
            System.out.println();
        }
    }
}