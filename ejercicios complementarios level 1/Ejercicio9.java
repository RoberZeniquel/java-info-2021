import java.util.*;

import javax.swing.border.StrokeBorder;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = scan.nextLine();
        char[] chars = frase.toCharArray();
        System.out.println("Ingrese la letra que desea contabilizar: ");
        String letra = scan.nextLine();
        List <String> lista_frase = new ArrayList<>();
        
        lista_frase.add(frase);
        int c=0;


        for(char ch:chars){    
            String a=  String.valueOf(ch);
            if (a.equals(letra)){
                c++;    
            }
        }
        System.out.println(c);

    }
    
}
