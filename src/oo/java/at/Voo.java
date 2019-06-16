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

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNumeroDeVagas(int numeroDeVagas) {
        this.numeroDeVagas = numeroDeVagas;
    }

    public void setDataDePartida(String dataDePartida) {
        this.dataDePartida = dataDePartida;
    }

    public void setHorarioDePartida(String horarioDePartida) {
        this.horarioDePartida = horarioDePartida;
    }

    public void setHorarioDeChegada(String horarioDeChegada) {
        this.horarioDeChegada = horarioDeChegada;
    }

    public void setAeroportoDeOrigem(Aeroporto aeroportoDeOrigem) {
        this.aeroportoDeOrigem = aeroportoDeOrigem;
    }

    public void setAeroportoDeDestino(Aeroporto aeroportoDeDestino) {
        this.aeroportoDeDestino = aeroportoDeDestino;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }
    
    
}
