public class TaxCalculation {
    public static void main(String[] args) {
        double [] precioProducto = {100,200};
        double [] porcentaje={0.15,0.10};
        final int TAX_THRESHOLD=50;
        
        
        double  impuestoTotal= 0;
        for (int i=0; i<precioProducto.length;i++){
            totalImpuesto +=(precioProducto[i]*porcentaje[i]);
        if (impuestoTotal > TAX_THRESHOLD) {
            System.out.println("Impuesto total alto: " + impuestoTotal);
        } else {
            System.out.println("Low tax");
        }
    }
}
