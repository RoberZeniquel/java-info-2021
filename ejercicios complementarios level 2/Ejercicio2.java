import java.util.*;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        Integer num1= scan.nextInt();
        System.out.println("ingrese el segundo numero: ");
        Integer num2= scan.nextInt();
        System.out.println("ingrese el tercer numero: ");
        Integer num3= scan.nextInt();
        System.out.println("ingrese el cuarto numero: ");
        Integer num4= scan.nextInt();
        System.out.println("ingrese el quinto numero: ");
        Integer num5= scan.nextInt();
        System.out.println("ingrese el numero para agregar al principio: ");
        Integer numpr= scan.nextInt();
        System.out.println("ingrese el numero para agregar al final: ");
        Integer numfn= scan.nextInt();

        scan.close();

        
        List<Integer> lista= new ArrayList<>();
        lista.add(num1);
        lista.add(num2);
        lista.add(num3);
        lista.add(num4);
        lista.add(num5);
        
        for(Integer i:lista){
            System.out.println(i);
        }
        System.out.println("Elementos de la lista: "+ lista.size());

        lista.add(0,numpr);
        lista.add(numfn);

        for(Integer i:lista){
            System.out.println(i);
        }
        System.out.println("Elementos de la lista: "+ lista.size());

    }

}
