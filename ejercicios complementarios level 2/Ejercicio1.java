import java.util.*;

public class Ejercicio1{

    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        System.out.println("ingrese su ciudad favorita: ");
        String ciudad1= scan.nextLine();
        System.out.println("ingrese su segunda ciudad favorita: ");
        String ciudad2= scan.nextLine();
        System.out.println("ingrese su tercer ciudad favorita: ");
        String ciudad3= scan.nextLine();

        scan.close();

        List<String> ciudades= new ArrayList<>();
        ciudades.add(ciudad1);
        ciudades.add(ciudad2);
        ciudades.add(ciudad3);

        System.out.println("#1 - "+ ciudades.get(0));
        System.out.println("#2 - "+ ciudades.get(1));
        System.out.println("#3 - "+ ciudades.get(2));

     }
}