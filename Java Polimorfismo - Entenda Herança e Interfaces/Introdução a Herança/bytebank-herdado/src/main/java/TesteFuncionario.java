public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico  = new Funcionario();
        nico.setSalario(1000.0);
        nico.setNome("Nico");
        nico.setCpf("123321321321");
        System.out.println(nico.getBonificacao() + nico.getSalario());
    }
}
