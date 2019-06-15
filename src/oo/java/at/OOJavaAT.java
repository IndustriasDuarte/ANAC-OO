
package oo.java.at;
public class OOJavaAT {
    public static void main(String[] args) {
        helicoptero helicoptero01 = new helicoptero(TIPO.QUARDACOSTEIRA, "PREPRE", "Boing", "EU");
        
        System.out.println(helicoptero01.getTipo().getDescricao());
    }
    
}
