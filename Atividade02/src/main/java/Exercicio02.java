import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do{
            System.out.print("Digite um número inteiro positivo: ");
            numero = sc.nextInt();
        } while(numero < 0);

        List<Integer> sequencia = new ArrayList<>();
        String numeroString = String.valueOf(numero);
        int soma = 0;
        for(int i = 0; i < numeroString.length(); i++){
            sequencia.add(Integer.parseInt(valueOf(numeroString.charAt(i))));
            soma += sequencia.get(i);
        }
        System.out.println("A soma de seus dígitos é: " + soma);
    }
}
