class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        if (s.equals(" ")) {
            return 1;
        }
        int base = 0;
        int count = 1;
        int max = 1;


        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            for (int j = base; j < i; j ++) {
                
                if (chars[j] == chars[i]) {
                    count = (i - j);
                    base = j + 1;
                    break;
                }
                if (j == i - 1) {
                    count++;
                }
                if (count > max) {
                    max = count;
                }

            }
            
        }


        return max;
    }
}
