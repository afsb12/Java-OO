public class TestaBanco {
    public static void main(String[] args) {
        Cliente clienteAlisson = new Cliente();
        clienteAlisson.nome = "Alisson";
        clienteAlisson.cpf = "222222222222";
        clienteAlisson.profissao = "desenvolvedor";

        Conta contaAlisson = new Conta();
        contaAlisson.deposita(5500);
        contaAlisson.titular = clienteAlisson;

        System.out.println(contaAlisson.titular.nome);
        System.out.println(contaAlisson.titular.cpf);
        System.out.println(contaAlisson.titular.profissao);
        System.out.println(contaAlisson.getSaldo());

    }
}
