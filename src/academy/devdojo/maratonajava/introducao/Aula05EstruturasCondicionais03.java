package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operador ternário
        // Doar se o salário for maior que 5000.
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500.";
        String mensagemNaoDoar = "Ainda não tenho condições.";
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
