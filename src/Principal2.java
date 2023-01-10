public class Principal2 {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        //meuCarro.modelo = "Palio";


        Carro seuCarro = new Carro();
        seuCarro.modelo = "Civic";

        meuCarro.ligar();
        seuCarro.ligar();

        /*
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Azul";
        meuCarro.modelo = "Palio";
        meuCarro.dono.nome = "João da Silva";
        meuCarro.dono.logradouro = "Liberdade";




        System.out.println("cor: " + meuCarro.cor);
        System.out.println("idade do dono: " + meuCarro.dono.nome);
        */

    }
}
