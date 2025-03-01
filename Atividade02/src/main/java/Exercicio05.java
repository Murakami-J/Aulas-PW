import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = sc.nextLine();

        palavra = palavra.toLowerCase();
        List<String> letras = new ArrayList<>();
        int contador = 0;
        for(int i = 0; i < palavra.length(); i++){
            letras.add(String.valueOf(palavra.charAt(i)));
            if("aeiouáéíóúãõàèìòù".indexOf(letras.get(i)) != -1){
                contador++;
            }
        }

        System.out.println("A palavra '%s' possui %d vogais".formatted(palavra, contador));
    }
}
