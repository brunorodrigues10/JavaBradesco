package aula04ex02;

import java.util.Scanner;

public class Ingresso {
    Scanner scanner = new Scanner(System.in);

    private int valor = 60;
    private String nomeDoFilme;
    private String dubladoOuLegendado;

    public Ingresso() {
        System.out.println("Digite o filme que deseja assistir: ");
        scanner.next(this.nomeDoFilme);
        System.out.println("Legendado ou Dublado?");
        scanner.next(this.dubladoOuLegendado);
        scanner.close();
        System.out.println("Voce comprou ingresso para o filme: " + this.nomeDoFilme + " na Sessão: " + this.dubladoOuLegendado);
    }



    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getDubladoOuLegendado() {
        return dubladoOuLegendado;
    }

    public void setDubladoOuLegendado(String dubladoOuLegendado) {
        dubladoOuLegendado = dubladoOuLegendado;
    }


}
