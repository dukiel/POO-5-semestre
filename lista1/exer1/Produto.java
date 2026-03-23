public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void atualizaPrecoPerc(double perc){
        this.preco = this.preco + (this.preco*(perc/100));
    }

    public void fazerPromocao(double promo){
        this.preco -= promo;
    }

    @Override
    public String toString(){
            return "item: " + nome + " - " + "preco: " + preco;
    }

}
