class Solution {
       public static String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int len = ch.length;


        for (int i = 0; i < len; i++) {
            int blockLen = len - i;
            for (int start = 0; start < len; start++) {
                int countS = start;
                int countF = start + blockLen - 1;
                if (countF >= len) break;
                while (ch[countS] == ch[countF]) {
                    countS++;
                    countF--;
                    if (countS >= countF) {
                        char[] result = new char[blockLen];
                        System.arraycopy(ch, start, result, 0, blockLen);
                        return String.valueOf(result).trim();

                    }

                }


                }
            }


        return String.valueOf(ch[0]);
    }
}
