package aula03ex02;

public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco(600);

        conta1.consultarSaldo();
        conta1.consultarChequeEspecial();
    }
}
