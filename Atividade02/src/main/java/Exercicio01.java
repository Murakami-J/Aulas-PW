import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

       do{
           System.out.print("Digite um numero inteiro positivo: ");
           numero = sc.nextInt();
       } while (numero < 0);

        boolean primo = true;
        for(int i = 2 ; i < numero ; i++){
            if(numero % i == 0){
                   primo = false;
                   break;
            }
        }

        if(primo){
            System.out.println("O número %d é primo".formatted(numero));
        } else{
            System.out.println("O número %d não é primo".formatted(numero));
        }
    }
}
