import java.util.ArrayList;

public class Venta {
    private String CodigoVenta;
    private String fechaVenta;
    private String valorCoche;
    private String formaDePago;
    private ArrayList<Coche> coche;
    private Cliente cliente;

    public String getCodigoVenta() {
        return CodigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        CodigoVenta = codigoVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getValorCoche() {
        return valorCoche;
    }

    public void setValorCoche(String valorCoche) {
        this.valorCoche = valorCoche;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public ArrayList<Coche> getCoche() {
        return coche;
    }

    public void setCoche(ArrayList<Coche> coche) {
        this.coche = coche;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
