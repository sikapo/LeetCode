package problem1;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int ii = i + 1; ii < nums.length; ii++) {
                if (nums[i] + nums[ii] == target) {
                    return new int[]{i, ii};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        int[] nums = {5, 24, 9, 27};
        int target = 14;
        int[] result = problem1.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
        }
    }
