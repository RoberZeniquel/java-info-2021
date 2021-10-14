import java.util.*;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = scan.nextInt();

        scan.close();

        List<String> lista = new ArrayList<>();
        

        for(int i=a; i<b; i++){

            if(i%2==0 && i%3==0){

            String valor= "FizzBuzz"; 
            lista.add(valor);

            }
            
            if(i%2==0){

                String valor= "Fizzggg"; 
                lista.add(valor);
    
            }
            if(i%3==0){

                String valor= "Buzz"; 
                lista.add(valor);
        
            }
            
            else{
                String valor= String.valueOf(i);
                lista.add(valor);

            }

        }

        System.out.println(lista);

    }
}
