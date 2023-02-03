import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
        // Array
        String[] array = new String[3];
        array[0] = "Serkan";
        array[1] = "Serkan1";
        array[2] = "Serkan2";
        int[] array1 = new int[2];
        array1[0] = 20;
        int[] r1 = { 10, 20 };

        // Lists
        ArrayList<String> ArList = new ArrayList<>();
        ArList.add(0, "merhaba");
        ArList.add("Dünya");
        // System.out.println(ArList.get(1)); to print terminal

        // Set
        HashSet<String> MySet = new HashSet<>();
        MySet.add("Serkan");
        int size = MySet.size();

        // Hashmap
        HashMap<String, String> myhashMap = new HashMap<>();
        myhashMap.put("ad", "Serkan");
        String getValue = myhashMap.get("ad");
        // System.out.println(getValue);
        HashMap<String, Integer> mySecondMap = new HashMap<>();
        mySecondMap.put("age", 20);
        System.out.println(mySecondMap.get("age"));

    }
}
