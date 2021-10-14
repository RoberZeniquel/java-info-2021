import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = scan.nextInt();
        

        System.out.println(a +" + "+ b +" = "+ (a+b));
        System.out.println(a +" - "+ b +" = "+ (a-b));
        System.out.println(a +" * "+ b +" = "+ (a*b));
        System.out.println(a +" / "+ b +" = "+ (a/b));
        System.out.println(a +" % "+ b +" = "+ (a%b));
    }
}