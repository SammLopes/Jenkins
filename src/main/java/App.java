package main.java;

public class App {
    public static void main(String args[]){
        Relatorio rVendas = new RelatorioVendas();
        rVendas.geraRelatorio();

        System.out.println();
        
        Relatorio rEstoque = new RelatorioEstoque();
        rEstoque.geraRelatorio();
    }
    
}
