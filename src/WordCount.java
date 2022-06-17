public class WordCount {
    public static void main(String[] args) {
        System.out.println(solve("pxgacrtzu   fgtmxgrmnvzdkulqtheucvyyjv cbvnzfcckxvvlprt "));
    }

    public static int solve(String A) {
        int emptyWords = 0;
        String[] chars = A.trim().split(" ");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i].trim().isEmpty())
                emptyWords++;

        }
        return chars.length - emptyWords;
    }
}
