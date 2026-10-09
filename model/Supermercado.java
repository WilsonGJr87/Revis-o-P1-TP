package model;

public class Supermercado {
    private String[] nomeProdutos = new String[3];
    private Double[] precos = new Double[3];
    private Double[] descontos = new Double[3];

    public void listar() {
        int qnt = 0;

        System.out.println("==========Lista==========");

        for (int i = 0; i < 3; i++) {
            if (precos[i] != null && precos[i] > 0)
            {
                qnt++;

                System.out.println("Produto: " + nomeProdutos[i]);
                System.out.println("Preço: " + precos[i]);
                System.out.println("Desconto: " + descontos[i]);
                System.out.println("Preço com Desconto: " + (precos[i] - (precos[i] * (descontos[i]/100))));

                System.out.println("=========================");
            }
        }

        if (qnt <= 0)
        {
            System.out.println("Não há produtos na lista!");
            System.out.println("=========================");
            System.out.println("");
        }
    }

    public void total() {
        int qnt = 0;

        double valorTotal = 0;

        System.out.println("==========Total==========");

        for (int i = 0; i < 3; i++) {
            if (precos[i] != null && precos[i] > 0)
            {
                qnt++;

                valorTotal += (precos[i] - (precos[i] * (descontos[i]/100)));
            }
        }

        if (qnt <= 0)
        {
            System.out.println("Não há produtos na lista!");
            System.out.println("=========================");
            System.out.println("");
        }
        else
        {
            System.out.println("O total da compra é: " + valorTotal);
            System.out.println("=========================");
            System.out.println("");
        }
    }

    public void maisCaro() {
        int qnt = 0;

        int indice = -1;

        System.out.println("==========Mais Caro==========");

        for (int i = 0; i < 3; i++) {
            if (precos[i] != null && precos[i] > 0)
            {
                qnt++;

                if (indice < 0)
                    indice = i;
                else {
                    double maior = (precos[indice] - (precos[indice] * (descontos[indice]/100)));
                    double atual = (precos[i] - (precos[i] * (descontos[i]/100)));

                    if (atual > maior)
                        indice = i;

                }
            }
        }

        if (qnt <= 0)
        {
            System.out.println("Não há produtos na lista!");
            System.out.println("=========================");
            System.out.println("");
        }
        else
        {
            System.out.println("O produto mais caro é o: " + nomeProdutos[indice]);
            System.out.println("=========================");
            System.out.println("");
        }
    }

    public void comprarProduto(int indice) {
        
        if (indice < 0 || indice > 2)
        {
            System.out.println("Está fora do tamanho da lista!");
            return;
        }

        if (precos[indice] != null && precos[indice] > 0) {

            System.out.println(nomeProdutos[indice] + " Foi comprado!");
            System.out.println("=========================");
            System.out.println("");

            nomeProdutos[indice] = "";
            precos[indice] = null;
            descontos[indice] = null;
        }
        else {
            System.out.println("Produto inexistente!");
            return;
        }

    }

        public void reporProduto(int indice, String nome, double preco, double desconto) {
        
        if (indice < 0 || indice > 2)
        {
            System.out.println("Está fora do tamanho da lista!");
            return;
        }

        if (precos[indice] != null && precos[indice] > 0) {
            System.out.println("Já existe um produto aqui!");
            return;
        }

        nomeProdutos[indice] = nome;
        precos[indice] = preco;
        descontos[indice] = desconto;

        System.out.println(nomeProdutos[indice] + " Foi adicionado!");
        System.out.println("=========================");
        System.out.println("");

    }
}