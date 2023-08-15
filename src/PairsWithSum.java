import java.util.*;

public class PairsWithSum {
    public static List<List<Integer>> findPairsWithSum(int[] nums, int target) {
        Map<Integer, Integer> numCount = new HashMap<>();
        List<List<Integer>> pairs = new ArrayList<>();

        for (int num : nums) {
            int complement = target - num;
            if (numCount.containsKey(complement) && numCount.get(complement) > 0) {
                pairs.add(Arrays.asList(num, complement));
                numCount.put(complement, numCount.get(complement) - 1);
            } else {
                numCount.put(num, numCount.getOrDefault(num, 0) + 1);
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] nums1 = {8, 7, 2, 5, 3, 1};
        int target1 = 10;
        List<List<Integer>> pairs1 = findPairsWithSum(nums1, target1);
        if (!pairs1.isEmpty()) {
            for (List<Integer> pair : pairs1) {
                System.out.println("Pair found: " + pair);
            }
        } else {
            System.out.println("Pair not found");
        }

        int[] nums2 = {5, 2, 6, 8, 1, 9};
        int target2 = 12;
        List<List<Integer>> pairs2 = findPairsWithSum(nums2, target2);
        if (!pairs2.isEmpty()) {
            for (List<Integer> pair : pairs2) {
                System.out.println("Pair found: " + pair);
            }
        } else {
            System.out.println("Pair not found");
        }
    }
}
