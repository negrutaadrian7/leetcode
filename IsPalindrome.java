package TwoPointers;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;

        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            // if either of them is not alphanumeric then the code increments or decrements
            // the start and the end
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            }

            else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome s1 = new IsPalindrome();
        System.out.println(s1.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
