import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = scan.nextInt();

        int c = a;
        int d = a;
        int i = 1;

        while(i<b){        
            d=d*c;
            i++;
        }
        System.out.println(a + " elevado a "+ b + " = "+ d);
    }

}
