public class MaxArea {
    public int maxArea1(int[] height) {
        int resultat = 0;
        int current = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                current = (j - i) * Math.min(height[j], height[i]);
                resultat = Math.max(resultat, current);
            }
        }
        return resultat;
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int actual = 0;

        while (left < right) {

            actual = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, actual);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }

        return maxArea;
    }

    public static void main(String[] args) {
        MaxArea max = new MaxArea();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(max.maxArea(height));
    }
}
