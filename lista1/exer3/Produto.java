public class Produto {
    private String name;
    private boolean vendido = false;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean isVendido(){
        return vendido;
    }

    public void vender(){
        this.vendido = true;
    }

    @Override
    public String toString(){
        return "Item: " + name + "\nVendido: " + vendido;
    }

}
