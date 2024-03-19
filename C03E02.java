import java.util.Scanner;

public class C03E02 {

    public static void main(String[] args){
        long n1, n2, n3;
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        n1 = teclado.nextLong();
        System.out.print("Informe outro número: ");
        n2 = teclado.nextLong();
        System.out.print("Informe mais um número: ");
        n3 = teclado.nextLong();
        media = (n1 + n2 + n3) / 3.0;
        System.out.println("Média = " + media);
        teclado.close();
    }
}
