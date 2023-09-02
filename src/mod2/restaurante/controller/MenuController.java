package mod2.restaurante.controller;

import mod2.restaurante.dominio.Cliente;
import mod2.restaurante.dominio.Pedido;
import mod2.restaurante.dominio.Prato;
import mod2.restaurante.dominio.Restaurante;
import mod2.restaurante.service.ClienteService;
import mod2.restaurante.service.PedidoService;
import mod2.restaurante.service.RestauranteService;

import java.util.List;
import java.util.Scanner;

public class MenuController {
    private RestauranteService restauranteService;
    private ClienteService clienteService;
    private PedidoService pedidoService;

    private Scanner scanner;

    public MenuController(RestauranteService restauranteService, ClienteService clienteService, PedidoService pedidoService) {
        this.restauranteService = restauranteService;
        this.clienteService = clienteService;
        this.pedidoService = pedidoService;
        this.scanner = new Scanner(System.in);
    }
    public void exibirMenu() {
        while (true) {
            System.out.println("Sistema de Pedidos de Restaurantes");
            System.out.println("1. Cadastrar Restaurante");
            System.out.println("2. Listar Restaurantes");
            System.out.println("3. Adicionar Prato");
            System.out.println("4. Listar Pratos de um Restaurante");
            System.out.println("5. Fazer um Pedido");
            System.out.println("6. Listar pedidos de um restaurante");
            System.out.println("7. Ver Pedidos de um Cliente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao;

            opcao = scanner.nextInt();
            scanner.nextLine();
            if(opcao>7 || opcao<0){

                System.out.println("Opção inválida! Por favor, insira um número.");
                scanner.nextLine();

            }else{
                switch (opcao) {
                    case 1:
                        cadastrarRestaurante();
                        break;
                    case 2:
                        listarRestaurantes();
                        break;
                    case 3:
                        adicionarPrato();
                        break;
                    case 4:
                        listarPratosRestaurante();
                        break;
                    case 5:
                        fazerPedido();
                        break;
                    case 6:
                        listarPedidosRestaurante();
                        break;
                    case 7:
                        verPedidosCliente();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Opção inválida!");
                        System.out.println();
                }
            }

        }
    }

    private void cadastrarRestaurante() {
        System.out.print("Nome do Restaurante: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço do Restaurante: ");
        String endereco = scanner.nextLine();
        restauranteService.addRestaurantes(nome,endereco);
        System.out.println("Restaurante cadastrado com sucesso!");
        System.out.println();
    }
    private void listarRestaurantes() {
        List<Restaurante> restaurantes = restauranteService.findAllRestaurantes();
        if (restaurantes.isEmpty()) {
            System.out.println("Nenhum restaurante cadastrado!");
            System.out.println();
        } else {
            for (Restaurante restaurante : restaurantes) {
                System.out.print(restaurante.toString());

            }
            System.out.println();
        }
    }

    private void listarClientes(){
        List<Cliente> clientes = clienteService.findAllClientes();
        if(clientes.isEmpty()){
            System.out.println("Nenhum restaurante cadastrado!");
            System.out.println();
        }else{
            for (Cliente cliente: clientes){
                System.out.print(cliente.toString());
            }
            System.out.println();
        }
    }

    private void adicionarPrato() {
        System.out.print("Selecione seu restaurante ");
        listarRestaurantes();
        System.out.print("Identificador do Restaurante: ");
        int identificador = scanner.nextInt();
        scanner.nextLine();
        if(restauranteService.validaRestaurante(identificador)){
            System.out.print("Nome do Prato: ");
            String nomePrato = scanner.nextLine();
            System.out.print("Preço do Prato: ");
            Double preco = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Descrição do Prato: ");
            String descricao = scanner.nextLine();
            restauranteService.adicionarPrato(identificador, nomePrato, preco, descricao);
            System.out.println("Prato adicionado com sucesso!");
            System.out.println();
        }else{
            System.out.print("Restaurante não encontrado!");
            System.out.println();
            scanner.nextLine();
        }

    }

    private void listarPratosRestaurante() {
        System.out.print("Selecione seu restaurante ");
        listarRestaurantes();
        System.out.print("Identificador do Restaurante: ");
        int identificador = scanner.nextInt();
        scanner.nextLine();
        if(restauranteService.validaRestaurante(identificador)){
            List<Prato> pratos = restauranteService.findAllPratos(identificador);
            if (pratos == null || pratos.isEmpty()) {
                System.out.println("Nenhum prato encontrado para o restaurante informado!");
                System.out.println();
            } else {
                System.out.println("Pratos disponíveis no restaurante:");
                for (Prato prato : pratos) {
                    System.out.println(prato.getNome() + ", R$" + prato.getPreco());
                }
            }
        }else{
            System.out.print("Restaurante não encontrado!");
            System.out.println();
            scanner.nextLine();
        }

    }

    private void fazerPedido() {
        Cliente cliente = null;
        System.out.print("Já existe um cliente para este pedido? (S/N): ");
        String opcao = scanner.nextLine();
        if (opcao.equalsIgnoreCase("S")) {
            System.out.print("Selecione o cliente:");
            System.out.print("0 Voltar");
            listarClientes();
            System.out.print("Identificador do Cliente: ");
            int identificadorCliente = scanner.nextInt();
            scanner.nextLine();
             cliente = clienteService.buscarCliente(identificadorCliente);
            if (cliente == null) {
                System.out.println("Cliente não encontrado!");
                return;
            }
        } else {
            System.out.print("Cadastre um novo cliente para o pedido: ");
            System.out.print("Nome do Cliente: ");
            String nomeCliente = scanner.nextLine();
            System.out.print("Endereço do Cliente: ");
            String enderecoCliente= scanner.nextLine();
            clienteService.addCliente(nomeCliente,enderecoCliente);
            cliente = clienteService.ultimoCliente();
            System.out.println("Cliente cadastrado com sucesso!");

        }
        System.out.print("Selecione seu restaurante ");
        listarRestaurantes();
        System.out.print("Identificador do Restaurante: ");
        int identificadorRestaurante = scanner.nextInt();
        scanner.nextLine();
        if(restauranteService.validaRestaurante(identificadorRestaurante)){
            Restaurante restaurante = restauranteService.buscarRestaurante(identificadorRestaurante);
            List<Prato> pratos = restauranteService.findAllPratos(identificadorRestaurante);
            pedidoService.addPedidos(restaurante,cliente);
            while (true) {
                System.out.println("Selecione o numero do prato a ser adicionado");
                System.out.println("0. Finalizar Pedido");
                if (pratos == null || pratos.isEmpty()) {
                    System.out.println("Nenhum prato encontrado para o restaurante informado!");
                    System.out.println();
                } else {
                    for (Prato prato : pratos) {
                        System.out.println(prato.getNome() + ", R$" + prato.getPreco());
                    }
                }

                System.out.print("Escolha uma opção: ");
                int opcaoPrato = scanner.nextInt();
                scanner.nextLine();
                if (opcaoPrato > 0 && opcaoPrato < pratos.size() ) {
                    Prato prato = restauranteService.buscarPrato(opcaoPrato,identificadorRestaurante);
                    pedidoService.adicionarPrato(prato);
                } else if (opcaoPrato == 0) {
                    break;
                } else {
                    System.out.println("Opção inválida!");
                }
            }

            System.out.println("Pedido realizado com sucesso!");
        }

    }


    private void listarPedidosRestaurante(){
        System.out.print("Selecione seu restaurante ");
        listarRestaurantes();
        System.out.print("Identificador do Restaurante: ");
        int identificador = scanner.nextInt();
        scanner.nextLine();
        List<Pedido> pedidos = pedidoService.buscarPedidosRestaurantes(identificador);
        for(Pedido pedido: pedidos){
            System.out.print(pedido.toString());
        }
    }

    private void verPedidosCliente(){
        System.out.print("Selecione o cliente ");
        listarClientes();
        System.out.print("Identificador do Cliente: ");
        int identificador = scanner.nextInt();
        scanner.nextLine();
        List<Pedido> pedidos = pedidoService.buscarPedidosClientes(identificador);
        for(Pedido pedido: pedidos){
            System.out.print(pedido.toString());
        }
    }

}
