package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;

        if (!itemList.isEmpty()) {
            for (Item item : itemList){
                double valorItem = item.getPreco() * item.getQuatidade();
                valorTotal += valorItem;
            }
            System.out.println(valorTotal);
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
         CarrinhoDeCompras compras = new CarrinhoDeCompras();

         compras.adicionarItem("Balas", 2, 1);
         compras.adicionarItem("Fini", 2, 1);
         compras.adicionarItem("Refri", 2, 1);

         compras.removerItem("Balas");


         compras.exibirItens();

    }
}
