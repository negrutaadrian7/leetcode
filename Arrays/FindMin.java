package Arrays;

public class FindMin {
    public int findMin(int[] nums) {
        int element = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < element) {
                return nums[i];
            }
        }
        return element;
    }

    public static void main(String[] args) {
        FindMin f = new FindMin();
        int[] arr = { 11, 13, 15, 17 };
        System.out.println(f.findMin(arr));
    }
}
