package Arrays;

import java.util.HashMap;
import java.util.Map;

class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(target - nums[i])) {
                res[1] = i;
                res[0] = myMap.get(target - nums[i]);
                return res;
            }

            else {
                myMap.put(nums[i], i); // adaugam val si index ul
            }
        }
        return res;
    }
}