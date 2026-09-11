import java.util.Scanner;
public class Arrays{
    public static void main(String args[]){
        int num [] = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Target number");
        int target = sc.nextInt();


        System.out.println("Enter the array");
        for(int i = 0; i < 5; i++){
            num[i] = sc.nextInt();
        

        if (target == num[i])
            System.out.println("The target number is at index " + i);
    }

        sc.close();
    }
}