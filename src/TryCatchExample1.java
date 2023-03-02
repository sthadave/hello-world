

    import java.util.Scanner;
    public class TryCatchExample1 {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Whats your fav number?");
        try{
            int n= scan.nextInt();
            System.out.println(n);
        }

        catch(Exception e)  {
            System.out.println("SOrry plese enter the number");
        }
    }
}

