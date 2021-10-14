import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido: ");
        String nombreYApellido = scan.nextLine();
        System.out.println("Ingrese su edad: ");
        Integer edad = scan.nextInt();
        System.out.println("Ingrese su direccion: ");
        String direccion = scan.nextLine();
        System.out.println("Ingrese rsu ciudad: ");
        String ciudad = scan.nextLine();


        System.out.println(ciudad +" - "+ direccion + " - "+ edad+" - "+ nombreYApellido);

    }
}
