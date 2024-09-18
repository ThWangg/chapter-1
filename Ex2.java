import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("input a line:");
        String n=k.nextLine();
        int h=n.length();
        System.out.println("number of characters:"+h);
    }
}