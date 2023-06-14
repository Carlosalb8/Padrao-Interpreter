package Interpreter;

public class InterpretadorTamanho implements Interpretador {
    private int tamanho;

    public void interpretar(String entrada) {
        tamanho = entrada.length();
    }

    public int getTamanho() {
        return tamanho;
    }
}