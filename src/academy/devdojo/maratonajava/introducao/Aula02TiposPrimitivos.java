package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // 8 tipos primitivos
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L; // Casting. Casting é a conversão explícita de um tipo de dado para outro. (Não é bom)
        double salarioDouble = 2000.0D;
        long numeroGrande = (long) 155.23;
        float salarioFloat = 2500.23F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65; // O número colocado aqui é traduzido para a tabela ASCII
        String nome = "Goku";

        System.out.println("A idade é "+idade);
        System.out.println(falso);
        System.out.println("Char "+caractere);
        System.out.println("O Salário Double é "+salarioDouble);
        System.out.println("O Salário Float é "+salarioFloat);
        System.out.println("Oi, meu nome é "+nome+"!");
    }
}
