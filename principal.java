import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0, d = 0;
        System.out.println("ingrese la dimensión de la matriz");
        d = sc.nextInt();
        System.out.println("ingrese el punto a visualizar de 1 a 11");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.println("es el punto 1");
                break;

            default:
                System.out.println("pagina en mantenimiento");
                break;
        }

    }
}