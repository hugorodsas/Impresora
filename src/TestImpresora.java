public class TestImpresora {
    static void main() {
        Impresora impresora = new Impresora();

        impresora.imprimir(5);
        impresora.imprimir(5.5);
        impresora.imprimir("Hola");
        impresora.imprimir("Hola",5);
    }
}
