package br.com.cursojava;

import br.com.cursojava.enums.TipoCombustivel;
import br.com.cursojava.modelos.Carro;

public class Main {
    public static void main(String[] args) {
        System.out.println("ola");

        Carro carro = new Carro();

        carro.setTipoCombustivel(TipoCombustivel.ALCOOL);
        carro.setNumeroDeRodas(4);
        carro.setAno(2003);

        System.out.println(carro);
    }
}
