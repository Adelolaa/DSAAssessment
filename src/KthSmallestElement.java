
import java.util.Arrays;

    public class KthSmallestElement {
        public static String kthSmallestElement(int[] nums, int k) {
            Arrays.sort(nums);
            return "k'th smallest element is" +  " " +nums[k - 1];
        }

        public static void main(String[] args) {
            System.out.println(kthSmallestElement(new int[]{7, 4, 6, 3, 9, 1},3));
        }
    }












