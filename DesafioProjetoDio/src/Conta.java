public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agenciaConta;
    protected int numeroConta;
    protected double saldoConta;

    public Conta() {
        this.agenciaConta = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }


    @Override
    public void sacar(double valor) {
        saldoConta = saldoConta - valor;

    }

    @Override
    public void depositar(double valor) {
        saldoConta = saldoConta + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void imprimirExtrato() {

    }

    @Override
    public void contratarEmprestimo() {
        if(saldoConta > 2000) {
            System.out.println("Empréstimo liberado.");
        } else {
            System.out.println("Empréstimo negado.");
        }
    }

    @Override

    public int getAgenciaConta() {
        return agenciaConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    protected void imprimirInformacoesComuns() {
        System.out.println(String.format("Agência: %d", this.agenciaConta));
        System.out.println(String.format("Número: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldoConta));
    }
}
