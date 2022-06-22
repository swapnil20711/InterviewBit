import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        System.out.println(solve("M%trWIvSAP47"));
    }

    public static int solve(String A) {
        int lc = 0, uc = 0, dc = 0;
        Pattern p = Pattern.compile(
                "[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        // Creating matcher for above pattern on our string
        Matcher m = p.matcher(A);
        if (A.length() >= 8 && A.length() <= 15) {
            if (m.find()) {
                for (char c : A.toCharArray()) {
                    if (Character.isLowerCase(c))
                        lc++;
                    if (Character.isUpperCase(c))
                        uc++;
                    if (Character.isDigit(c))
                        dc++;
                }
            }
        } else {
            return 0;
        }
        if (lc >= 1 && uc >= 1 && dc >= 1)
            return 1;
        else
            return 0;
    }
}
