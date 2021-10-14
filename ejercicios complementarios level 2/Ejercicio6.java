import java.util.*;


public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Set<Empleado> listaEmpleados = new HashSet<>();
        listaEmpleados.add(new Empleado("Roberto Zeniquel",12345678,50,500));
        listaEmpleados.add(new Empleado("Martina Fernandez", 23456789, 60, 450));
        listaEmpleados.add(new Empleado("Daiana Luque", 34567890, 30, 600));

        System.out.println(listaEmpleados.toString());

        Map<Integer,Integer> sueldos = new HashMap<>(); 

        for(Empleado empleado:listaEmpleados){

            sueldos.put(empleado.dni, empleado.horasTrabajadas * empleado.valorPorHora);
        }
        System.out.println(sueldos);
    }
}

