import java.util.Scanner;

public class SistemaAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {


            System.out.println("===================SISTEMA DE ALUNOS====================");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno");
            System.out.println("4 - Atualiza aluno");
            System.out.println("5 - Excluir aluno");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Cadastrar aluno selecionado\n");
                    break;
                case 2:
                    System.out.println("Listar aluno selecionado\n");
                    break;
                case 3:
                    System.out.println("Buscar aluno selecionado\n");
                    break;
                case 4:
                    System.out.println("Atualizar aluno selecionado\n");
                    break;
                case 5:
                    System.out.println("Excluir aluno selecionado\n");
                    break;
                case 0:
                    System.out.println("Programa encerrado\n");
                    break;
            }


        } while (opcao != 0);
    }

}
