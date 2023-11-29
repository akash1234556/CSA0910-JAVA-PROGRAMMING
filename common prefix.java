public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings1 = {"flower", "flow", "flight"};
        String[] strings2 = {"dog", "racecar", "car"};

        System.out.println("Longest Common Prefix 1: " + longestCommonPrefix(strings1));
        System.out.println("Longest Common Prefix 2: " + longestCommonPrefix(strings2));
    }

    public static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        // Start with the first string as the initial common prefix
        String prefix = strings[0];

        for (int i = 1; i < strings.length; i++) {
            int j = 0;
            while (j < prefix.length() && j < strings[i].length() && prefix.charAt(j) == strings[i].charAt(j)) {
                j++;
            }

            // Update the common prefix based on the comparison
            prefix = prefix.substring(0, j);

            // If the prefix becomes empty, there is no common prefix
            if (prefix.equals("")) {
                break;
            }
        }

        return prefix;
    }
}
