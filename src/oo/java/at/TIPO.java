
package oo.java.at;
public enum TIPO {
    RESGATE("Resgate"), TAXIAEREO("Taxi aéreo"), QUARDACOSTEIRA("Guarda costeira");
    
    private String descricao;

    private TIPO(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
}
