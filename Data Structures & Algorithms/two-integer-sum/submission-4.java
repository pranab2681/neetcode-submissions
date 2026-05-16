class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        // [3, 4, 5, 6] 7
        for (int i = 0; i < nums.length; i++) { // 0
            int diff = target - nums[i]; // 4
            for (int j = 0; j < nums.length; j++) { // 1
                if (i != j) {
                    // 4 == 4
                    if (nums[j] == diff) {
                        arr[0] = i;
                        arr[1] = j;
                        return arr;
                    }
                }
            }
        }
        return arr;
    }
}
