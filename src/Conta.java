public class ContaCorrente {

    private int agencia;
    private int numero;
    private double saldo;

    public void sacar(){

    }

    public void depositar(){

    }

    public void transferir(){

    }

    public ContaCorrente(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
