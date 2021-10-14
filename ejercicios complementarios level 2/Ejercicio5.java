import java.util.*;


public class Ejercicio5 {

    public static void main(String[] args) {
        
        /* INGRESO DE DATOS */

        Scanner scan= new Scanner(System.in);

        List<Integer> horas= new ArrayList<>();
        System.out.println("ingrese la lista de horas trabajadas: ");
        Integer c=0;
        
        
    
        while(c<5){
            
            scan.hasNextInt();
            horas.add(scan.nextInt());
            c++;
        }
        
        System.out.println(horas);


        List<Integer> valoresHoras= new ArrayList<>();
        System.out.println("ingrese la lista de valores por horas trabajadas: ");
        Integer d=0;
        
        while(d<5){
            
            scan.hasNextInt();
            valoresHoras.add(scan.nextInt());
            d++;
        }
        System.out.println(valoresHoras);

        scan.close();

        /* Calculos de Sueldo por dia */

        List<Integer> valoresSumados= new ArrayList<>();
        
        for(int i=0; i<horas.size(); i++){

            valoresSumados.add(horas.get(i)*valoresHoras.get(i));

        }
        
        int x = 0;
        for(Integer i:valoresSumados){

            x=x+i;
        }
        
        System.out.println(valoresSumados);
        System.out.println("Total Final = $"+ x);
        

    }
}
