import java.io.*;
import java.util.*;
public class LevelOrderTraversal {


    public class Solution {
        static int maxXOR = 0;

        static void backtrack(int index, int[] nums, int k, List<Integer> current) {
            if (current.size() == k) {
                int xor = 0;
                for (int num : current) {
                    xor ^= num;
                }
                maxXOR = Math.max(maxXOR, xor);
                return;
            }

            for (int i = index; i < nums.length; i++) {
                current.add(nums[i]);
                backtrack(i + 1, nums, k, current);
                current.remove(current.size() - 1);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            backtrack(0, arr, k, new ArrayList<>());
            System.out.print(maxXOR);
        }
    }

}
