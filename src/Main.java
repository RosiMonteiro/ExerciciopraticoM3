import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 1) pedir pro usuário informar:
        //1) Nome do Aluno:
        System.out.println("Introduza o nome do aluno!");
        String nome = in.nextLine();

        //2) Idade do Aluno:
        System.out.println("introduza a idada do aluno!");
        int idade = in.nextInt();
        in.nextLine();

        //3) Nota do Aluno:
        System.out.print("Digite a nota do aluno [0.0 - 10.0]: ");
        float nota = in.nextFloat();

        // 4) armazenar as informações do usuário em variáveis
        // 5) alterar a frase do enunciado
        // Olá. O nome do aluno é <nome>,
        // tem <idade> anos, e está aprendendo a programar.
        System.out.print("Olá. O nome do aluno é: " + nome);
        System.out.print(", tem " + idade);
        System.out.print(" anos, e está aprendendo a programar.");

        //Vai verificar se a nota do usuario é maior ou igual a 7
        //Se for maior ou igual a 7 vai informar que o aluno foi aprovado e finalizar o programa.
        //Caso ao controrio para informa que o aluno foi reprovado e finalizar o programa.
        if ((nota <= 10.0) && (nota >= 7.0)) {
            System.out.println("Parabéns, o aluno foi aprovado!");
        } else {
            System.out.println("O Aluno foi reprovado.");


        }
    }
}