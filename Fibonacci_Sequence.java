import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> numlist = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                numlist.add(0);
            } else if (i == 1) {
                numlist.add(1);
            } else {
                numlist.add(numlist.get(i-2) + numlist.get(i-1));
            }

        }
        for (Integer n : numlist) {
            System.out.print(n + " ");
        }
    }

}
