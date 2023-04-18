import java.util.Scanner;

public class ScannerHelper {
    public static Scanner input(){
        return new Scanner(System.in);
    }

    public static String getString(String ask){
        System.out.println(ask);
        return input().nextLine();
    }

    public static int getInt(String ask){
        System.out.println(ask);
        return input().nextInt();
    }
}
