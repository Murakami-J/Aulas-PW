import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do{
            System.out.print("Digite um número inteiro positivo: ");
            numero = sc.nextInt();
        } while(numero < 0);



  /*      int n1 = 1;
        int n2 = 2;
        int fibonacci = 0;
        int contador = 0;
        int a = 0;

        while(contador <= numero){
            if(contador < 3){
                System.out.println(a + contador);
                contador++;
            }
            else{
                fibonacci = n1 + n2;
                System.out.println(fibonacci);
                n1 = n2;
                n2 = fibonacci;
                contador++;
            }

        }*/
    }
}
