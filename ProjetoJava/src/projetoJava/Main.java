package projetoJava;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Usuario> lista = new ArrayList<>();

		int opcao;

		do {
			System.out.println("\n1. Cadastro");
			System.out.println("2. Editar");
			System.out.println("3. Listar");
			System.out.println("4. Remover");
			System.out.println("5. Sair");

			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("1 - Aluno");
				System.out.println("2 - Professor");
				int tipo = sc.nextInt();
				sc.nextLine();

				System.out.print("Nome: ");
				String nome = sc.nextLine();

				System.out.print("CPF: ");
				String cpf = sc.nextLine();

				System.out.print("Data de nascimento: ");
				String data = sc.nextLine();

				if (tipo == 1) {
					System.out.print("Matrícula: ");
					String mat = sc.nextLine();

					System.out.print("CRE: ");
					double cre = sc.nextDouble();
					sc.nextLine();

					lista.add(new Aluno(nome, cpf, data, mat, cre));

				} else {
					System.out.print("SIAPE: ");
					String siape = sc.nextLine();

					System.out.print("Carga horária: ");
					int ch = sc.nextInt();
					sc.nextLine();

					lista.add(new Professor(nome, cpf, data, siape, ch));
				}
				break;

			case 2:
				if (lista.isEmpty()) {
					System.out.println("Nenhum usuário cadastrado.");
					break;
				}

				for (int i = 0; i < lista.size(); i++) {
					System.out.println(i + " - " + lista.get(i));
				}

				System.out.print("Escolha o índice: ");
				int indexEdit = sc.nextInt();
				sc.nextLine();

				if (indexEdit >= 0 && indexEdit < lista.size()) {
					System.out.print("Novo nome: ");
					lista.get(indexEdit).setNome(sc.nextLine());
					System.out.println("Atualizado!");
				} else {
					System.out.println("Índice inválido.");
				}
				break;

			case 3:
				if (lista.isEmpty()) {
					System.out.println("Nenhum usuário cadastrado.");
				} else {
					for (Usuario u : lista) {
						System.out.println("\n" + u);
					}
				}
				break;

			case 4:
				if (lista.isEmpty()) {
					System.out.println("Nenhum usuário cadastrado.");
					break;
				}

				for (int i = 0; i < lista.size(); i++) {
					System.out.println(i + " - " + lista.get(i));
				}

				System.out.print("Escolha o índice: ");
				int indexRemover = sc.nextInt();

				if (indexRemover >= 0 && indexRemover < lista.size()) {
					lista.remove(indexRemover);
					System.out.println("Removido!");
				} else {
					System.out.println("Índice inválido.");
				}
				break;
			}

		} while (opcao != 5);

		sc.close();
	}
}
