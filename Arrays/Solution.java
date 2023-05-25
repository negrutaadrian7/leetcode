package Arrays;

class Solution {
    public int strStr(String haystack, String needle) {
        // first occurence of needle in haystack or -1 if needle is not part of haystack
        int haystack_length = haystack.length();
        int needle_length = needle.length();

        int indice = 0;
        int window = 0;

        while (window <= haystack_length - needle_length) {
            if (indice == needle_length - 1) {
                return window;
            }

            if (haystack.charAt(window + indice) != needle.charAt(indice)) {
                window++;
                indice = 0;
            }

            else if (haystack.charAt(window + indice) != needle.charAt(indice)) {
                indice++;
            }

        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public int strStr3(String haystack, String needle) {
        for (int i = 0;; i++) {
            for (int j = 0;; j++) {
                if (j == needle.length()) {
                    return i;
                }
                if (i + j == haystack.length()) {
                    return -1;
                }
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.strStr3("hello", "ll"));
    }

}
