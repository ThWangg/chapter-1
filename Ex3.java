import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("input width=");
        double w=k.nextDouble();
        System.out.println("input height=");
        double h=k.nextDouble();
        System.out.println("Area of the rectangle="+w*h);
        System.out.println("perimeter of the rectangle="+(w+h)*2);
    }
}