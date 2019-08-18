public class Raton extends DispositivoEntrada{

    private int idRaton;
    private static int contadorRatones;


    public Raton( String tipo, String marca) {
        super(tipo,marca);
        this.idRaton = Raton.contadorRatones++;
    }


    @Override
    public String toString() {
        return super.toString()+"Raton{" +
                "idRaton=" + idRaton +
                '}';
    }
}
