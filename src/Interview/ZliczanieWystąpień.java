package Interview;

import java.util.HashMap;
import java.util.Map;

public class ZliczanieWystąpień {
    public static void main(String[] args) {
        liczWystąpienia(new int[] {1,3});
    }

    public static void liczWystąpienia(int[] numbers) {
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int i=0; i<numbers.length; i++) {
            if(occurences.containsKey(numbers[i])) {
                Integer value = occurences.get(numbers[i]);
                occurences.put(numbers[i],value+1);
            } else {
                occurences.put(numbers[i],1);
            }
        }
        for (Integer key : occurences.keySet()){
            System.out.println("Liczba " + key + " występuje " + occurences.get(key));
        }

        System.out.println(" ");

        System.out.println("Ilość elementów w mapie: " +occurences.size());

    }
}
