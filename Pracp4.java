import java.util.Scanner;
public class Pracp4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int num [][] = new int [rows][cols];

        System.out.println("Enter the array");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Target number");
        int target = sc.nextInt();
            
         for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
              if (num[i][j] == target)
              System.out.println("The target number is at index " + i + "," + j);
    }
  }
    sc.close();
  }
}

