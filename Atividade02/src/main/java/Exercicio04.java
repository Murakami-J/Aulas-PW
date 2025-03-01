import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        palavra = palavra.toLowerCase();
        List<String> letras = new ArrayList<>();
        String palindromo = "";

        for (int i = 0; i < palavra.length(); i++) {
            letras.add(String.valueOf(palavra.charAt(i)));
        }

        for(int i = 0; i < letras.size(); i++){
            if(!letras.get(i).equals(letras.get(letras.size() - i - 1)) ){
                palindromo = "não";
                break;
            }
        }
        System.out.println("A palavra %s %s é um palímdromo".formatted(palavra, palindromo));
    }
}
