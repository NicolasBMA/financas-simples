import java.util.ArrayList;
import java.util.Scanner;

public class FinancasSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> despesasNomes = new ArrayList<>();
        ArrayList<Double> despesasValores = new ArrayList<>();

        System.out.println("====== FinançasSimples: Organize sua Vida Financeira ======\n");

        System.out.print("Informe o valor líquido que você irá receber este mês: R$ ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // limpa buffer

        String opcao;
        double totalDespesas = 0;

        while (true) {
            System.out.print("\nDeseja adicionar uma despesa? (Digite 'sim' para adicionar ou 'finalizar' para encerrar): ");
            opcao = scanner.nextLine().toLowerCase();

            if (opcao.equals("finalizar")) {
                break;
            } else if (opcao.equals("sim")) {
                System.out.print("Nome da despesa: ");
                String nome = scanner.nextLine();

                System.out.print("Valor da despesa: R$ ");
                double valor = scanner.nextDouble();
                scanner.nextLine(); // limpar buffer

                despesasNomes.add(nome);
                despesasValores.add(valor);
                totalDespesas += valor;
            } else {
                System.out.println("Opção inválida. Digite 'sim' ou 'finalizar'.");
            }
        }

        double saldoFinal = salario - totalDespesas;

        System.out.println("\n========== RESUMO FINANCEIRO ==========");
        System.out.println("Salário líquido: R$ " + salario);
        System.out.println("Despesas registradas:");

        for (int i = 0; i < despesasNomes.size(); i++) {
            System.out.println("- " + despesasNomes.get(i) + ": R$ " + despesasValores.get(i));
        }

        System.out.println("---------------------------------------");
        System.out.printf("Total de despesas: R$ %.2f\n", totalDespesas);
        System.out.printf("Saldo restante: R$ %.2f\n", saldoFinal);

        System.out.print("\nVocê tem interesse em descobrir formas de fazer renda extra? (sim/não): ");
        String interesse = scanner.nextLine().toLowerCase();

        if (interesse.equals("sim")) {
            System.out.println("\n💡 Aqui estão 3 ideias com investimento inicial acessível:");
            System.out.println("1. Brigadeiros artesanais (custo ~ R$50)");
            System.out.println("2. Brownies gourmet (custo ~ R$200)");
            System.out.println("3. Salgados por encomenda (custo ~ R$300)");

            System.out.print("\nQual dessas opções você gostaria de saber mais? (Digite 1, 2 ou 3): ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // limpa buffer
            System.out.println();

            switch (escolha) {
                case 1:
                    System.out.println("🍫 Brigadeiros Artesanais:");
                    System.out.println("- Custo estimado: R$50");
                    System.out.println("- Rende: 100 brigadeiros");
                    System.out.println("- Preço sugerido: R$2,00 cada");
                    System.out.println("- Lucro potencial: R$200 - R$50 = R$150");

                    System.out.print("\nDeseja ver a receita do brigadeiro? (sim/não): ");
                    if (scanner.nextLine().toLowerCase().equals("sim")) {
                        System.out.println("\n👉 Receita de Brigadeiro:");
                        System.out.println("- 1 lata de leite condensado");
                        System.out.println("- 1 colher de sopa de manteiga");
                        System.out.println("- 4 colheres de sopa de chocolate em pó");
                        System.out.println("- Chocolate granulado para enrolar\n");
                        System.out.println("Modo de preparo:");
                        System.out.println("1. Leve tudo ao fogo médio, mexendo até soltar do fundo.");
                        System.out.println("2. Deixe esfriar, enrole e passe no granulado.");
                    }
                    break;

                case 2:
                    System.out.println("🍫 Brownies Gourmet:");
                    System.out.println("- Custo estimado: R$200");
                    System.out.println("- Rende: 50 brownies");
                    System.out.println("- Preço sugerido: R$6,00 cada");
                    System.out.println("- Lucro potencial: R$300 - R$200 = R$100");

                    System.out.print("\nDeseja ver a receita do brownie? (sim/não): ");
                    if (scanner.nextLine().toLowerCase().equals("sim")) {
                        System.out.println("\n👉 Receita de Brownie:");
                        System.out.println("- 200g de chocolate meio amargo");
                        System.out.println("- 4 ovos, 1 xícara de açúcar, 1/2 xícara de farinha");
                        System.out.println("- 100g de manteiga");
                        System.out.println("Modo de preparo:");
                        System.out.println("1. Derreta o chocolate com a manteiga.");
                        System.out.println("2. Misture os demais ingredientes e leve ao forno médio por 30min.");
                    }
                    break;

                case 3:
                    System.out.println("🥟 Salgados por Encomenda:");
                    System.out.println("- Custo estimado: R$300");
                    System.out.println("- Rende: 300 salgados");
                    System.out.println("- Preço sugerido: R$2,50 cada");
                    System.out.println("- Lucro potencial: R$750 - R$300 = R$450");

                    System.out.print("\nDeseja ver a receita base de coxinha? (sim/não): ");
                    if (scanner.nextLine().toLowerCase().equals("sim")) {
                        System.out.println("\n👉 Receita de Coxinha:");
                        System.out.println("- Massa: 1L de caldo de galinha, 2 xícaras de farinha de trigo");
                        System.out.println("- Recheio: frango desfiado temperado a gosto");
                        System.out.println("Modo de preparo:");
                        System.out.println("1. Ferva o caldo e adicione a farinha até formar a massa.");
                        System.out.println("2. Modele, recheie, empane e frite.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Finalizando sem detalhes.");
            }
        } else {
            System.out.println("\nTudo bem! Organização é o primeiro passo para melhorar sua vida financeira.");
        }

        System.out.println("\n✨ Obrigado por usar o FinançasSimples!");
        System.out.println("📌 Lembre-se: com organização, planejamento e ação, é possível transformar sua realidade financeira.");
        System.out.println("Até a próxima!\n");

        scanner.close();
    }
}