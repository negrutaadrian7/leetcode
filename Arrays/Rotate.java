package Arrays;

public class Rotate {

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void main(String[] args) {
        Rotate s1 = new Rotate();
        int[] myArr = { 1, 2, 3, 4, 5, 6, 7 };
        s1.rotate(myArr, 3);
        for (int n : myArr) {
            System.out.println(n);
        }

    }

}
