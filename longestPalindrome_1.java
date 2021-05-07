class Solution {
    public static String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        char[] temp = new char[ch.length];
        temp[0] = ch[0];
        int count = 1;
        for (int i = 0; i < ch.length; i++) {
            for (int j = ch.length -1; j > i; j--) {
                if (j - i + 1 <= count) {
                    break;
                }
                int start = i;
                int end = j;
                while (ch[start] == ch[end]) {
                    start++;
                    end--;
                    if (start >= end) {
                        if (j - i + 1 > count) {
                            count = j- i + 1;
                            System.arraycopy(ch, i, temp, 0, count);
                        }
                        break;
                    }
                }
            }
        }

        return String.valueOf(temp).trim();

    }
}
