package workshop03;

public class LCD {

    private static final String NEW_LINE = "\n";
    String[] line1 = { " _ ", "   " };
    String[] line2 = { "| |", "  |" };
    String[] line3 = { "|_|", "  |" };

    public String show(int number) {
        return buildByNumber(number);
    }

    public String buildByNumber(int number) {
        String temp = String.valueOf(number);
        String tempLine1 = "";
        String tempLine2 = "";
        String tempLine3 = "";
        for (int i = 0; i < temp.length(); i++) {
            int digit = temp.charAt(i) - 48;
            tempLine1 += line1[digit];
            tempLine2 += line2[digit];
            tempLine3 += line3[digit];
        }
        return tempLine1 + NEW_LINE + tempLine2 + NEW_LINE + tempLine3 + NEW_LINE;
    }

}
