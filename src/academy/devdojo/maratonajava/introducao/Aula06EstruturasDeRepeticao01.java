package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // Estruturas de repetição
        // while, do while, for
        int count = 0;
        while (count < 10) { // A condição PRECISA ser verdadeira para o while ser executado
            System.out.println(count);
            count += 1;
        }
        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) { // For
            System.out.println("For "+i);
        }
    }
}
