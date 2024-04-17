package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Arrays Multidimensionais
        int[][] meusNumeros = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(meusNumeros[0][2]);

        // Alterar o valor de um elemento
//        meusNumeros[1][2] = 7;
//        System.out.println(meusNumeros[1][2]);

        // Loop for dentro de um array multidimensional
        // Posso usar um for loop dentro de outro for loop
        for (int i = 0; i < meusNumeros.length; i++) {
            for (int j = 0; j < meusNumeros[i].length; j++) {
                System.out.println("For "+meusNumeros[i][j]);
            }
        }

        // Ou posso usar for-each que geralmente é mais fácil de ler e escrever
        for (int[] j : meusNumeros) {
            for (int i : j) {
                System.out.println("For-each "+i);
            }
        }
    }
}
