public class VerificadorPrimo {

    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; 
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; 
            }
        }
        
    return 1; 
    }

    public static void main(String[] args) {
        int numero = 23; // Insira aqui o número que deseja verificar
        
        int resultado = verificaNumeroPrimo(numero);
        
        if (resultado == 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
