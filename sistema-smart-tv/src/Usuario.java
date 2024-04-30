public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal); 
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("new -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("new -> TV ligada? " + smartTv.ligada);

        smartTv.trocarCanal(13);
        System.out.println("new -> Qual canal ? " + smartTv.canal);
    }
}
