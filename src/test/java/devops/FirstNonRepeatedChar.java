package devops;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static Character findFirstNonRepeatedChar(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // All characters are repeated
    }

    public static void main(String[] args) {
        String input = "aasdfgh";
        Character result = findFirstNonRepeatedChar(input);
        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
