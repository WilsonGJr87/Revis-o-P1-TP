import model.*;

public class Ex8 {
    public static void main(String[] args) {

        Supermercado lista = new Supermercado();
        lista.listar();
        lista.total();
        lista.maisCaro();

        lista.comprarProduto(-1);
        lista.comprarProduto(0);
        lista.reporProduto(-1,"Tomate",50,50);

        lista.reporProduto(1,"Nescau",5,0);
        lista.reporProduto(2,"Danone",20,5);

        lista.listar();
        lista.total();
        lista.maisCaro();

        lista.comprarProduto(2);
        lista.listar();

    }
}