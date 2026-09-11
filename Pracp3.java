import java.util.Scanner;
public class Pracp3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
          int size = sc. nextInt();
        int num [] = new int [size];
      


        System.out.println("Enter the array");
        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();
    }
     for(int i = 0; i < num.length-1; i++){
        if(num[i] > num[i + 1]){
            System.out.println("Not in Ascending Order");
            break;
        }
         
     } 
     System.out.println("Ascending Order");  

        sc.close();
    }
}