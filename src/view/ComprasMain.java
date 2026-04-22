package view;

import java.util.Scanner;

import controller.ListaDeCompras;
import model.ItemCompra;

public class ComprasMain {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ListaDeCompras controller = new ListaDeCompras();
        int opcao = 0;

        System.out.println("=== Bem-vindo ao Sistema de Lista de Compras ===");

        do {
            System.out.println("\n----------- MENU -----------");
            System.out.println("1. Inserir Item");
            System.out.println("2. Remover Item por Nome");
            System.out.println("3. Buscar Item por Nome");
            System.out.println("4. Exibir Lista Completa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = leitor.nextLine();
                    System.out.print("Quantidade: ");
                    int qtd = leitor.nextInt();
                    
                    if (controller.insereItem(nome, qtd)) {
                        System.out.println("Item adicionado com sucesso!");
                    } else {
                        System.out.println("Erro ao adicionar item.");
                    }
                    break;

                case 2:
                    System.out.print("Nome do produto para remover: ");
                    String nomeRemover = leitor.nextLine();
                    if (controller.removeItemPorNome(nomeRemover)) {
                        System.out.println("Item removido com sucesso!");
                    } else {
                        System.out.println("Item não encontrado na lista.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome para busca: ");
                    String nomeBusca = leitor.nextLine();
                    ItemCompra itemEncontrado = controller.exibeItemPorNome(nomeBusca);
                    if (itemEncontrado != null) {
                        System.out.println("Resultado encontrado:" + itemEncontrado);
                    } else {
                        System.out.println("Produto não localizado.");
                    }
                    break;

                case 4:
                	System.out.println(controller.exibirLista());
                    break;

                case 5:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 5);

        leitor.close();
    }

}
