import javax.print.DocFlavor.STRING;

public class Empleado{
    
    public String nombreYApellido;
    public Integer dni;
    public Integer horasTrabajadas;
    public Integer valorPorHora;


    public Empleado(String nombreYApellido, int dni, int horasTrabajadas, int valorPorHora){
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return String.valueOf(this.nombreYApellido)+" - "+ this.dni +" - "
                            + this.horasTrabajadas+ " - "+ this.valorPorHora;
    }

}