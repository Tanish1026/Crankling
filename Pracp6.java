import java.util.Scanner;
public class Pracp6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int size = sc.nextInt();
        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
            count += names[i].length();
        }
        
        System.out.println(count);
    }
}

