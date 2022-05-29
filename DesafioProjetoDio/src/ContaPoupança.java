public class ContaPoupança extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("******Extrato da Conta Poupança******");
        super.imprimirInformacoesComuns();
    }

    @Override
    public void contratarEmprestimo() {
        System.out.println("******Possibilidade de Empréstimo - Conta Poupança*****");
        super.contratarEmprestimo();
    }
}
