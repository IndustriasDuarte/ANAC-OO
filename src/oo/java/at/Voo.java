package oo.java.at;

public class Voo {

    private int numero;
    private int numeroDeVagas;
    private String dataDePartida;
    private String horarioDePartida;
    private String horarioDeChegada;
    private Aeroporto aeroportoDeOrigem;
    private Aeroporto aeroportoDeDestino;
    private Aeronave aeronave;

    public Voo(int numero, int numeroDeVagas, String dataDePartida, String horarioDePartida, String horarioDeChegada,
            Aeroporto aeroportoDeOrigem, Aeroporto aeroportoDeDestino, Aeronave aeronave) {
        this.numero = numero;
        this.numeroDeVagas = numeroDeVagas;
        this.dataDePartida = dataDePartida;
        this.horarioDePartida = horarioDePartida;
        this.horarioDeChegada = horarioDeChegada;
        this.aeroportoDeOrigem = aeroportoDeOrigem;
        this.aeroportoDeDestino = aeroportoDeDestino;
        this.aeronave = aeronave;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumeroDeVagas() {
        return numeroDeVagas;
    }

    public String getDataDePartida() {
        return dataDePartida;
    }

    public String getHorarioDePartida() {
        return horarioDePartida;
    }

    public String getHorarioDeChegada() {
        return horarioDeChegada;
    }

    public Aeroporto getAeroportoDeOrigem() {
        return aeroportoDeOrigem;
    }

    public Aeroporto getAeroportoDeDestino() {
        return aeroportoDeDestino;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }
}
