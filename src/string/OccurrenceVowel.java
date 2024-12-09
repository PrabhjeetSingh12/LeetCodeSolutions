package string;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceVowel {
    public void vowel(String str){
        Map<Character,Integer> map = new HashMap<>();

        map.put('a',0);
        map.put('b',0);
        map.put('c',0);
        map.put('d',0);
        map.put('e',0);

        String s = str.toLowerCase();

        char arr[] = s.toCharArray();

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){

                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        OccurrenceVowel obj = new OccurrenceVowel();
        obj.vowel("HelloaA Universe"); // Test with a mixed-case string
    }


}
