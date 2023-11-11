import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Coche>cocheArrayList=new ArrayList<>();
        ArrayList<Venta>ventaArrayList=new ArrayList<>();

        Venta venta1=new Venta();
        venta1.setCodigoVenta("0001");
        venta1.setFechaVenta("11-11-23");
        venta1.setValorCoche("24.000");
        venta1.setFormaDePago("Credito");

        Venta venta2=new Venta();
        venta2.setCodigoVenta("0002");
        venta2.setFechaVenta("11-10-23");
        venta2.setValorCoche("18.000");
        venta2.setFormaDePago("Credito");

        Venta venta3=new Venta();
        venta3.setCodigoVenta("0003");
        venta3.setFechaVenta("14-12-23");
        venta3.setValorCoche("24.000");
        venta3.setFormaDePago("Contado");

        Venta venta4=new Venta();
        venta4.setCodigoVenta("0004");
        venta4.setFechaVenta("15-05-24");
        venta4.setValorCoche("24.000");
        venta4.setFormaDePago("Contado");


        Coche coche1=new Coche();
        coche1.setMatricula("0001MAP");
        coche1.setMarca("Renault");
        coche1.setModelo("Megane");
        coche1.setColor("Rojo");
        coche1.setTipoDeCombustible("Gasolina");
        coche1.setMotor("2.0l");
        coche1.setCaballos("180");

        Coche coche2=new Coche();
        coche2.setMatricula("0002MAP");
        coche2.setMarca("Nissan");
        coche2.setModelo("Qashqai");
        coche2.setColor("Blanco");
        coche2.setTipoDeCombustible("Diesel");
        coche2.setMotor("1.8 l");
        coche2.setCaballos("200");

        Coche coche3=new Coche();
        coche3.setMatricula("0003MAP");
        coche3.setMarca("Renault");
        coche3.setModelo("Clio");
        coche3.setColor("Verde");
        coche3.setTipoDeCombustible("GLP");
        coche3.setMotor("2.0l");
        coche3.setCaballos("250");

        Coche coche4=new Coche();
        coche4.setMatricula("0004MAP");
        coche4.setMarca("Maserati");
        coche4.setModelo("MC20");
        coche4.setColor("Negro");
        coche4.setTipoDeCombustible("Gasolina");
        coche4.setMotor("2.0l");
        coche4.setCaballos("300");

        Cliente cliente1=new Cliente();
        cliente1.setDni("90840041d");
        cliente1.setNombre("Jaime");
        cliente1.setApellidos("Tucan");
        cliente1.setDireccion("calle Hornos Caleros");
        cliente1.setCodigoFicha("1020");

        Cliente cliente2=new Cliente();
        cliente2.setDni("70847341d");
        cliente2.setNombre("Carlos");
        cliente2.setApellidos("Gutierrez");
        cliente2.setDireccion("calle Olmos");
        cliente2.setCodigoFicha("1010");

        Cliente cliente3=new Cliente();
        cliente3.setDni("10847300f");
        cliente3.setNombre("Juan");
        cliente3.setApellidos("Beltran");
        cliente3.setDireccion("calle Dos Platos");
        cliente3.setCodigoFicha("1030");

        Cliente cliente4=new Cliente();
        cliente4.setDni("72547341S");
        cliente4.setNombre("Noe");
        cliente4.setApellidos("Pedraza");
        cliente4.setDireccion("calle Hermanos Gil");
        cliente4.setCodigoFicha("1040");


    }
}