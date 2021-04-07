import java.util.*
;public class App {
    public static void main(String[] args) throws Exception {
        //map
        Map<String,Integer> myHashMap = new HashMap<>();
        myHashMap.put("tom", 2);
        myHashMap.put("john", 18);
        myHashMap.put("Adam", 1);
        System.out.println("hash map contents"+ myHashMap);

        Map<String,Integer> myTreeMap = new TreeMap<>(myHashMap);
        System.out.println("treemap contrnts"+myTreeMap);

        Map<String,Integer> myLinkedHashmap =new LinkedHashMap<>();
         myLinkedHashmap.put("tom", 2);
         myLinkedHashmap.put("john", 18);
         myLinkedHashmap.put("Adam", 1);
    }
}
