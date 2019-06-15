package oo.java.at;

public class helicoptero extends Aeronave {

    private TIPO tipo;

    public helicoptero() {
    }

    public helicoptero(TIPO tipo, String prefixo, String modelo, String fabricante) {
        super(prefixo, modelo, fabricante);
        this.tipo = tipo;
    }

    public TIPO getTipo() {
        return tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
