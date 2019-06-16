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
        Aviao aviao1 = new Aviao(100, "Gol", "IAC", "Airbus A380", "MC-21");
        Aviao aviao2 = new Aviao(100, "Tam", "ADS", "Boeing 707", "Mitsubishi MRJ");
        Helicoptero helicoptero1 = new Helicoptero(TIPO.TAXIAEREO, "BNC", "B06", "Airbus");

        aviaos.add(aviao1);
        aviaos.add(aviao2);
        helicopteros.add(helicoptero1);

        //Cidades
        Cidade cidade1 = new Cidade("Rio de Janeiro", 1.255f);
        Cidade cidade2 = new Cidade("São Paulo", 1.521f);
        Cidade cidade3 = new Cidade("Salvador", 692.8f);

        cidades.add(cidade1);
        cidades.add(cidade2);
        cidades.add(cidade3);

        cidade1.setCidadeFronteira(cidade2);
        cidade1.setCidadeFronteira(cidade3);

        cidade2.setCidadeFronteira(cidade1);
        cidade2.setCidadeFronteira(cidade3);

        cidade3.setCidadeFronteira(cidade1);
        cidade3.setCidadeFronteira(cidade1);

        //Aeroportos
        Aeroporto aeroporto1 = new Aeroporto("AER", "Aeroporto Real");
        aeroporto1.setCidade(cidade1);
        aeroporto1.setInternacional(false);

        Aeroporto aeroporto2 = new Aeroporto("REA", "Aeroporto Falso");
        aeroporto2.setCidade(cidade2);
        aeroporto2.setInternacional(false);

        Aeroporto aeroporto3 = new Aeroporto("IUO", "Aeroporto JiuJitsu");
        aeroporto3.setCidade(cidade3);
        aeroporto3.setInternacional(true);

        aeroporto1.setAeroportosComVoosDiretos(aeroporto2);
        aeroporto2.setAeroportosQueVemVoos(aeroporto1);

        aeroportos.add(aeroporto1);
        aeroportos.add(aeroporto2);
        aeroportos.add(aeroporto3);

        //Voos
        voos.add(new Voo(111, 100, "16/06/2019", "10:00", "20:00", aeroporto1, aeroporto2, aviao1));
        voos.add(new Voo(222, 100, "17/07/2019", "12:00", "22:00", aeroporto3, aeroporto1, aviao2));

        mainMenu(aviaos, helicopteros, voos, aeroportos, cidades);
    }

    //region Main
    public static void mainMenu(ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros, ArrayList<Voo> voos, ArrayList<Aeroporto> aeroportos, ArrayList<Cidade> cidades) {
        final int FLAG = 0;
        int opcao;

        opcao = menu();
        while (opcao != FLAG) {
            switch (opcao) {
                case 1://Aeronaves
                    mainAeronaves(aviaos, helicopteros);
                    break;
                case 2://Voos
                    mainVoos(voos, aviaos, helicopteros, aeroportos);
                    break;
                case 3://Aeroportos
                    mainAeroportos(aeroportos, cidades, aviaos, helicopteros);
                    break;
                case 4://Cidades
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
                    listarVoos(voos);
                    break;
                case 2://Cadastrar
                    cadastrarVoos(voos, aviaos, helicopteros, aeroportos);
                    break;
                case 3://Remover
                    removerVoos(voos);
                    break;
                case 4://Editar
                    editarVoos(voos, aeroportos, aviaos, helicopteros);
                    break;
            }
            opcao = menuVoos();
        }
    }

    public static void mainAeroportos(ArrayList<Aeroporto> aeroportos, ArrayList<Cidade> cidades, ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros) {
        final int FLAG = 0;
        int opcao;

        opcao = menuAeroportos();
        while (opcao != FLAG) {
            switch (opcao) {
                case 1:// Listar codigos dos aeroportos  |  digitar o codigo para mais detalhes (nome, cidade, internacional)
                    listarAeroportos(aeroportos);
                    break;
                case 2://Cadastrar aeroportos
                    cadastrarAeroportos(aeroportos, cidades);
                    break;
                case 3://Remover aeroportos
                    removerAaeroportos(aeroportos);
                    break;
                case 4://Verificar se um aeroporto é igual a ele
                    aeroportosIguais(aeroportos);
                    break;
                case 5://Consultar aeronaves pousada
                    consultarAeronavePousada(aeroportos, aviaos, helicopteros);
                    break;
                case 6://Consultar rotas
                    verificarRota(aeroportos);
                    break;
                case 7://Alteracoes
                    editarAeroportos(aeroportos, aviaos, helicopteros);
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
                    listarCidades(cidades);
                    break;
                case 2://Cadastrar
                    cadastrarCidades(cidades);
                    break;
                case 3://Limítrofe
                    cidadesLimitrofe(cidades);
                    break;
                case 4://Vizinhos comuns
                    cidadesComuns(cidades);
                    break;
                case 5://Verificar se uma cidade é igual a outra
                    cidadesIguais(cidades);
                    break;
            }
            opcao = menuCidades();
        }
    }
    //endregion

    //region Menu
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
                        + " [1] - Consultar Voos \n"
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
                        + " [1] - Listar codigos dos aeroportos \n" //digitar o codigo para mais detalhes (nome, cidade, internacional)
                        + " [2] - Cadastrar aeroportos \n"
                        + " [3] - Remover aeroportos \n"
                        + " [4] - Verificar se um aeroporto é igual a outro \n"
                        + " [5] - Consultar aeronaves pousada \n"
                        + " [6] - Consultar rotas \n"
                        + " [7] - Alteracoes \n"
                        + " [0] - Voltar \n"));
                if (opcao < 0 || opcao > 7) {
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
                        + " [1] - Listar cidades \n"
                        + " [2] - Cadastrar cidades \n"
                        + " [3] - Limítrofe \n"
                        + " [4] - Vizinhos comuns \n"
                        + " [5] - Verificar se uma cidade é igual a outra \n"
                        + " [0] - Voltar \n"));
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

    public static int menuAlteracaoVoo() {
        int opcao = 0;
        boolean numeroValido = false;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja alterar? \n"
                        + " [1] - Numero de vagas \n"
                        + " [2] - Data de partida \n"
                        + " [3] - Horario de partida \n"
                        + " [4] - Horario de chegada \n"
                        + " [5] - Aeroporto de origem \n"
                        + " [6] - Aeroporto de destino \n"
                        + " [7] - Aeronave \n"
                        + " [0] - cancelar \n"));
                if (opcao < 0 || opcao > 7) {
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

    public static int menuAlteracaoAeroportos() {
        int opcao = 0;
        boolean numeroValido = false;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja alterar? \n"
                        + " [1] - Inserir aeronaves pousadas \n"
                        + " [2] - Modificar internacional \n"
                        + " [0] - cancelar \n"));
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
    //endregion

    //regin Le
    public static int leInteiro(String msg) {
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

    public static float leFloat(String msg) {
        float num = 0;
        boolean numeroValido = false;

        do {
            try {
                num = Float.parseFloat(JOptionPane.showInputDialog(msg));
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

    public static String leString(String msg) {
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

    public static boolean leBoolean(String msg) {
        int verificar = 0;
        boolean entrada = false;
        boolean entradaValida = false;

        do {
            try {
                verificar = Integer.parseInt(JOptionPane.showInputDialog(null, msg + "\n"
                        + " [1] - Sim \n"
                        + " [2] - Não \n"));
                if (verificar == 1 || verificar == 2) {
                    entradaValida = true;
                } else {
                    mensagem("Error: entrada inválida!");
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!entradaValida);

        switch (verificar) {
            case 1://Resgate
                entrada = true;
                break;
            case 2://Taxi aéreo
                entrada = false;
                break;
        }

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

    public static Aeroporto leAeroporto(String msg, ArrayList<Aeroporto> aeroportos) {
        Aeroporto aeroporto = new Aeroporto();
        boolean entradaValida = false;
        String entrada;

        do {
            try {
                entrada = JOptionPane.showInputDialog(msg);
                for (Aeroporto aeroporto1 : aeroportos) {
                    if (aeroporto1.getCodigo().equals(entrada)) {
                        aeroporto = aeroporto1;
                        entradaValida = true;
                    }
                }

                if (!entradaValida) {
                    mensagem("Codigo nao existe!");
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!entradaValida);
        return aeroporto;
    }

    public static Cidade leCidade(String msg, ArrayList<Cidade> cidades) {
        Cidade cidade = new Cidade();
        boolean entradaValida = false;
        String entrada;

        do {
            try {
                entrada = JOptionPane.showInputDialog(msg);
                for (Cidade cidade1 : cidades) {
                    if (cidade1.getNome().equals(entrada)) {
                        cidade = cidade1;
                        entradaValida = true;
                    }
                }

                if (!entradaValida) {
                    mensagem("Nome nao existe!");
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!entradaValida);

        return cidade;
    }

    public static Aviao leAviao(String msg, ArrayList<Aviao> aviaos) {
        Aviao aviao = new Aviao();
        boolean entradaValida = false;
        String entrada;

        do {
            try {
                entrada = JOptionPane.showInputDialog(msg);
                for (Aviao aviao1 : aviaos) {
                    if (aviao1.getPrefixo().equals(entrada)) {
                        aviao = aviao1;
                        entradaValida = true;
                    }
                }

                if (!entradaValida) {
                    mensagem("Prefixo nao existe!");
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!entradaValida);

        return aviao;
    }

    public static Helicoptero leHelicoptero(String msg, ArrayList<Helicoptero> helicopteros) {
        Helicoptero helicoptero = new Helicoptero();
        boolean entradaValida = false;
        String entrada;

        do {
            try {
                entrada = JOptionPane.showInputDialog(msg);
                for (Helicoptero helicoptero1 : helicopteros) {
                    if (helicoptero1.getPrefixo().equals(entrada)) {
                        helicoptero = helicoptero1;
                        entradaValida = true;
                    }
                }

                if (!entradaValida) {
                    mensagem("Prefixo nao existe!");
                }
            } catch (Exception e) {
                mensagem("Error: entrada inválida!");
            }
        } while (!entradaValida);

        return helicoptero;
    }
    //endregion

    //region Consulta
    public static String consultarAeroportos(ArrayList<Aeroporto> aeroportos) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Aeroporto aeroporto : aeroportos) {
            stringBuilder.append("Codigo: ").append(aeroporto.getCodigo()).append("\n");
            stringBuilder.append("Nome: ").append(aeroporto.getNome()).append("\n");
            stringBuilder.append("Cidade: ").append(aeroporto.getCidade().getNome()).append("\n");
            stringBuilder.append("Internacional: ").append(aeroporto.isInternacional()).append("\n");
            stringBuilder.append("---------------------------- \n");
        }

        return stringBuilder.toString();
    }

    public static String consultarCodigoAeroportos(ArrayList<Aeroporto> aeroportos) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Aeroporto aeroporto : aeroportos) {
            stringBuilder.append("Codigo: ").append(aeroporto.getCodigo()).append("\n");
            stringBuilder.append("---------------------------- \n");
        }

        return stringBuilder.toString();
    }

    public static String consultarCidades(ArrayList<Cidade> cidades) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Cidade cidade : cidades) {
            stringBuilder.append("Nome: ").append(cidade.getNome()).append("\n");
            stringBuilder.append("---------------------------- \n");
        }

        return stringBuilder.toString();
    }

    public static String consultarVoos(ArrayList<Voo> voos) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Voo voo : voos) {
            stringBuilder.append("---------------------------- \n");
            stringBuilder.append("Numero: ").append(voo.getNumero()).append("\n");
        }

        return stringBuilder.toString();
    }

    public static String consultarAeronaves(ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros, int tipoAeronave) {

        StringBuilder stringBuilder = new StringBuilder();

        switch (tipoAeronave) {
            case 1://Aviao

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

                for (Helicoptero helicoptero : helicopteros) {
                    stringBuilder.append("---------------------------- \n");
                    stringBuilder.append("Prefixo: ").append(helicoptero.getPrefixo()).append("\n");
                    stringBuilder.append("Modelo: ").append(helicoptero.getModelo()).append("\n");
                    stringBuilder.append("Fabricante: ").append(helicoptero.getFabricante()).append("\n");
                    stringBuilder.append("Tipo: ").append(helicoptero.getTipo().getDescricao()).append("\n");
                }
                break;
        }

        return stringBuilder.toString();
    }
    //endregion

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
        String prefixo = leString("Entre com o prefixo da aeronave: ");
        String modelo = leString("Entre com o modelo da aeronave: ");
        String fabricante = leString("Entre com o fabricante da aeronave: ");

        switch (tipoAeronave) {
            case 1://Aviao
                int assentos = leInteiro("Entre com a quantidade de assentos: ");
                String empresa = leString("Entre com a empresa da aeronave: ");
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
                removerAviao(aviaos, helicopteros, tipoAeronave);
                break;
            case 2://Helicoptero
                removerHelicoptero(aviaos, helicopteros, tipoAeronave);
                break;
        }
    }

    public static void removerAviao(ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros, int tipoAeronave) {
        String prefixo;
        boolean prefixoExiste = false;

        if (aviaos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        prefixo = leString("Insira o prefixo da Aeronave no qual deseja remover: \n" + consultarAeronaves(aviaos, helicopteros, tipoAeronave));

        for (Aviao aviao : aviaos) {
            if (aviao.getPrefixo().equals(prefixo)) {
                prefixoExiste = true;
                aviaos.remove(aviao);
                mensagem("Aeronaves removida com sucesso!");
                break;
            }
        }

        if (!prefixoExiste) {
            mensagem("Prefixo não existe!");
        }
    }

    public static void removerHelicoptero(ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros, int tipoAeronave) {
        String prefixo;
        boolean prefixoExiste = false;

        if (helicopteros.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        prefixo = leString("Insira o prefixo da Aeronave no qual deseja remover: \n" + consultarAeronaves(aviaos, helicopteros, tipoAeronave));

        for (Helicoptero helicoptero : helicopteros) {
            if (helicoptero.getPrefixo().equals(prefixo)) {
                prefixoExiste = true;
                helicopteros.remove(helicoptero);
                mensagem("Aeronaves removida com sucesso!");
                break;
            }
        }

        if (!prefixoExiste) {
            mensagem("Prefixo não existe!");
        }
    }
    //endregion

    //region Voo
    public static void listarVoos(ArrayList<Voo> voos) {
        if (voos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        boolean numeroExiste = false;
        int numero;

        numero = leInteiro("Insira o numero do Voo no qual deseja consultar: \n" + consultarVoos(voos));

        for (Voo voo : voos) {
            if (voo.getNumero() == (numero)) {
                numeroExiste = true;
                stringBuilder.append("Numero: ").append(voo.getNumero()).append("\n");
                stringBuilder.append("Numero de vagas: ").append(voo.getNumeroDeVagas()).append("\n");
                stringBuilder.append("Data de partida: ").append(voo.getDataDePartida()).append("\n");
                stringBuilder.append("Horario de partida: ").append(voo.getHorarioDePartida()).append("\n");
                stringBuilder.append("Horario de chegada: ").append(voo.getHorarioDeChegada()).append("\n");
                stringBuilder.append("Prefixo Aeronave: ").append(voo.getAeronave().getPrefixo()).append("\n");
                stringBuilder.append("Modelo Aeronave: ").append(voo.getAeronave().getModelo()).append("\n");
                stringBuilder.append("Fabricante Aeronave: ").append(voo.getAeronave().getFabricante()).append("\n");
                stringBuilder.append("Nome aeroporto de origem: ").append(voo.getAeroportoDeOrigem().getNome()).append("\n");
                stringBuilder.append("Codigo aeroporto de origem: ").append(voo.getAeroportoDeOrigem().getCodigo()).append("\n");
                stringBuilder.append("Nome aeroporto de destino: ").append(voo.getAeroportoDeDestino().getNome()).append("\n");
                stringBuilder.append("Codigo aeroporto de destino: ").append(voo.getAeroportoDeDestino().getCodigo()).append("\n");
                break;
            }
        }

        if (!numeroExiste) {
            mensagem("Numero não existe!");
        }

        mensagem(stringBuilder.toString());
    }

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

        int numero = leInteiro("Entre com o numero do Voo: ");
        int numeroDeVagas = leInteiro("Entre com o numero do assentos: ");
        String dataDePartida = leString("Entre com a data de partida do Vôo: ");
        String horarioDePartida = leString("Entre com o horario de partida do Vôo: ");
        String horarioDeChegada = leString("Entre com o horario de chegada do Vôo: ");
        Aeroporto aeroportoDeOrigem = leAeroporto("Entre com o codigo do aeroporto de origem: \n" + consultarAeroportos(aeroportos), aeroportos);
        Aeroporto aeroportoDeDestino = leAeroporto("Entre com o codigo do aeroporto de destino: \n" + consultarAeroportos(aeroportos), aeroportos);
        if (aeroportoDeOrigem.equals(aeroportoDeDestino)) {
            mensagem("Os aeroportos são iguais.");
            while (aeroportoDeOrigem.equals(aeroportoDeDestino)) {
                aeroportoDeDestino = leAeroporto("Entre com o codigo do novo aeroporto de destino: \n" + consultarAeroportos(aeroportos), aeroportos);
            }
        }
        int tipoAeronave = menuTipoAeronaves();
        switch (tipoAeronave) {
            case 1://aviao
                Aviao aviao = leAviao("Entre com o prefixo do aviao \n" + consultarAeronaves(aviaos, helicopteros, tipoAeronave), aviaos);
                voos.add(new Voo(numero, numeroDeVagas, dataDePartida, horarioDePartida, horarioDeChegada, aeroportoDeOrigem, aeroportoDeDestino, aviao));
                break;
            case 2://helicoptero
                Helicoptero helicoptero = leHelicoptero("Entre com o prefixo do aviao \n" + consultarAeronaves(aviaos, helicopteros, tipoAeronave), helicopteros);
                voos.add(new Voo(numero, numeroDeVagas, dataDePartida, horarioDePartida, horarioDeChegada, aeroportoDeOrigem, aeroportoDeDestino, helicoptero));
                break;
        }

        aeroportoDeOrigem.setAeroportosComVoosDiretos(aeroportoDeDestino);
        aeroportoDeDestino.setAeroportosQueVemVoos(aeroportoDeOrigem);
    }

    public static void removerVoos(ArrayList<Voo> voos) {
        if (voos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        int numero;
        boolean numeroExiste = false;

        numero = leInteiro("Insira o numero do Voo no qual deseja remover: \n" + consultarVoos(voos));

        for (Voo voo : voos) {
            if (voo.getNumero() == (numero)) {
                numeroExiste = true;
                voos.remove(voo);
                mensagem("Aeronaves removida com sucesso!");
                break;
            }
        }

        if (!numeroExiste) {
            mensagem("Numero não existe!");
        }
    }

    public static void editarVoos(ArrayList<Voo> voos, ArrayList<Aeroporto> aeroportos, ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros) {
        if (voos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        int opcaoAlteracao;
        int numero;
        boolean numeroExiste = false;

        numero = leInteiro("Insira o numero do voo no qual deseja fazer a alteração: \n"
                + consultarVoos(voos));
        for (Voo voo : voos) {
            if (voo.getNumero() == (numero)) {
                numeroExiste = true;
                opcaoAlteracao = menuAlteracaoVoo();
                switch (opcaoAlteracao) {
                    case 1: //Alterar numeroDeVagas
                        voo.setNumeroDeVagas(leInteiro("Entre com o novo numero do assentos: "));
                        break;
                    case 2: //Alterar dataDePartida
                        voo.setDataDePartida(leString("Entre com a nova data de partida do Vôo: "));
                        break;
                    case 3: //ALterar horarioDePartida
                        voo.setHorarioDePartida(leString("Entre com o novo horario de partida do Vôo: "));
                        break;
                    case 4: //ALterar horarioDeChegada
                        voo.setHorarioDeChegada(leString("Entre com o novo horario de chegada do Vôo: "));
                        break;
                    case 5: //ALterar aeroportoDeOrigem
                        voo.setAeroportoDeDestino(leAeroporto("Entre com o novo codigo do aeroporto de destino: \n" + consultarAeroportos(aeroportos), aeroportos));
                        break;
                    case 6: //ALterar aeroportoDeDestino
                        voo.setAeroportoDeOrigem(leAeroporto("Entre com o novo codigo do aeroporto de origem: \n" + consultarAeroportos(aeroportos), aeroportos));
                        break;
                    case 7: //ALterar aeronave
                        int tipoAeronave = menuTipoAeronaves();
                        switch (tipoAeronave) {
                            case 1://aviao
                                voo.setAeronave(leAviao("Entre com o prefixo do aviao \n" + consultarAeronaves(aviaos, helicopteros, tipoAeronave), aviaos));
                                break;
                            case 2://helicoptero
                                voo.setAeronave(leHelicoptero("Entre com o prefixo do helicoptero \n" + consultarAeronaves(aviaos, helicopteros, tipoAeronave), helicopteros));
                                break;
                        }
                        break;
                    case 0: //Cancelar
                        mensagem("Alteração cancelada!");
                        return;
                }
            }
        }

        if (!numeroExiste) {
            mensagem("Numero não existe!");
        }
    }
    //endregion

    //region Aeroporto
    public static void listarAeroportos(ArrayList<Aeroporto> aeroportos) {
        if (aeroportos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        boolean codigoExiste = false;
        String codigo;

        codigo = leString("Insira o codigo do Aeroporto no qual deseja consultar: \n" + consultarCodigoAeroportos(aeroportos));

        for (Aeroporto aeroporto : aeroportos) {
            if (aeroporto.getCodigo().equals(codigo)) {
                codigoExiste = true;
                stringBuilder.append("Codigo: ").append(aeroporto.getCodigo()).append("\n");
                stringBuilder.append("Nome: ").append(aeroporto.getNome()).append("\n");
                stringBuilder.append("Cidade: ").append(aeroporto.getCidade().getNome()).append("\n");
                stringBuilder.append("Internacional: ").append(aeroporto.isInternacional()).append("\n");
                stringBuilder.append("---------------------------- \n");
                break;
            }
        }

        if (!codigoExiste) {
            mensagem("Codigo não existe!");
        }

        mensagem(stringBuilder.toString());
    }

    public static void cadastrarAeroportos(ArrayList<Aeroporto> aeroportos, ArrayList<Cidade> cidades) {
        String codigo = leString("Entre com o codigo do aeroporto: ");
        String nome = leString("Entre com o nome do aeroporto: ");

        Aeroporto aeroportoCobaia = new Aeroporto(codigo, nome);

        aeroportoCobaia.setCidade(leCidade("Entre com o nome da cidade do aeroporto \n" + consultarCidades(cidades), cidades));
        aeroportoCobaia.setInternacional(leBoolean("É um aeroporto internacional? \n"));

        aeroportos.add(aeroportoCobaia);
    }

    public static void removerAaeroportos(ArrayList<Aeroporto> aeroportos) {
        if (aeroportos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        String codigo;
        boolean codigoExiste = false;

        codigo = leString("Insira o codigo do aeroporto no qual deseja remover: \n" + consultarCodigoAeroportos(aeroportos));

        for (Aeroporto aeroporto : aeroportos) {
            if (aeroporto.getCodigo().equals(codigo)) {
                codigoExiste = true;
                aeroportos.remove(aeroporto);
                mensagem("Aeroporto removido com sucesso!");
                break;
            }
        }

        if (!codigoExiste) {
            mensagem("Codigo não existe!");
        }
    }

    public static void aeroportosIguais(ArrayList<Aeroporto> aeroportos) {
        if (aeroportos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        Aeroporto aeroporto1 = leAeroporto("Entre com o codigo do aeroporto: \n" + consultarCodigoAeroportos(aeroportos), aeroportos);
        Aeroporto aeroporto2 = leAeroporto("Entre com o codigo do aeroporto que deseje verificar se é igual a " + aeroporto1.getNome() + "\n"
                + consultarCodigoAeroportos(aeroportos), aeroportos);

        if (aeroporto1.equals(aeroporto2)) {
            mensagem("O aeroporto " + aeroporto1.getNome() + " é igual a " + aeroporto2.getNome());
        } else {
            mensagem("O aeroporto " + aeroporto1.getNome() + " não é igual a " + aeroporto2.getNome());
        }
    }

    public static void consultarAeronavePousada(ArrayList<Aeroporto> aeroportos, ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros) {
        if (aeroportos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        Aeroporto aeroporto = leAeroporto("Entre com o codigo do aeroporto: \n" + consultarCodigoAeroportos(aeroportos), aeroportos);

        int tipoAeronave = menuTipoAeronaves();
        switch (tipoAeronave) {
            case 1://aviao
                Aviao aviao = leAviao("Entre com o prefixo do aviao \n" + consultarAeronaves(aviaos, helicopteros, tipoAeronave), aviaos);
                if (aeroporto.getAeronavesNoPatio(aviao.getPrefixo())) {
                    mensagem("O avião esta no patio");
                } else {
                    mensagem("O avião não esta no patio");
                }
                break;
            case 2://helicoptero
                Helicoptero helicoptero = leHelicoptero("Entre com o prefixo do helicoptero \n" + consultarAeronaves(aviaos, helicopteros, tipoAeronave), helicopteros);
                if (aeroporto.getAeronavesNoPatio(helicoptero.getPrefixo())) {
                    mensagem("O helicoptero esta no patio");
                } else {
                    mensagem("O helicoptero não esta no patio");
                }
                break;
        }
    }

    public static void verificarRota(ArrayList<Aeroporto> aeroportos) {
        if (aeroportos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        Aeroporto aeroporto1 = leAeroporto("Entre com o codigo do aeroporto atual: \n" + consultarCodigoAeroportos(aeroportos), aeroportos);
        Aeroporto aeroporto2 = leAeroporto("Entre com o codigo do aeroporto que deseje verificar se possui rota: \n" + consultarCodigoAeroportos(aeroportos), aeroportos);

        if (aeroporto1.possuiRota(aeroporto2)) {
            mensagem("Possui Voo direto");
        } else {
            mensagem(aeroporto1.possuiRotaAlternativa(aeroporto2));
        }
    }

    public static void editarAeroportos(ArrayList<Aeroporto> aeroportos, ArrayList<Aviao> aviaos, ArrayList<Helicoptero> helicopteros) {
        if (aeroportos.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        int opcaoAlteracao;
        String codigo;
        boolean codigoExiste = false;

        codigo = leString("Insira o codigo do aeroporto no qual deseja remover: \n" + consultarCodigoAeroportos(aeroportos));

        for (Aeroporto aeroporto : aeroportos) {
            if (aeroporto.getCodigo().equals(codigo)) {
                codigoExiste = true;
                opcaoAlteracao = menuAlteracaoAeroportos();
                switch (opcaoAlteracao) {
                    case 1: //Inserir aeronaves pousadas
                        int tipoAeronave = menuTipoAeronaves();
                        switch (tipoAeronave) {
                            case 1://aviao
                                Aviao aviao1 = leAviao("Entre com o prefixo do aviao \n" + consultarAeronaves(aviaos, helicopteros, tipoAeronave), aviaos);
                                aeroporto.setAeronavesNoPatio(aviao1);

                                for (Aeroporto aeroporto1 : aeroportos) {
                                    if (!aeroporto1.equals(aeroporto) && aeroporto1.getAeronavesNoPatio(aviao1.getPrefixo())) {
                                        aeroporto1.removeAeronavesNoPatio(aviao1);
                                    }
                                }
                                break;
                            case 2://helicoptero
                                Helicoptero helicoptero1 = leHelicoptero("Entre com o prefixo do helicoptero \n" + consultarAeronaves(aviaos, helicopteros, tipoAeronave), helicopteros);
                                aeroporto.setAeronavesNoPatio(helicoptero1);

                                for (Aeroporto aeroporto1 : aeroportos) {
                                    if (!aeroporto1.equals(aeroporto) && aeroporto1.getAeronavesNoPatio(helicoptero1.getPrefixo())) {
                                        aeroporto1.removeAeronavesNoPatio(helicoptero1);
                                    }
                                }
                                break;
                        }
                        break;
                    case 2: //Modificar internacional
                        aeroporto.setInternacional(leBoolean("É um aeroporto internacional? \n"));
                        break;
                    case 0: //Cancelar
                        mensagem("Alteração cancelada!");
                        return;
                }
            }
        }

        if (!codigoExiste) {
            mensagem("Codigo não existe!");
        }
    }
    //endregion

    //Region Cidades
    public static void listarCidades(ArrayList<Cidade> cidades) {
        if (cidades.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Cidade cidade : cidades) {
            stringBuilder.append("Nome: ").append(cidade.getNome()).append("\n");
            stringBuilder.append("Dimensão: ").append(cidade.getDimensao()).append("\n");
            stringBuilder.append("---------------------------- \n");
        }

        mensagem(stringBuilder.toString());
    }

    public static void cadastrarCidades(ArrayList<Cidade> cidades) {
        if (cidades.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        String nome = leString("Entre com o nome da Cidade: ");
        float dimensao = leFloat("Entre com a dimensão em Km2 da cidade");
        Cidade cidadeTeste = new Cidade(nome, dimensao);

        for (Cidade cidade : cidades) {
            if (cidade.equals(cidadeTeste)) {
                mensagem("Cidade já existe.");
                return;
            }
        }

        cidades.add(cidadeTeste);
    }

    public static void cidadesLimitrofe(ArrayList<Cidade> cidades) {
        if (cidades.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        Cidade cidade1 = leCidade("Entre com o nome da cidade: \n" + consultarCidades(cidades), cidades);
        Cidade cidade2 = leCidade("Entre com o nome da cidade que deseje verificar se faz fronteira com " + cidade1.getNome() + "\n"
                + consultarCidades(cidades), cidades);

        if (cidade1.limitrofe(cidade2)) {
            mensagem("A cidade " + cidade1.getNome() + " faz fronteira com a " + cidade2.getNome());
        } else {
            mensagem("A cidade " + cidade1.getNome() + " não faz fronteira com a " + cidade2.getNome());
        }
    }

    public static void cidadesComuns(ArrayList<Cidade> cidades) {
        if (cidades.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        Cidade cidade1 = leCidade("Entre com o nome da cidade: \n" + consultarCidades(cidades), cidades);
        Cidade cidade2 = leCidade("Entre com o nome da cidade que deseje consultar os vizinhos comuns com " + cidade1.getNome() + "\n"
                + consultarCidades(cidades), cidades);

        mensagem(cidade1.vizinhosComuns(cidade2));
    }

    public static void cidadesIguais(ArrayList<Cidade> cidades) {
        if (cidades.isEmpty()) {
            mensagem("Lista vazia.");
            return;
        }

        Cidade cidade1 = leCidade("Entre com o nome da cidade: \n" + consultarCidades(cidades), cidades);
        Cidade cidade2 = leCidade("Entre com o nome da cidade que deseje verificar se é igual a " + cidade1.getNome() + "\n"
                + consultarCidades(cidades), cidades);

        if (cidade1.equals(cidade2)) {
            mensagem("A cidade " + cidade1.getNome() + " é igual a " + cidade2.getNome());
        } else {
            mensagem("A cidade " + cidade1.getNome() + " não é igual a " + cidade2.getNome());
        }
    }
    //endregion
}
