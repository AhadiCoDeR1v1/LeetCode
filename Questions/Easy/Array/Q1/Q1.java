package Array.Q1;

class Solution {
    public static void main(String[] args) {
        int [] nums = {3,2,3}; int target = 6;

        int [] array=twoSum(nums, target);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }
}
