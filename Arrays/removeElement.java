package Arrays;

public class removeElement {
    public int removeElement(int[] nums, int val) {
        // the first k elements contain the elements which are not equal to val.
        int k = 0; // indice where we'll replace in actual list
        int i = 0; // iterate all the nums elements
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
                i++;
            } else {
                i++;
            }
        }
        return k;
    }
}
