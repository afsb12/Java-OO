import java.awt.event.ActionListener;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(123,321);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
        cliente.setNome("Alisson Teste");
        conta.setTitular(cliente);
        conta.getTitular().setCpf("1231231231232");

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
    }
}
