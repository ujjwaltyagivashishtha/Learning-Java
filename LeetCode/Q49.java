import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49 {
  public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    } 

    public static void main(String[] args) {
        Q49 q = new Q49();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(q.groupAnagrams(strs)); // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    }
}
