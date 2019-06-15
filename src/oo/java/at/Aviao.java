package oo.java.at;

public class aviao extends Aeronave {

    private int assentos;
    private String empresa;

    public aviao() {
    }

    public aviao(int assentos, String empresa, String prefixo, String modelo, String fabricante) {
        super(prefixo, modelo, fabricante);
        this.assentos = assentos;
        this.empresa = empresa;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
