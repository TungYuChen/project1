import java.util.Scanner;

public class SuperPalindrome_2 {
    public static int superpalindromesInRange(String left, String right) {
        long lef = Long.parseLong(left);
        long rig = Long.parseLong(right);
        long sqrtL = (long) Math.sqrt(lef);
        long sqrtR = (long) Math.sqrt(rig);
        int count = 0;
        for (long i = sqrtL; i <= sqrtR; i++) {
            if (checkPlaindrome(i)) count++;
        }

        return count;
    }
    private static boolean checkPlaindrome(long i) {
        char[] ch = String.valueOf(i).toCharArray();
        int len = ch.length;
        int right = len - 1;
        int left = 0;
        while (left < right) {
            if (ch[left] != ch[right]) return false;
            left++;
            right--;
        }
        long i2 = i * i;
        char[] ch1 = String.valueOf(i2).toCharArray();
        int len1 = ch1.length;
        int right1 = len1 - 1;
        int left1 = 0;
        while (left1 < right1) {
            if (ch1[left1] != ch1[right1]) return false;
            left1++;
            right1--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String left = sc.nextLine();
        String right = sc.nextLine();
        System.out.println(superpalindromesInRange(left, right));
    }
}
