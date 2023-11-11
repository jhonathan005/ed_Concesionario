import java.util.ArrayList;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String codigo;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Venta> getVenta() {
        return venta;
    }

    public void setVenta(ArrayList<Venta> venta) {
        this.venta = venta;
    }

    private ArrayList<Venta> venta;

}
