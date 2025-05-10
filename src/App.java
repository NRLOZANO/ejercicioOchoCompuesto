import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double valorUno = 0, valorDos = 0;
        System.out.println("Ingresa el primer valor");
        valorUno = sc.nextDouble();
        System.out.println("Ingresa el segundo valor");
        valorDos = sc.nextDouble();
        if (valorUno == valorDos) {
            System.out.println("Ambos numeros son iguales");
        }
        else {
            if (valorUno > valorDos) {
                System.out.println("El valor uno es mayor");
            }
            else{
                System.out.println("El valor dos es el mayor");
            }
        }
    }
}
