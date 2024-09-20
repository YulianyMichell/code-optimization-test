public class Store {
    public static void main(String[] args) {

        int[] precio={15,10,5};
        final int MEDIDA=50; 
        int[] cantidad={2,3,4};
     
        int totalVentas=0;
        for (int i = 0; i < precio.length; i++) {
            totalVentas+=precio[i]*cantidad[i];
        }
            if (totalVentas >MEDIDA) {
            System.out.println("Buen desempeño de ventas");
            } else {
            System.out.println("Bajo desempeño de ventas");
        }
    }
 }
