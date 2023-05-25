package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Majority {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int resultat = 0;
        for (int num : nums) {
            if (!myMap.containsKey(num)) {
                myMap.put(num, 1);
            } else {
                myMap.put(num, myMap.get(num) + 1);
            }

            if (myMap.get(num) > nums.length / 2) {
                resultat = num;
                break;
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        Majority s1 = new Majority();
        int[] elements = { 3, 2, 3 };
        System.out.println(s1.majorityElement(elements));
    }
}
