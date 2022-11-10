import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        tooLongCheck();
        arrivalGeneralCheck();
        addOrSubtractCheck();
    }

    public static String tooLong(String word) {
        // code here
        return "";
    }

    public static int arrivalGeneral(int[] soldiers) {
        // code here
        return 99999;
    }

    public static int addOrSubtract(int a, int b) {
        // code here
        return 99999;
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
