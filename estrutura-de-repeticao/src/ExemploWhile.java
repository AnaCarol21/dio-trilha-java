import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        int contadorDoces = 0;

        double mesada = 50.0;
        while( mesada > 0) {
            Double valorDoce = valorAleatorio();
            
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " foi adicionado no carrinho");
            mesada = mesada - valorDoce;

            contadorDoces++;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces! E comprou o total de "+ contadorDoces +" doces!");
      
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}
