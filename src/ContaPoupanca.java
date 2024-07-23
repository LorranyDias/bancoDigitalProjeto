public class ContaPoupanca extends Conta {

    public ContaPoupanca() {

    }

    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        this.imprimirInfoComuns();

    }
}