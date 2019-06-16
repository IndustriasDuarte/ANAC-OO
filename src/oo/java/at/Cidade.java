package oo.java.at;

import java.util.ArrayList;

public class Cidade {

    private String nome;
    private float dimensao;
    private ArrayList<Cidade> cidadeFronteira = new ArrayList<>();

    public Cidade() {
    }

    public Cidade(String nome, float dimensao) {
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public ArrayList<Cidade> getCidadeFronteira() {
        return cidadeFronteira;
    }

    public void setCidadeFronteira(Cidade cidadeFronteira) {
        try {
            if (this.cidadeFronteira.size() > 40) {
                throw new Exception("Limite da cidade excedida!");
            } else {
                this.cidadeFronteira.add(cidadeFronteira);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public float getDimensao() {
        return dimensao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDimensao(float dimensao) {
        this.dimensao = dimensao;
    }

    public void setCidadeFronteira(ArrayList<Cidade> cidadeFronteira) {
        this.cidadeFronteira = cidadeFronteira;
    }

    public boolean equals(Cidade outra) {
        if (this.nome.equals(outra.getNome()) && this.dimensao == outra.getDimensao()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean limitrofe(Cidade outra) {
        if (this.cidadeFronteira.size() > 0) {
            for (Cidade cidade : this.cidadeFronteira) {
                if (cidade.equals(outra)) {
                    return true;
                }
            }
        }else{
            System.out.println("Lista esta vazia.");
        }
        return false;
    }

    public String vizinhosComuns(Cidade cidade) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Cidade cidadeAtual : this.cidadeFronteira) {
            for (Cidade outraCidade : cidade.getCidadeFronteira()) {
                if (cidadeAtual.equals(outraCidade)) {
                    stringBuilder.append(cidadeAtual.getNome());
                }
            }
        }

        if (stringBuilder.length() == 0) {
            stringBuilder.append("As cidades não tem vizinhos comuns.");
        }

        return stringBuilder.toString();
    }
}
