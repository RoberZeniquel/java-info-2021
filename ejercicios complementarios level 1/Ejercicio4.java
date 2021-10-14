import java.util.*;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        Integer a = scan.nextInt();

        Integer b = a-1;
        Integer c = a;

        while(b>0){
            c= c*b;
            b--;
            
        }

        System.out.println("El factorial de "+ a +" es: "+ c);
    }
}
