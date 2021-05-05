import java.util.Scanner;

public class numList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int one = 0;
        int two = 1;
        int three;
        for (int i = 0; i < num; i++) {
            three = one + two;
            System.out.print(three + " ");
            one = two;
            two = three;
        }
    }

}
