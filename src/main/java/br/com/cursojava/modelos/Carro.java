package br.com.cursojava.modelos;

public class Carro extends Veiculos{

    public Carro(){
        System.out.printf("Instanciado carro %s", this);
    }

    public static void imprime() {

    }

    public void imprimeCaracteristicas(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "Carro{} " + super.toString();
    }
}
