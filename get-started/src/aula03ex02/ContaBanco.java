package aula03ex02;

public class ContaBanco {

    private double saldo;
    private double chequeEspecial;

    public ContaBanco(double saldo) {
        this.saldo = saldo;
        if (saldo <= 500){
            this.chequeEspecial = 50;
        }else if(saldo >= 500){
            this.chequeEspecial = this.saldo / 2;
        }
    }

    public void depositar(double deposito) {
        saldo = deposito;
    }

    public void sacar(double saque) {
        if (saque > saldo){
            System.out.println("Saldo insuficiente");
        }else {
            saldo -= saque;
        }
    }

    public void consultarSaldo() {
        System.out.println(this.getSaldo());
    }

    public void consultarChequeEspecial(){
        System.out.println("Seu cheque especial é de: " + this.chequeEspecial);
    }


    public void pagarBoleto(double boleto) {
        if (boleto > saldo) {
            System.out.println("Saldo insuficiente");
        }else {
            saldo -= boleto;
            System.out.println("Seu boleto foi pago com sucesso!");
        }
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double getChequeEspecial() {
        return chequeEspecial;
    }

    private void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
