package oo.java.at;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OOJavaAT {

    public static void main(String[] args) {
        ArrayList<Aviao> aviaos = new ArrayList<>();
        ArrayList<Helicoptero> helicopteros = new ArrayList<>();
        ArrayList<Voo> voos = new ArrayList<>();
        ArrayList<Aeroporto> aeroportos = new ArrayList<>();
        ArrayList<Cidade> cidades = new ArrayList<>();

        
        //Aeromaves
        aviaos.add(new Aviao(100, "Gol", "IAC", "Airbus A380", "MC-21"));
        aviaos.add(new Aviao(100, "Tam", "ADS", "Boeing 707", "Mitsubishi MRJ"));
        helicopteros.add(new Helicoptero(TIPO.TAXIAEREO, "BNC", "B06", "Airbus"));

        //Cidades
        cidades.add(new Cidade("Rio de Janeiro", 1.255f));
        cidades.add(new Cidade("São Paulo", 1.521f));
        cidades.add(new Cidade("Salvador", 692.8f));

        /*
        cidades.get(0).setCidadeFronteira(cidades.get(1));
        cidades.get(0).setCidadeFronteira(cidades.get(2));

        cidades.get(1).setCidadeFronteira(cidades.get(0));
        cidades.get(1).setCidadeFronteira(cidades.get(2));

        cidades.get(2).setCidadeFronteira(cidades.get(0));
        cidades.get(2).setCidadeFronteira(cidades.get(1));
        */
        
        //Aeroportos
        
        //Voos
         
        mainMenu(aviaos, helicopteros, voos, aeroportos, cidades);
    }

    public static void mainMenu(ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros, ArrayList<Voo> voos, ArrayList<Aeroporto> aeroportos, ArrayList<Cidade> cidades) {
        final int FLAG = 0;
        int opcao;

        opcao = menu();
        while (opcao != FLAG) {
            switch (opcao) {
                case 1://Aeronaves
                    //cadastrarAeronaves(aeronaves);
                    mainAeronaves(aviaos, helicopteros);
                    break;
                case 2://Voos
                    //cadastrarVoos(voos, aeronaves, aeroportos);
                    mainVoos(voos, aviaos, helicopteros, aeroportos);
                    break;
                case 3://Aeroportos
                    //cadastrarAeroportos(aeroportos);
                    mainAeroportos(aeroportos);
                    break;
                case 4://Cidades
                    //cadastrarCidades(cidades);
                    mainCidades(cidades);
                    break;
            }
            opcao = menu();
        }
    }

    public static void mainAeronaves(ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros) {
        final int FLAG = 0;
        int opcao;

        opcao = menuAeronaves();
        while (opcao != FLAG) {
            switch (opcao) {
                case 1://Listar
                    listarAeronaves(aviaos, helicopteros);
                    break;
                case 2://Cadastrar
                    cadastrarAeronaves(aviaos, helicopteros);
                    break;
                case 3://Remover
                    removerAeronaves(aviaos, helicopteros);
                    break;
            }
            opcao = menuAeronaves();
        }
    }

    public static void mainVoos(ArrayList<Voo> voos, ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros, ArrayList<Aeroporto> aeroportos) {
        final int FLAG = 0;
        int opcao;

        opcao = menuVoos();
        while (opcao != FLAG) {
            switch (opcao) {
                case 1://Listar

                    break;
                case 2://Cadastrar
                    cadastrarVoos(voos, aviaos, helicopteros, aeroportos);
                    break;
                case 3://Remover

                    break;
                case 4://Editar

                    break;
            }
            opcao = menuVoos();
        }
    }

    public static void mainAeroportos(ArrayList<Aeroporto> aeroportos) {
        final int FLAG = 0;
        int opcao;

        opcao = menuAeroportos();
        while (opcao != FLAG) {
            switch (opcao) {
                case 1://Listar

                    break;
                case 2://Cadastrar
                    cadastrarAeroportos(aeroportos);
                    break;
                case 3://Remover

                    break;
                case 4://Editar

                    break;
            }
            opcao = menuAeroportos();
        }
    }

    public static void mainCidades(ArrayList<Cidade> cidades) {
        final int FLAG = 0;
        int opcao;

        opcao = menuCidades();
        while (opcao != FLAG) {
            switch (opcao) {
                case 1://Listar

                    break;
                case 2://Cadastrar
                    cadastrarCidades(cidades);
                    break;
            }
            opcao = menuCidades();
        }
    }

    public static int menu() {
        int opcao = 0;
        boolean numeroValido = false;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opcoes: \n"
                        + " [1] - Aeronaves \n"
                        + " [2] - Vôos \n"
                        + " [3] - Aeroportos \n"
                        + " [4] - Cidades \n"
                        + " [0] - Sair \n"));
                if (opcao < 0 || opcao > 5) {
                    mensagem("Erro: Opção inválida.");
                } else {
                    numeroValido = true;
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!numeroValido);
        return opcao;
    }

    public static int menuAeronaves() {
        int opcao = 0;
        boolean numeroValido = false;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opcoes: \n"
                        + " [1] - Listar aeronaves \n"
                        + " [2] - Cadastrar aeronaves \n"
                        + " [3] - Remover aeronaves \n"
                        + " [0] - Voltar \n"));
                if (opcao < 0 || opcao > 3) {
                    mensagem("Erro: Opção inválida.");
                } else {
                    numeroValido = true;
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!numeroValido);
        return opcao;
    }

    public static int menuVoos() {
        int opcao = 0;
        boolean numeroValido = false;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opcoes: \n"
                        + " [1] - Listar Voos \n"
                        + " [2] - Cadastrar Voos \n"
                        + " [3] - Remover Voos \n"
                        + " [4] - Editar Voos \n"
                        + " [0] - Voltar \n"));
                if (opcao < 0 || opcao > 4) {
                    mensagem("Erro: Opção inválida.");
                } else {
                    numeroValido = true;
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!numeroValido);
        return opcao;
    }

    public static int menuAeroportos() {
        int opcao = 0;
        boolean numeroValido = false;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opcoes: \n"
                        + " [1] - Listar aeroportos \n"
                        + " [2] - Cadastrar aeroportos \n"
                        + " [3] - Remover aeroportos \n"
                        + " [4] - Editar aeroportos \n"
                        + " [0] - Voltar \n"));
                if (opcao < 0 || opcao > 4) {
                    mensagem("Erro: Opção inválida.");
                } else {
                    numeroValido = true;
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!numeroValido);
        return opcao;
    }

    public static int menuCidades() {
        int opcao = 0;
        boolean numeroValido = false;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opcoes: \n"
                        + " [1] - Listar Cidades \n"
                        + " [2] - Cadastrar Cidades \n"
                        + " [0] - Voltar \n"));
                if (opcao < 0 || opcao > 3) {
                    mensagem("Erro: Opção inválida.");
                } else {
                    numeroValido = true;
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!numeroValido);
        return opcao;
    }

    public static int menuTipoAeronaves() {
        int opcao = 0;
        boolean numeroValido = false;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tipo de aeronave que deseja cadastrar: \n"
                        + " [1] - Avião \n"
                        + " [2] - Helicópitero \n"));
                if (opcao < 1 || opcao > 2) {
                    mensagem("Erro: Opção inválida.");
                } else {
                    numeroValido = true;
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!numeroValido);

        return opcao;
    }

    public static int leNumero(String msg) {
        int num = 0;
        boolean numeroValido = false;

        do {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(msg));
                if (num >= 0) {
                    numeroValido = true;
                } else {
                    mensagem("Error: número menor que zero!");
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!numeroValido);
        return num;
    }

    public static String leEntrada(String msg) {
        String entrada = "";
        boolean entradaValida = false;

        do {
            try {
                entrada = JOptionPane.showInputDialog(msg);
                if (!"".equals(entrada)) {
                    entradaValida = true;
                } else {
                    mensagem("Error: entrada inválida!");
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!entradaValida);
        return entrada;
    }

    public static TIPO leTipo() {
        int entrada = 0;
        TIPO tipo = TIPO.RESGATE;
        boolean entradaValida = false;

        do {
            try {
                entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tipo de helicoptero que deseja cadastrar: \n"
                        + " [1] - Resgate \n"
                        + " [2] - Taxi aéreo \n"
                        + " [3] - Guarda costeira \n"));
                if (entrada >= 1 && entrada <= 3) {
                    entradaValida = true;
                } else {
                    mensagem("Error: entrada inválida!");
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!entradaValida);

        switch (entrada) {
            case 1://Resgate
                tipo = TIPO.RESGATE;
                break;
            case 2://Taxi aéreo
                tipo = TIPO.TAXIAEREO;
                break;
            case 3://Guarda costeira
                tipo = TIPO.QUARDACOSTEIRA;
                break;
        }

        return tipo;
    }

    public static Aeroporto leAeroporto(String msg) {
        Aeroporto aeroporto = new Aeroporto();
        boolean entradaValida = false;

        do {
            try {
                //lista
                //verifica

                //entrada = JOptionPane.showInputDialog(msg);
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!entradaValida);
        return aeroporto;
    }

    public static void mensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    //region Aeronave
    public static void listarAeronaves(ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros) {
        int tipoAeronave = menuTipoAeronaves();
        StringBuilder stringBuilder = new StringBuilder();

        switch (tipoAeronave) {
            case 1://Aviao
                if (aviaos.isEmpty()) {
                    mensagem("Lista vazia.");
                    return;
                }

                for (Aviao aviao : aviaos) {
                    stringBuilder.append("---------------------------- \n");
                    stringBuilder.append("Prefixo: ").append(aviao.getPrefixo()).append("\n");
                    stringBuilder.append("Modelo: ").append(aviao.getModelo()).append("\n");
                    stringBuilder.append("Fabricante: ").append(aviao.getFabricante()).append("\n");
                    stringBuilder.append("Empresa: ").append(aviao.getEmpresa()).append("\n");
                    stringBuilder.append("Assentos: ").append(aviao.getAssentos()).append("\n");
                }
                break;
            case 2://Helicoptero
                if (helicopteros.isEmpty()) {
                    mensagem("Lista vazia.");
                    return;
                }

                for (Helicoptero helicoptero : helicopteros) {
                    stringBuilder.append("---------------------------- \n");
                    stringBuilder.append("Prefixo: ").append(helicoptero.getPrefixo()).append("\n");
                    stringBuilder.append("Modelo: ").append(helicoptero.getModelo()).append("\n");
                    stringBuilder.append("Fabricante: ").append(helicoptero.getFabricante()).append("\n");
                    stringBuilder.append("Tipo: ").append(helicoptero.getTipo().getDescricao()).append("\n");
                }
                break;
        }

        mensagem(stringBuilder.toString());
    }

    public static void cadastrarAeronaves(ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros) {
        int tipoAeronave = menuTipoAeronaves();
        String prefixo = leEntrada("Entre com o prefixo da aeronave: ");
        String modelo = leEntrada("Entre com o modelo da aeronave: ");
        String fabricante = leEntrada("Entre com o fabricante da aeronave: ");

        switch (tipoAeronave) {
            case 1://Aviao
                int assentos = leNumero("Entre com a quantidade de assentos: ");
                String empresa = leEntrada("Entre com a empresa da aeronave: ");
                aviaos.add(new Aviao(assentos, empresa, prefixo, modelo, fabricante));
                break;
            case 2://Helicoptero
                TIPO tipo = leTipo();
                helicopteros.add(new Helicoptero(tipo, prefixo, modelo, fabricante));
                break;
        }
    }

    public static void removerAeronaves(ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros) {
        String prefixo;

        int tipoAeronave = menuTipoAeronaves();

        switch (tipoAeronave) {
            case 1://Aviao
                removerAviao(aviaos);
                break;
            case 2://Helicoptero
                removerHelicoptero(helicopteros);
                break;
        }
    }

    public static void removerAviao(ArrayList<Aviao> aviaos) {
        String prefixo;
        boolean prefixoExiste = false;

        if (aviaos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        prefixo = leEntrada("Insira o prefixo da Aeronave no qual deseja remover: \n");

        for (Aviao aviao : aviaos) {
            if (aviao.getPrefixo().equals(prefixo)) {
                prefixoExiste = true;
            }
        }

        if (prefixoExiste) {
            for (Aviao aviao : aviaos) {
                if (aviao.getPrefixo().equals(prefixo)) {
                    aviaos.remove(aviao);
                    mensagem("Aeronaves removida com sucesso!");
                    break;
                }
            }
        }

        if (!prefixoExiste) {
            mensagem("Prefixo não existe!");
        }
    }

    public static void removerHelicoptero(ArrayList<Helicoptero> helicopteros) {
        String prefixo;
        boolean prefixoExiste = false;

        if (helicopteros.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        prefixo = leEntrada("Insira o prefixo da Aeronave no qual deseja remover: \n");

        for (Helicoptero helicoptero : helicopteros) {
            if (helicoptero.getPrefixo().equals(prefixo)) {
                prefixoExiste = true;
            }
        }

        if (prefixoExiste) {
            for (Helicoptero helicoptero : helicopteros) {
                if (helicoptero.getPrefixo().equals(prefixo)) {
                    helicopteros.remove(helicoptero);
                    mensagem("Aeronaves removida com sucesso!");
                    break;
                }
            }
        }

        if (!prefixoExiste) {
            mensagem("Prefixo não existe!");
        }
    }
    //fim Aeronave

    //region Voo
    public static void cadastrarVoos(ArrayList<Voo> voos, ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros,
            ArrayList<Aeroporto> aeroportos) {
        if (aviaos.isEmpty() && helicopteros.isEmpty()) {
            mensagem("Não tem aeronaves para realizar Vôo.");
            return;
        }

        if (aeroportos.isEmpty()) {
            mensagem("Não tem aeroportos para realizar Vôo.");
            return;
        }

        int numero = leNumero("Entre com o numero do Voo: ");
        int numeroDeVagas = leNumero("Entre com o numero do assentos: ");
        String dataDePartida = leEntrada("Entre com a data de partida do Vôo: ");
        String horarioDePartida = leEntrada("Entre com o horario de partida do Vôo: ");
        String horarioDeChegada = leEntrada("Entre com o horario de chegada do Vôo: ");
        Aeroporto aeroportoDeOrigem = leAeroporto("Entre com o aeroporto de origem: ");
        Aeroporto aeroportoDeDestino = leAeroporto("Entre com o aeroporto de destino: ");
        Aeronave aeronave;
    }

    //fim Voo
    
    //Region Aeroporto
    public static void cadastrarAeroportos(ArrayList<Aeroporto> aeroportos) {

    }

    //fim Aeroporto
    
    //Region Cidades
    public static void cadastrarCidades(ArrayList<Cidade> cidades) {

    }

    //fim Cidades
}
