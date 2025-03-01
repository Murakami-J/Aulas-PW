import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do{
            System.out.print("Digite um número inteiro positivo: ");
            numero = sc.nextInt();
        } while(numero < 0);

        List<Integer> sequencia = new ArrayList<>();
        int contador = 0;
        int fibonacci;

        while (contador < numero) {
            if (contador < 2) {
                sequencia.add(contador);
            } else {
                fibonacci = sequencia.get(contador - 1) + sequencia.get(contador - 2);
                sequencia.add(fibonacci);
            }
            contador++;
        }

        System.out.println("Sequência de fibonacci");
        System.out.println(sequencia);
    }
}
