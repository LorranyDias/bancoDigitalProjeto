public  class ContaCorrente extends  Conta{

    public ContaCorrente() {

    }

    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        this.imprimirInfoComuns();
    }


    }
