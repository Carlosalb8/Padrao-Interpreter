package Interpreter;

public class InterpretadorContagemVogais implements Interpretador {
    private int contagem;

    public void interpretar(String entrada) {
        contagem = 0;
        for (char c : entrada.toCharArray()) {
            if (isVogal(c)) {
                contagem++;
            }
        }
    }

    private boolean isVogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int getContagem() {
        return contagem;
    }
}