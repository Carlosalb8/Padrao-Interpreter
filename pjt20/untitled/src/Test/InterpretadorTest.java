package Test;
import Interpreter.InterpretadorContagemVogais;
import Interpreter.InterpretadorInversao;
import Interpreter.InterpretadorTamanho;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterpretadorTest {

    @Test
    public void testInterpretadorTamanho() {
        InterpretadorTamanho interpretador = new InterpretadorTamanho();
        interpretador.interpretar("Hello");
        int tamanho = interpretador.getTamanho();
        Assertions.assertEquals(5, tamanho);
    }

    @Test
    public void testInterpretadorContagemVogais() {
        InterpretadorContagemVogais interpretador = new InterpretadorContagemVogais();
        interpretador.interpretar("Hello World");
        int contagem = interpretador.getContagem();
        Assertions.assertEquals(3, contagem);
    }

    @Test
    public void testInterpretadorInversao() {
        InterpretadorInversao interpretador = new InterpretadorInversao();
        interpretador.interpretar("Hello");
        String inverso = interpretador.getInverso();
        Assertions.assertEquals("olleH", inverso);
    }
}
