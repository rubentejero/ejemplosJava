import java.util.Arrays;


public class Orden {

    private int idOrden;
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private final static int maxComputadoras =10;
    private static   Computadora computadoras[];



    public Orden() {
        this.idOrden = Orden.contadorOrdenes++;
        Orden.computadoras = new Computadora[Orden.maxComputadoras];
    }

    public void agregarComputadora( Computadora computador){
        if( Orden.contadorComputadoras< Orden.maxComputadoras) {
            Orden.computadoras[Orden.contadorComputadoras] = computador;
            Orden.contadorComputadoras++;
        }else{
            System.out.println("Se ha superado el numero de computadoras.");
        }
    }


    public void mostrarOrden() {

        String out = "Orden{" +
                "idOrden=" + idOrden +
                ", contadorOrdenes=" + Orden.contadorOrdenes +
                ", computadoras=" + Arrays.toString(Orden.computadoras) +
                '}';

        System.out.println(out);
    }
}
