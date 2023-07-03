package main.java;

public abstract class Relatorio {

    public void geraRelatorio(){

        geraCabecalho();
        geraCorpo();
        geraRodape();

    }

    protected abstract void geraCabecalho();
    protected abstract void geraCorpo();
    protected abstract void geraRodape();
    
}
