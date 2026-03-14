public class ExemploCarroJava {

    public static void main(String[] args) {
        //Criar um objeto do tipo carro
        Carro gol = new Carro();
        gol.cor = "Prata";
        gol.velocidadeMaxima = 220;
        gol.ano = 1999;
        gol.altura = 1.5f;
        gol.peso = 500;
        gol.modelo = "Quadrado"; //String entre ""
        gol.automatico = false; //true (verdadeiro)

        //Exibir os valores dos atributos do objeto
        System.out.println("Modelo: " + gol.modelo); //sout
        System.out.println("Ano: " + gol.ano);
        System.out.println("cor: " + gol.cor);
        System.out.println("Altura: " + gol.altura);
        System.out.println("Velocidade Maxima: " + gol.velocidadeMaxima);
        System.out.println("Peso: " + gol.peso);
        System.out.println("Automatico: " + gol.automatico);

        System.out.println("......................................................");

        //Criar um novo objeto do tipo carro

        //Atribuir valores para 2 atributos e exibir esses valores

        //objeto carro 2
        Carro vectra = new Carro();
        vectra.automatico = false;
        vectra.peso = 800;
        vectra.cor = "Preto";
        vectra.ano = 2000;
        vectra.altura = 1.4f;
        vectra.velocidadeMaxima = 260;
        vectra.modelo = "GLS 2.2 8v";

        //Valores dos atributos do carro 2
        System.out.println("Automatico: " + vectra.automatico);
        System.out.println("Peso: " + vectra.peso);
        System.out.println("Cor: " + vectra.cor);
        System.out.println("Ano: " + vectra.ano);
        System.out.println("Altura: " + vectra.altura);
        System.out.println("Velocidade Maxima: " + vectra.velocidadeMaxima);
        System.out.println("Modelo: " + vectra.modelo);

    }

}
