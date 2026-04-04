/*Exercício 8 – static (método de classe)
a) Crie um método static void imprimirTotal() em Carro que imprime o totalCarros.
b) Dentro desse método static, tente acessar o atributo modelo (de instância). O que
acontece?
c) Comente explicando: por que um método static não consegue acessar um atributo de
instância?*/
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Carro> listaDeCarros = new ArrayList<>();

        Carro c1 = new Carro();
        c1.setMarca("Honda");
        c1.setModelo("City");
        c1.setAno(2025);
        c1.getIdadeDoCarro();
        listaDeCarros.add(c1);

        Carro c2 = new Carro();
        c2.setMarca("Citroën");
        c2.setModelo("Basalt");
        c2.setAno(2023);
        c2.getIdadeDoCarro();
        listaDeCarros.add(c2);

        /*Relaciona-se com o construtor parametrizado. Aqui os atributos são passados de forma
        parametrizada.*/
        Carro c3 = new Carro("Fiat", "Uno", 2013);
        listaDeCarros.add(c3);
        /*Resposta 5c: VANTAGENS do construtor parametrizado:
        -Atomicidade: O objeto já nasce em um estado válido e completo.
        Usando setters um por um, o objeto fica em um estado "incompleto
        ou inválido(ex.: um carro sem marca ou ano) entre a criação e a
        chamada do último setter.

        -Redução de código: O código fica menos verboso. Nota-se a
        substituição de 4 ou 5 linhas por apenas 1. Isso torna a Main
        muito mais limpa e fácil de ler.

        -Obrigatoriedade: Se você definir apenas o construtor com
        parâmetros, você obriga quem for usar sua classe a fornecer os
        dados essenciais. Com setters, alguém pode esquecer de definir
        o ano, causando erros nos cálculos de idade depois.*/

        //Construtor sem parâmetros, conforme pedido no exercício 6c.
        Carro c4 = new Carro();
        listaDeCarros.add(c4);
        /*Resposta ex. 6c: No construtor parametrizado (ex: c3), os dados vêm de fora
        (argumentos da Main). No construtor sem parâmetros (ex: c4),
        os dados são definidos internamente pela própria classe (valores "default").
        Isso permite criar objetos mesmo quando não temos informações imediatas,
        garantindo que o objeto não tenha valores nulos indesejados.*/


        listaDeCarros.add(new Carro("Chevrolet", "Tracker", 2019));
        listaDeCarros.add(new Carro("Ford", "Ranger", 2022));
        listaDeCarros.add(new Carro("Toyota", "Corolla", 2025));

            System.out.println("---------LISTA DE CARROS---------");
            for (Carro carro : listaDeCarros) {
                carro.exibir();
        }
        Carro.imprimirTotal();
        System.out.println("Total de carros: " + Carro.totalCarros);//Resposta 7c
            /*Percebi que usar uma listaDeCarros e um método(carro.exibir()) é bem mais
            sucinto de escrever do que deixar como estava:


        Carro c1 = new Carro();
        c1.setMarca("Honda");
        c1.setModelo("City");
        c1.setAno(2026);
        System.out.println("Este é o modelo " + c1.getModelo() + " da marca " + c1.getMarca() + " de ano " + c1.getAno());
        c1.exibir();
        c1.idadeDoCarro();

        Carro c2 = new Carro();
        c2.setMarca("Citroën");
        c2.setModelo("Basalt");
        c2.setAno(2027);
        System.out.println("Este é o modelo " + c2.getModelo() + " da marca " + c2.getMarca() + " de ano " + c2.getAno());
        c2.exibir();
        c2.idadeDoCarro();*/


    }
}