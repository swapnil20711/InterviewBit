package LeetCode.Array;

public class FinalValueAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations = new String[]{"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String s : operations) {
            if (s.trim().equals("++X") || s.trim().equals("X++"))
                ++X;
            if (s.trim().equals("X--") || s.trim().equals("--X"))
                --X;
        }
        return X;
    }
}
