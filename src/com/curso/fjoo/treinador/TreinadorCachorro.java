package com.curso.fjoo.treinador;

import com.curso.fjoo.animal.Cachorro;

public class TreinadorCachorro {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Tyson");

        DonoCachorro dono = new DonoCachorro();
        dono.ensinarCachorroSentar(cachorro);

    }

}
