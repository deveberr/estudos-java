package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // Array de strings
        String[] cars = {"Volvo", "BMW", "Ford", "Mitsubishi"};
        System.out.println(cars[0]);

        // Alterar um elemento específico
        cars[0] = "Honda";
        System.out.println(cars[0]);

        // Descobrir tamanho do array
        System.out.println("Tamanho array " + cars.length);

        // Loop no array com for
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Loop for " + cars[i]);
        }

        // Loop no array com for-each (mais fácil de escrever e mais legível)
        for (String i : cars) {
            System.out.println("Loop com for-each "+i);
        }
    }
}
