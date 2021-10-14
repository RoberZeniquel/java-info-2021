import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        
    
    Scanner scan= new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    Integer a = scan.nextInt();

    int i = 1;
    
    List <Integer> linea = new ArrayList<Integer>() ;

    while (i <= a){
        
        linea.add(i);
        System.out.println(linea);
        i++;
    }

    }
}
