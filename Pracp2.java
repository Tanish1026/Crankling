import java.util.*;
public class Pracp2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] names = new int[size];

        for (int i = 0; i < size; i++) {
            names[i] = sc.nextInt();
        }

        int min = names[0];
        int max = names[0];

        for (int i = 1; i < names.length; i++) {
            if (names[i] > max) {
                max = names[i];
            }
            if (names[i] < min) {
                min = names[i];
            }
        }

        System.out.println("the max number is " + max);
        System.out.println("the min number is " + min);
    }
}
