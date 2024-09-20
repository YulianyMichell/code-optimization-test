import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        final int AGE_LIMIT  = 18;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int age=scanner.next.int();
        
        if (AGE_LIMIT >= 18) {
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Acceso denegado");
    
        }
        scanner.close();
    }
}
