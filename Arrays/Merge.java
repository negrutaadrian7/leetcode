package Arrays;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1; // dernier element de la premiere liste
        int tail2 = n - 1; // dernier element de la deuxieme liste
        int finished = m + n - 1; // derniere element de la liste 1 y compris les 0

        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) {
            nums1[finished--] = nums2[tail2--];
        }

    }

    public static void main(String[] args) {
        Merge s1 = new Merge();
    }
}
