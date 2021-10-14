import java.util.*;

public class Ejercicio4 {
    

    public static void main(String[] args) {

        List<String> estudiantes= new ArrayList<>(Arrays.asList("Mario","jose","Maria","Dante","Carla","Daiana",
                                                            "Laura","David","Alexis","Gerardo","Milagros","Danilo"));


        List<String> curso1= estudiantes.subList(0, 4);
        List<String> curso2= estudiantes.subList(4, 8);
        List<String> curso3= estudiantes.subList(8, 12);

        System.out.println("El curso 1 se conforma por: "+ curso1);
        System.out.println("El curso 2 se conforma por: "+ curso2);
        System.out.println("El curso 3 se conforma por: "+ curso3);
    }
}