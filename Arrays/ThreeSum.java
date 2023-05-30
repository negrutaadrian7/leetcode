package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums, 0, nums.length - 1);

        int i = 0;
        while (i < nums.length - 2) {
            if (nums[i] > 0) { // we can't find a value to be - for the actual knowing that we have a sort
                               // array
                break;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0)
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if (sum <= 0) {
                    j++;
                    while (nums[j] == nums[j - 1] && j < k)
                        ;
                }
                if (sum >= 0) {
                    k--;
                    while (nums[k] == nums[k + 1] && j < k)
                        ;
                }
            }
            while (nums[i] == nums[++i] && i < nums.length - 2)
                ;

        }
        return result;
    }
}
