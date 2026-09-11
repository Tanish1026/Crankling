import java.util.Scanner;
public class Pracp7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String names = sc.next();
        String result = "";

        for(int i = 0;i < names.length();i++){
            if(names.charAt(i) == 'e'){
                result += "i";
            }else{
                result += names.charAt(i);
            }
           
        } System.out.println("The new string is " + result);
    }
}

