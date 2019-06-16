package oo.java.at;

import java.util.ArrayList;

public class Aeroporto {

    private String codigo;
    private String nome;
    private Cidade cidade;
    private boolean internacional;
    private ArrayList<Aeroporto> aeroportosComVoosDiretos = new ArrayList<>();
    private ArrayList<Aeroporto> aeroportosQueVemVoos = new ArrayList<>();
    private ArrayList<Aeronave> aeronavesNoPatio = new ArrayList<>();

    public Aeroporto() {
    }

    public Aeroporto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public boolean equals(Aeroporto aeroposto) {
        if (this.codigo.equals(aeroposto.getCodigo())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getAeronavesNoPatio(String prefixo) {
        for (Aeronave aeronave : aeronavesNoPatio) {
            if (aeronave.getPrefixo().equals(prefixo)) {
                return true;
            }
        }

        return false;
    }

    public boolean possuiRota(Aeroporto aeroposto) {
        boolean possui = false;
        for (Aeroporto aeroporto : aeroportosComVoosDiretos) {
            if (aeroporto.equals(aeroposto)) {
                possui = true;
            }
        }

        return possui;
    }

    public String possuiRotaAlternativa(Aeroporto aeroposto) {
        String str = "Não possui rota alternativa.";
        for (Aeroporto aeroporto : aeroportosComVoosDiretos) {
            if (aeroporto.possuiRota(aeroposto)) {
                str = "Possui rota alternativa apartir do aeroporto " + aeroporto.getNome();
            }
        }

        return str;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void setAeroportosComVoosDiretos(Aeroporto aeroporto) {
        try {
            if (this.aeroportosComVoosDiretos.size() == 100) {
                throw new Exception("Limite do aeroporto excedido!");
            } else {
                this.aeroportosComVoosDiretos.add(aeroporto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setAeroportosQueVemVoos(Aeroporto aeroporto) {
        try {
            if (this.aeroportosQueVemVoos.size() == 100) {
                throw new Exception("Limite do aeroporto excedido!");
            } else {
                this.aeroportosQueVemVoos.add(aeroporto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setAeronavesNoPatio(Aeronave aeronave) {
        try {
            if (this.aeronavesNoPatio.size() == 100) {
                throw new Exception("Limite do aeroporto excedido!");
            } else {
                this.aeronavesNoPatio.add(aeronave);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void removeAeronavesNoPatio(Aeronave aeronave) {
        if(this.aeronavesNoPatio.contains(aeronave)){
            this.aeronavesNoPatio.remove(aeronave);
        }else{
            System.out.println("Aeronave não esta no patio");
        }
    }
}
