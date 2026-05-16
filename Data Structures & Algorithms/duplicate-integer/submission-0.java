class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;

        // 1,2,3,3
        for (int i = 0; i < len; i++) {
            int number = nums[i];

            for (int j = i + 1; j < len; j++) {
                int n = nums[j];

                if (n == number) {
                    return true;
                }
            }
        }
        return false;
    }
}