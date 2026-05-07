class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            int n = nums[i];

            if (freqMap.containsKey(n)) {
                freqMap.remove(n);
            } else {
                freqMap.put(n, 1);
            }
        }

        System.out.println(freqMap);

        return freqMap.keySet().stream().findFirst().get();

    }
}
