package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numerosList;

    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()){
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordedarDescendente() {
        List<Integer> numeroAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()){
            numeroAscendente.sort(Collections.reverseOrder());
        }else{
            System.out.println("A lista está vazia");
        }
        return numeroAscendente;
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        //System.out.println(numeros.ordenarAscendente());

        //System.out.println(numeros.ordedarDescendente());


    }

}
