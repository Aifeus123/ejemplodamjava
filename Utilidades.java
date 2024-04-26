package ejemplodamjava;

import java.util.Date;

public class Utilidades {

    private String nombre;
    private int edad;
    private String[] direcciones;



    public Utilidades(String nombre, int edad, String[] direcciones) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {

    }

    public int calcEdad(Date fecha) {
        return 15;
    }
    private String limpiarDireccion(String dir) {
        return "";
    }


}
