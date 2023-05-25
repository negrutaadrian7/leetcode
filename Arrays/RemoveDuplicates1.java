package Arrays;

public class RemoveDuplicates1 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] myArray = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        RemoveDuplicates1 s1 = new RemoveDuplicates1();
        System.out.println(s1.removeDuplicates(myArray));
    }
}
