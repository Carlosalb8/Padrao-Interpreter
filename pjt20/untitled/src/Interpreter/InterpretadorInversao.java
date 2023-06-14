package Interpreter;

public class InterpretadorInversao implements Interpretador {
    private String inverso;

    public void interpretar(String entrada) {
        StringBuilder sb = new StringBuilder(entrada);
        inverso = sb.reverse().toString();
    }

    public String getInverso() {
        return inverso;
    }
}
