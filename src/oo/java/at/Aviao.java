package oo.java.at;

public class Aviao extends Aeronave {

    private int assentos;
    private String empresa;

    public Aviao() {
    }

    public Aviao(int assentos, String empresa, String prefixo, String modelo, String fabricante) {
        super(prefixo, modelo, fabricante);
        this.assentos = assentos;
        this.empresa = empresa;
    }

    public int getAssentos() {
        return assentos;
    }

    public String getEmpresa() {
        return empresa;
    }    

}
