public class StringInversion {
    public static void main(String[] args) {
        System.out.println(solve("InterviewBit"));
    }

    public static String solve(String A) {
        String res = "";
        char[] input = A.toCharArray();
        for (int c : input) {
            if (c >= 'A' && c <= 'Z')
                res += (char) (c + 32);
            else
                res += (char) (c - 32);
        }
        return res;
    }
}
