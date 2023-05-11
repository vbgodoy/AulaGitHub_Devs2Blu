import java.util.Arrays;
import java.util.Random;

public class Desafio1 {
    public static void main(String[] args) throws Exception {
        var array = new int[10];
        var random = new Random();
        int maior = 1;
        int menor = 50;
        
        for (int count = 0; count < array.length; count++) {
            array[count] = random.nextInt(50);

            if (array[count] > maior) {
                maior = array[count];
            }
            if (array[count] < menor) {
                menor = array[count];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

    }
}
