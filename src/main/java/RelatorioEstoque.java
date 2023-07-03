package main.java;

public class RelatorioEstoque extends Relatorio {
    
    protected void geraCabecalho(){
       System.out.println("Relatorio de Estoque");
       System.out.println("Data: "+java.time.LocalDate.now());
    }

    protected void geraCorpo(){
        System.out.println("Produtos no estoque");
        System.out.println("Produto 1 :  60 unidades");
        System.out.println("Produto 2 :  100 unidades");
        System.out.println("Produto 3 :  120 unidades");
    }

    protected void geraRodape(){
        System.out.println("Total de produtos do estoque :  280 unidades");
    }
    

  
}
