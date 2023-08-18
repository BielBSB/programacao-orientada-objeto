package revisao;

import revisao.ferramenta.Calculadora;

/**
 * ClasseExecutavel
 */
public class ClasseExecutavel {

    public static void main(String[] args) throws Exception {
        
        Calculadora calc = new Calculadora();
        
        calc.a = 3;
        calc.b = 5;
        calc.setOperador("+");

        System.out.println(calc.operar());

    }


}