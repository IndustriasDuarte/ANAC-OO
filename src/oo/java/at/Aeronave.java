package oo.java.at;

public class Aeronave {

    protected String prefixo;
    protected String modelo;
    protected String fabricante;

    public Aeronave() {
    }

    public Aeronave(String prefixo, String modelo, String fabricante) {
        this.prefixo = prefixo;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
}