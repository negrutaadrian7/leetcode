import java.util.HashMap;
import java.util.Map;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix;
            prefix = nums[i] * prefix;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * postfix;
            postfix = postfix * nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] myArr = { 1, 2, 3, 4 };
        ProductExceptSelf s1 = new ProductExceptSelf();
        int[] res = s1.productExceptSelf(myArr);
        for (int n : res) {
            System.out.println(n);
        }
    }
}
