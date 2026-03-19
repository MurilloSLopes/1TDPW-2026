import java.util.Scanner;

public class exemploEntradaDados {
    //Criar um programa para ler e calcular a media FIAP
    public static void main(String[] args) {
        //Criar o objeto para ler o teclado
        Scanner leitor = new Scanner(System.in);

        //Digitar as notas da CPS
        System.out.println("Digite a nota da cp 1");
        double cp1 = leitor.nextDouble();
        System.out.println("Digite a nota da cp 2");
        double cp2 = leitor.nextDouble();
        System.out.println("Digite a nota da cp 3");
        double cp3 = leitor.nextDouble();

        //Digitar a nota do CHALLENGE
        System.out.println("Digite a nota da challenge 1");
        double challenge1 = leitor.nextDouble();
        System.out.println("Digite a nota da challenge 2");
        double challenge2 = leitor.nextDouble();

        //Digitar a nota da Global Solution
        System.out.println("Digite a nota da global solution");
        double globalSolution = leitor.nextDouble();

        //Calcular media
        System.out.println("Media das cps");
        double cps = (cp1 + cp2 + cp3)/3;

        System.out.println("Media dos challenge");
        double challenges = (challenge1 + challenge2)/2;

        //Calcular % das notas
        double mediaFinal = cps * 0.2 + challenges * 0.2 + globalSolution * 0.6;
        System.out.println("Media final Murillo: " + mediaFinal );

    }
}
