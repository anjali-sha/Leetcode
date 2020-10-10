class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map < Integer, Integer > map = new HashMap < > ();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);

        }



        return result;
    }



}
