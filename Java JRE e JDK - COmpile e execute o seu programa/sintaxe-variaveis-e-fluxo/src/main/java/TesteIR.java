public class TesteIR {
    public static void main(String[] args) {

        double salario = 300.0;

        if (salario < 1900.0) {
            System.out.println("funcionário isento do imposto de renda");
        } else if (salario >= 1900.0 && salario <= 2800.0) {
            salario = salario - 142;
            System.out.println("Porcentagem do IR para a faixa salarial do funcionário é de 7.5%.");
            System.out.println("seu salário final será: " + salario);
        } else if (salario >= 2800.0 && salario <= 3751.0) {
            salario = salario - 142;
            System.out.println("Porcentagem do IR para a faixa salarial do funcionário é de 15%.");
            System.out.println("seu salário final será: " + salario);
        } else if (salario >= 3751.01 && salario <=4664.0) {
            salario = salario - 142;
            System.out.println("Porcentagem do IR para a faixa salarial do funcionário é de 22%.");
            System.out.println("seu salário final será: " + salario);
        }else{
            System.out.println("Parabéns você é rico.");
        }
    }
}
