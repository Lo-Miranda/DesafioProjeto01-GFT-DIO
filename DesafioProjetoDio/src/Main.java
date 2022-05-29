public class Main {
    public static void main(String[] args) {

        Conta novaCorrente = new ContaCorrente();
        novaCorrente.depositar(3000);


        Conta novaPoupança = new ContaPoupança();
        novaPoupança.depositar(500);
        novaCorrente.transferir(100, novaPoupança);

        novaCorrente.imprimirExtrato();
        novaPoupança.imprimirExtrato();

        novaCorrente.contratarEmprestimo();
        novaPoupança.contratarEmprestimo();


    }
}
