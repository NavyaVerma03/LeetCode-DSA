class Solution {
    public int prefixCount(String[] words, String pref) {

        int count = 0;

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            if (word.length() < pref.length()) {
                continue;
            }

            boolean isPrefix = true;

            for (int j = 0; j < pref.length(); j++) {

                if (word.charAt(j) != pref.charAt(j)) {
                    isPrefix = false;
                    break;
                }
            }

            if (isPrefix) {
                count++;
            }
        }

        return count;
    }
}