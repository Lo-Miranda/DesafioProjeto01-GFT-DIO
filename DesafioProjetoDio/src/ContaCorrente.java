public class ContaCorrente extends Conta {


    @Override
    public void imprimirExtrato() {
        System.out.println("******Extrato da Conta Corrente******");
        super.imprimirInformacoesComuns();
    }

    @Override
    public void contratarEmprestimo() {
        System.out.println("******Possibilidade de Empréstimo - Conta Corrente*****");
        super.contratarEmprestimo();
    }




}
