import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // find the largest number

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = b;
        }

        int max2 = Math.max(c , Math.max(a, b));
        System.out.println(max);
        System.out.println(max2);
    }
}
