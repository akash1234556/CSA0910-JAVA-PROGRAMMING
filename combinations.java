import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        generateCombinations(result, current, 1, n, k);
        return result;
    }

    private static void generateCombinations(List<List<Integer>> result, List<Integer> current, int start, int n, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            generateCombinations(result, current, i + 1, n, k - 1);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>> combinations = combine(n, k);

        System.out.println("All combinations of " + k + " numbers chosen from the range [1, " + n + "]:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
