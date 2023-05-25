package Arrays;

class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int element : nums) {
            if (i == 0 || element > nums[i - 1]) {
                nums[i++] = element;
            }
        }
        return i;
    }
}