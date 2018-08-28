import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "  add" +
                "  ";
        System.out.println(listToString(longestWord(sentence)));
    }

    static List<String> longestWord(String string) {
        String sentence = string.replaceAll("[^a-zA-Z\\s]", "");
        String[] array = sentence.split(" ");
        String longestString = "";
        List<String> wordList = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > longestString.length()) {
                wordList.clear();
                longestString = array[i];
                wordList.add(array[i] + ": " + array[i].length());
            } else if (array[i].length() == longestString.length()) {
                wordList.add(array[i] + ": " + array[i].length());
            }
        }

        return wordList;
    }

    static String listToString(List<String> list) {
        StringBuilder string = new StringBuilder();

        for(String word : list) {
            string.append(word);
            string.append("\n");
        }
        return string.toString();
    }
}
