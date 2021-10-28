public class ContaCorrente {
    public ContaCorrente(int nroConta) {
        this.nroConta = nroConta;
    }
    private double saldo;
    private int nroConta;
    public double getSaldo() {
        return saldo;
    }
    public void deposito(double valor){
        this.saldo+=valor;
    }
    public double retirada(double valor){
        double novoSaldo=0.0;
        if(getSaldo() >valor){
            novoSaldo= getSaldo() - valor;
        }
        return novoSaldo;
    }
}
