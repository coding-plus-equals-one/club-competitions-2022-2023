import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        tooLongCheck();
        arrivalGeneralCheck();
        addOrSubtractCheck();
    }

    public static String tooLong(String word) {
        if (word.length() > 10)
            return "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
        return word;
    }

    public static int arrivalGeneral(int[] soldiers) {
        int minInd = 0;
        int maxInd = 0;
        for (int i = 0; i < soldiers.length; i++) {
            if (soldiers[i] <= soldiers[minInd])
                minInd = i;
            else if (soldiers[i] > soldiers[maxInd])
                maxInd = i;
        }
        int retVal = maxInd + soldiers.length - 1 - minInd;
        if (maxInd > minInd)
            retVal--;
        return retVal;
    }

    public static int addOrSubtract(int a, int b) {
        if (a % 2 != b % 2) {
            if (a < b)
                return 1;
            else
                return 2;
        }
        else {
            if (a < b)
                return 2;
            else if (a > b)
                return 1;
            else
                return 0;
        }
    }

    // START OF WATERJUG SOLUTION
    ArrayList<Integer> divisors = new ArrayList<Integer>();

    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity)
    {
        if (jug1Capacity + jug2Capacity < targetCapacity)
            return false;
        divisors.add(jug1Capacity);
        divisors.add(jug2Capacity);

        get_mod(jug1Capacity, jug2Capacity);

        for (int i : divisors)
        {
            if (targetCapacity%i == 0)
                return true;
        }
        return false;
    }
    public void get_mod(int a, int b)
    {
        int value;
        if (a>b)
            value = a % b;
        else
            value = b % a;
        if (value != 0 && !divisors.contains(value))
        {
            divisors.add(value);
            get_mod(value, a);
            get_mod(value, b);
        }

    }

    public static void tooLongCheck()
    {
        HashMap<String, Integer> ans1 = new HashMap<String, Integer>();
        ans1.put("word", 3655434);
        ans1.put("localization", 3266115);
        ans1.put("internationalization", 3176990);
        ans1.put("pneumonoultramicroscopicsilicovolcanoconiosis", 3388260);
        for (String i : ans1.keySet())
        {
            if(tooLong(i).hashCode() != ans1.get(i)) {
                System.out.println("Q1: Failed Case: " + i);
                return;
            }
        }
        System.out.println("Question 1 Completed!");
    }

    public static void arrivalGeneralCheck()
    {
        HashMap<int[], Integer> ans1 = new HashMap<int[], Integer>();
        ans1.put(new int[]{1,1,1}, 48);
        ans1.put(new int[]{1,1,2}, 50);
        ans1.put(new int[]{90,10,58,31,63,40,76}, 53);
        ans1.put(new int[]{1,1}, 48);
        ans1.put(new int[]{1,2}, 49);
        ans1.put(new int[]{1,2,1}, 49);
        ans1.put(new int[]{2,1}, 48);
        ans1.put(new int[]{10,10,58,31,63,40,76}, 1567);
        ans1.put(new int[]{2,2,1}, 48);
        ans1.put(new int[]{10,10,58,1,90,40,76}, 54);
        ans1.put(new int[]{2,1,1}, 48);
        ans1.put(new int[]{33,44,11,22}, 50);
        ans1.put(new int[]{10,10,58,31,63,76,40}, 57);
        for (int[] i : ans1.keySet())
        {
            String iStr = "{" + i[0];
            for (int j = 1; j < i.length; j++)
                iStr += "," + i[j];
            iStr += "}";
//            System.out.println("ans1.put(new int[]" + iStr + ", " + ("" + arrivalGeneral(i)).hashCode() + ");");
//            System.out.println(arrivalGeneral(i));
            if(("" + arrivalGeneral(i)).hashCode() != ans1.get(i)) {
                System.out.println("Q2: Failed Case: " + iStr);
                return;
            }
        }
        System.out.println("Question 2 Completed!");
    }

    public static void addOrSubtractCheck()
    {
        HashMap<int[], Integer> ans1 = new HashMap<int[], Integer>();
        ans1.put(new int[]{28,9}, 50);
        ans1.put(new int[]{90,4}, 49);
        ans1.put(new int[]{31,25}, 49);
        ans1.put(new int[]{7,26}, 49);
        ans1.put(new int[]{3,24}, 49);
        ans1.put(new int[]{42,42}, 48);
        ans1.put(new int[]{51,51}, 48);
        ans1.put(new int[]{20,5}, 50);
        ans1.put(new int[]{2,8}, 50);
        ans1.put(new int[]{15,23}, 50);
        for (int[] i : ans1.keySet())
        {
            String iStr = "" + i[0];
            for (int j = 1; j < i.length; j++)
                iStr += "," + i[j];
//            System.out.println("ans1.put(new int[]{" + iStr + "}, " + ("" + addOrSubtract(i[0], i[1])).hashCode() + ");");
//            System.out.println(addOrSubtract(i[0], i[1]));
            if(("" + addOrSubtract(i[0], i[1])).hashCode() != ans1.get(i)) {
                System.out.println("Q3: Failed Case: " + i[0] + " " + i[1]);
                return;
            }
        }
        System.out.println("Question 3 Completed!");
    }

}
