package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Switch exercício
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo, final de semana.");
                break;
            case 2:
                System.out.println("Seg, dia útil");
                break;
            case 3:
                System.out.println("Ter, dia útil");
                break;
            case 4:
                System.out.println("Qua, dia útil");
                break;
            case 5:
                System.out.println("Qui, dia útil");
                break;
            case 6:
                System.out.println("Sex, dia útil");
                break;
            case 7:
                System.out.println("Sáb, final de semana");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
