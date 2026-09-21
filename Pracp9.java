public class Pracp9{
    public static void main(String args[]){
        int n = 5;
        int p = 3;

        int Bitmask = 1<<p;

        if((Bitmask & n)==0){
            System.out.println("Bit at position " + p + " was Zero");
        }else{
            System.out.println("Bit at position " + p + " was One");
        }
    }
}
