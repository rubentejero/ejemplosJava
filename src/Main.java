public class Main {


    public static void main(String[] args) {

        // Creamos Objetos
        Raton raton = new Raton("bueno","LG");
        Teclado teclado = new Teclado("hd100","Samsung");
        Monitor monitor = new Monitor("samgunfg", 29);
        Computadora computadora = new Computadora("pc", monitor, teclado,raton);



        // Ordenes
        Orden orden1 = new Orden();
        orden1.mostrarOrden();

        orden1.agregarComputadora(computadora);

        Orden orden2 = new Orden();
        orden1.mostrarOrden();

        Orden orden3 = new Orden();
        orden3.mostrarOrden();

        Orden orden4 = new Orden();
        orden4.mostrarOrden();



    }

}
