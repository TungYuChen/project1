public static int superpalindromesInRange(String left, String right) {
        long lef = Long.parseLong(left);
        long rig = Long.parseLong(right);
        long sqrtL = (long) Math.sqrt(lef);
        long sqrtR = (long) Math.sqrt(rig);
        int count = 0;
        for (long i = sqrtL; i <= sqrtR; i++) {
            if (checkPlaindrome(i)) {
                if (checkPlaindrome(i * i)) count++;
            }

        }

        return count;
    }
    private static boolean checkPlaindrome(long i) {
        char[] ch = String.valueOf(i).toCharArray();
        int len = ch.length;
        int j = len - 1;
        for (int x = 0; x < len; x++) {
            if (ch[x] != ch[j - x]) return false;
        }
        return true;
    }
