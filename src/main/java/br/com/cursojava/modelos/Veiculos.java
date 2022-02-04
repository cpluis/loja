package br.com.cursojava.modelos;

import br.com.cursojava.enums.TipoCombustivel;

public class Veiculos {

    private Integer numeroDeRodas;
    private TipoCombustivel tipoCombustivel; //ENUM
    private Integer ano;

    public Integer getNumeroDeRodas() {
        return this.numeroDeRodas;
    }

    public void setNumeroDeRodas(Integer numeroDeRodas) {
        this.numeroDeRodas = numeroDeRodas;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "numeroDeRodas=" + numeroDeRodas +
                ", tipoCombustivel=" + tipoCombustivel +
                ", ano=" + ano +
                '}';
    }
}
