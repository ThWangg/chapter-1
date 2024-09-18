import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("input n =");
        double n = k.nextDouble();
        System.out.println("Sin(n)="+Math.sin(n));
        System.out.println("Cos(n)="+Math.cos(n));
        System.out.println("square root of n="+Math.sqrt(n));
    }
}