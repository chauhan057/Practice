package PracticeViaVierma.CompanyPractice;

import java.util.HashMap;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str="aaditya";
        String[] arr=str.split("");

        HashMap<String,Integer> map=new HashMap<>();


        for (String c :arr) {
            if (!map.containsKey(c))
            {map.put(c,1);}
            else {map.put(c,map.get(c)+1);}
        }
        System.out.println(map);
    }
}
