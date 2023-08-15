package mod2_aula5.restaurante.controller;

import mod2_aula5.restaurante.dominio.Cliente;
import mod2_aula5.restaurante.dominio.Prato;
import mod2_aula5.restaurante.dominio.Restaurante;
import mod2_aula5.restaurante.service.ClienteService;
import mod2_aula5.restaurante.service.RestauranteService;

import java.util.List;
import java.util.Scanner;

public class MenuController {
    private RestauranteService restauranteService;
    private ClienteService clienteService;

    private Scanner scanner;

    public MenuController(RestauranteService restauranteService, ClienteService clienteService) {
        this.restauranteService = restauranteService;
        this.clienteService = clienteService;
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
                System.out.println();
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
    }

    private void listarPratosRestaurante() {
        System.out.print("Selecione seu restaurante ");
        listarRestaurantes();
        System.out.print("Identificador do Restaurante: ");
        int identificador = scanner.nextInt();
        scanner.nextLine();
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
    }

    private void fazerPedido() {
        System.out.print("Já existe um cliente para este pedido? (S/N): ");
        String opcao = scanner.nextLine();
        if (opcao.equalsIgnoreCase("S")) {
            System.out.print("Selecione o cliente");
            List<Cliente> clientes = clienteService.buscaCliente();
            System.out.print("Identificador do Cliente: ");
            Integer identificadorCliente = scanner.nextInt();
            scanner.nextLine();

            if (cliente == null) {
                System.out.println("Cliente não encontrado!");
                return;
            }
        } else {
            System.out.print("Deseja cadastrar um novo cliente com este pedido? (S/N): ");
            opcao = scanner.nextLine();
            if (opcao.equalsIgnoreCase("S")) {
                System.out.print("Nome do Cliente: ");
                String nomeCliente = scanner.nextLine();
                cliente = new Cliente(nomeCliente);
                clienteRepository.adicionarCliente(cliente);
                System.out.println("Cliente cadastrado com sucesso!");
            } else {
                return;
            }
        }
        System.out.print("Selecione seu restaurante ");
        listarRestaurantes();
        System.out.print("Identificador do Restaurante: ");
        int identificadorRestaurante = scanner.nextInt();
        scanner.nextLine();
        Restaurante restaurante = restauranteService.
        List<Prato> pratos = restauranteService.buscaPrato(identificadorRestaurante);

        while (true) {
            if (pratos == null || pratos.isEmpty()) {
                System.out.println("Nenhum prato encontrado para o restaurante informado!");
                System.out.println();
            } else {
                System.out.println("Pratos disponíveis no restaurante:");
                for (Prato prato : pratos) {
                    System.out.println(prato.getNome() + ", R$" + prato.getPreco());
                }
            }
            System.out.println("Selecione o numero do prato a ser adicionado");
            System.out.println("0. Finalizar Pedido");
            System.out.print("Escolha uma opção: ");
            int opcaoPrato = scanner.nextInt();
            scanner.nextLine();
            if (opcaoPrato > 0 && opcaoPrato < ) {

            } else if (opcaoPrato == 0) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        clienteService.fazerPedido(cliente.getIdentificador(), cliente.getNome(), identificadorRestaurante,
                nomeRestaurante, pratos);
        System.out.println("Pedido realizado com sucesso!");
    }

}
