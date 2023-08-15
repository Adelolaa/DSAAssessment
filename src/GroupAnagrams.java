import java.util.ArrayList;
import java.util.*;




    public class GroupAnagrams {
        public static List<List<String>> groupAnagrams(String[] words) {
            Map<String, List<String>> anagrams = new HashMap<>();

            for (String word : words) {
                char[] charArray = word.toCharArray();
                Arrays.sort(charArray);
                String sortedWord = new String(charArray);

                anagrams.putIfAbsent(sortedWord, new ArrayList<>());
                anagrams.get(sortedWord).add(word);
            }

            return new ArrayList<>(anagrams.values());
        }

        public static void main(String[] args) {
            String[] wordArray = {"actors", "costar", "altered", "related", "auctioned", "education", "aspired", "despair", "mastering", "streaming"};
            List<List<String>> result = groupAnagrams(wordArray);

            for (List<String> group : result) {
                System.out.println(group);
            }
        }
    }


