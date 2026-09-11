import java.util.Scanner;
public class Pracp8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String names = sc.next();
        String result = "";

        for(int i = 0; i<names.length();i++){
            if(names.charAt(i) == '@'){
                result += names.substring(0,i);
            }
        }System.out.println("The username is "+result);
    }
}
