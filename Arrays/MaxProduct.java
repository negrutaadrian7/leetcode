package Arrays;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int answer = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int temp = max;

            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > answer) {
                answer = max;
            }
        }
        return answer;
    }

    public int maxProduct2(int[] nums) {

        int max = nums[0], min = nums[0], ans = nums[0];
        int n = nums.length;

        for (int i = 1; i < n; i++) {

            // Swapping min and max
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            ans = Math.max(ans, max);
        }

        return ans;

    }

    public static void main(String[] args) {
        MaxProduct m1 = new MaxProduct();
        int[] arr = { -2, 0, -1 };
        System.out.println(m1.maxProduct(arr));
    }

}
