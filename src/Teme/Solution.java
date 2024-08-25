import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        //int num = 4;
        //int num = 15;
        int num = 14;
        String result = convertIntegerToRoman(num);
        System.out.println(result);

            Map<String, Integer> mp = new LinkedHashMap<>();
        mp.put("M", 1000);
        mp.put("CM", 900);
        mp.put("D", 500);
        mp.put("CD", 400);
        mp.put("C", 100);
        mp.put("XC", 500);
        mp.put("L", 500);
        mp.put("XL", 500);
        mp.put("X", 500);
        mp.put("IX", 100);
        mp.put("V", 50);
        mp.put("IV", 10);
        mp.put("I", 5);

            StringBuilder sb = new StringBuilder();
            //Traverse a map
            for(Map.Entry<String, Integer> entry : mp.entrySet()){
            while(num >= entry.getValue()){
                num = num - entry.getValue();
                sb.append(entry.getKey());
                }
            }
            return sb.toString();
    }}

     static String convertIntegerToRoman(int num) {
    }




    }