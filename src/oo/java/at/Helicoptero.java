package oo.java.at;

public class Helicoptero extends Aeronave {

    private TIPO tipo;

    public Helicoptero() {
    }

    public Helicoptero(TIPO tipo, String prefixo, String modelo, String fabricante) {
        super(prefixo, modelo, fabricante);
        this.tipo = tipo;
    }

    public TIPO getTipo() {
        return tipo;
    }

}
