package oo.java.at;

import java.util.ArrayList;

public class Aeroporto {

    private String codigo;
    private String nome;
    private Cidade cidade;
    private boolean internacional;
    private ArrayList<Aeroporto> aeroportosComVoosDiretos;
    private ArrayList<Aeroporto> aeroportosQueVemVoos;
    private ArrayList<Aeronave> aeronavesNoPatio;

    public Aeroporto() {
    }

    public Aeroporto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.aeroportosComVoosDiretos = new ArrayList<>();
        this.aeroportosQueVemVoos = new ArrayList<>();
        this.aeronavesNoPatio = new ArrayList<>();
    }

    public boolean getInternacional() {
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

    public boolean verAeronavesNoPatio(String prefixo) {
        for (Aeronave aeronave : aeronavesNoPatio) {
            if (aeronave.getPrefixo().equals(prefixo)) {
                return true;
            }
        }

        return false;
    }

    public boolean possuiRota(Aeroporto aeroposto) {
        boolean possui = false;
        if (this.aeroportosComVoosDiretos.contains(aeroposto)) {
            possui = true;
        } else {
            for (Aeroporto aeroporto : aeroportosComVoosDiretos) {
                if (aeroporto.possuiRota(aeroposto)) {
                    possui = true;
                }
            }
        }

        return possui;
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

    public void addAeroportosComVoosDiretos(Aeroporto aeroporto) {
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

    public void addAeroportosQueVemVoos(Aeroporto aeroporto) {
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

    public void addAeronavesNoPatio(Aeronave aeronave) {
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
        if (this.aeronavesNoPatio.contains(aeronave)) {
            this.aeronavesNoPatio.remove(aeronave);
        } else {
            System.out.println("Aeronave não esta no patio");
        }
    }
}
