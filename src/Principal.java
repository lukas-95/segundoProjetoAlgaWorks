public class Principal {

    public static void main(String[] args) {
        Carro meucarro = new Carro();
        meucarro.fabricante = "FIAT";
        meucarro.cor = "Prata";
        meucarro.modelo = "Palio";
        meucarro.anoDeFabricacao = 2011;

        Carro seucarro = new Carro();
        seucarro.fabricante = "HONDA";
        seucarro.cor = "Preto";
        seucarro.modelo = "Civic";
        seucarro.anoDeFabricacao = 2009;


        System.out.println("Meu carro");
        System.out.println("-------------------");
        System.out.println("Modelo: " + meucarro.modelo);
        System.out.println("Cor: " + meucarro.cor);
        System.out.println("Ano: " + meucarro.anoDeFabricacao);

        System.out.println();
        System.out.println("Seu carro");
        System.out.println("-------------------");
        System.out.println("Modelo: " + seucarro.modelo);
        System.out.println("Cor: " + seucarro.cor);
        System.out.println("Ano: " + seucarro.anoDeFabricacao);


    }
}
