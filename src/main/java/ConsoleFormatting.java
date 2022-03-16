public interface ConsoleFormatting {

    String ANSI_RESET = "\u001B[0m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_GREEN = "\u001b[32m";
    String ANSI_RED = "\u001b[31m";
    String GREEN_UNDERLINED = "\033[4;32m";
    String YELLOW_UNDERLINED = "\033[4;33m";
    String PURPLE_BOLD = "\033[1;35m";

    static void printInYellow(String s) {
        System.out.println(YELLOW_UNDERLINED + s + ANSI_RESET);
    }

    static void printInRed(String s) {
        System.out.println(ANSI_RED + s + ANSI_RESET);
    }
}
