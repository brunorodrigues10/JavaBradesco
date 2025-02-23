package map.Pesquisa;


import java.util.HashMap;
import java.util.Map;

/*

adicionarProduto(long cod, String nome, int quantidade, double preco)
exibirProdutos()
calcularValorTotalEstoque()
obterProdutoMaisCaro()
*/
public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;

        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() *p.getPreco();
            }
        }
        System.out.println(valorTotalEstoque);
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        System.out.println(produtoMaisCaro);
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(34431432L, "Macarrão", 3, 5 );
        estoqueProdutos.adicionarProduto(65454654L, "Água", 100, 1.99 );
        estoqueProdutos.adicionarProduto(38766876L, "Biscoito", 40, 3 );

        //estoqueProdutos.obterProdutoMaisCaro();

        //estoqueProdutos.exibirProdutos();

        estoqueProdutos.calcularValorTotalEstoque();
    }
}
