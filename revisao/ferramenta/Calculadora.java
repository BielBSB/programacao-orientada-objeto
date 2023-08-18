package revisao.ferramenta;

public class Calculadora {

    public int a;
    public int b;
    private String operador;

    public String getOperador(){
        return this.operador;
    }

    public void setOperador(String op) throws Exception{
        Boolean err = true;
        switch (op) {
            case "+":
                err = true;
                break;
        
            case "-":
                err = true;
                break;

            case "*":
                err = true;
                break;

            case "/":
                err = true;

                break;
        }
        
        if(err){
            throw new Exception(message:"Operador inválido!");
        }
        
        this.operador = op;
    }



    public int operar(){
        int ret = 0;
        switch (this.operador) {
            case "+":
                ret = this.a + this.b;
                break;
        
            case "-":
                ret = this.a - this.b;
                break;

            case "*":
                ret = this.a * this.b;
                break;

            case "/":
                ret = this.a / this.b;

                break;
        }
        return ret;
        
        
    }


    
}
