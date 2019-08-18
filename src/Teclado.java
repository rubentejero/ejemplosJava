public class Teclado extends DispositivoEntrada{

    private int idTeclado;
    private static int contadorTeclado;


    public Teclado( String tipo, String marca) {
        super(tipo,marca);
        this.idTeclado = Teclado.contadorTeclado++;
    }

    @Override
    public String toString() {
        return super.toString()+"Teclado{" +
                "idTeclado=" + idTeclado +
                '}';
    }
}
