package main.java;

public class RelatorioVendas extends Relatorio{

    protected void geraCabecalho(){
       System.out.println("Relatorio de vendas");
       System.out.println("Data: "+java.time.LocalDate.now());
    }

    protected void geraCorpo(){
        System.out.println("Produtos vendidos");
        System.out.println("Produto 1 : R$ 60");
        System.out.println("Produto 2 : R$ 100");
        System.out.println("Produto 3 : R$ 120");
    }

    protected void geraRodape(){
        System.out.println("Total das vendas : R$ 280");
    }
    
}
