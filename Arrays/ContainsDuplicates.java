package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> myset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (myset.contains(nums[i])) {
                return true;
            } else {
                myset.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] myArr = { 1, 2, 3 };
        ContainsDuplicates c1 = new ContainsDuplicates();
        System.out.println(c1.containsDuplicate(myArr));
    }
}
