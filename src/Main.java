/*Exercício 15 – Mini-sistema integrando tudo
Crie um programa console (Scanner + menu) com as opções:
1) Cadastrar Carro | 2) Listar todos | 3) Total cadastrado | 4) Sair
Requisitos:
a) Use ArrayList<Carro> para armazenar.
b) Atributos private, com getters/setters e validação.
c) Use construtor para criar os objetos.
d) Opção 3 usa Carro.totalCarros (static).
e) Validação de ano usa a constante final
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> listaDeCarros = new ArrayList<>();
        boolean controle = true;

        System.out.println("========================");
        System.out.println("Seja bem-vindo à Garagem");
        System.out.println("========================");
        do {
            System.out.println("Escolha um dos números");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Listar todos os carros cadastrados");
            System.out.println("3 - Total cadastrado");
            System.out.println("4 - Sair");
            System.out.println("========================");
            int escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                cadastrarCarro(sc, listaDeCarros);

            } else if (escolha == 2) {
                exibirLista(listaDeCarros);

            } else if (escolha == 3) {
                System.out.println("Total de carros: " + Carro.totalCarros);

            } else if (escolha == 4) {
                System.out.println("Fechando o sistema...");
                controle = false;
            }

        } while (controle);

        sc.close();
    }

    private static void cadastrarCarro(Scanner sc, List<Carro> listaDeCarros) {
        System.out.println("Digite a marca do carro:");
        String marca = sc.nextLine();

        System.out.println("Qual é o modelo do carro?");
        String modelo = sc.nextLine();

        System.out.println("Qual é o ano do carro? ");
        int ano = sc.nextInt();
        sc.nextLine();

        Carro novoCarro = new Carro(marca, modelo, ano);

        listaDeCarros.add(novoCarro);
        System.out.println("Carro cadastrado com sucesso!");
    }

    private static void exibirLista(List<Carro> listaDeCarros) {
        System.out.println("------------LISTA DE CARROS------------");
        if (listaDeCarros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
        } else {
            for (Carro c : listaDeCarros) {
                c.exibirLista();
            }
        }
    }
}
        /*int x = 0;
        if (true) {
            x = 10;
        }
        System.out.println(x);

        int a = 10;
        int b = a;
        b = 99;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        /*Carro.ANO_PRIMEIRO_CARRO = 1900;
        O método static final torna o valor atribuído a ele uma constante, impedindo que
        seja mudado posteriormente, como neste caso.
         */

        /*ArrayList<Carro> listaDeCarros = new ArrayList<>();

        Carro c8 = new Carro("Fiat", "Uno", 2020);
        Carro c9 = c8;
        c9.setModelo("Palio");
        System.out.println(c8.getModelo());
        System.out.println(c9.getModelo());
        listaDeCarros.add(c9);

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

        Carro c10 = new Carro("VW", "Gol", 2015);
        Carro.trocarModelo(c10);
        System.out.println(c10.getModelo());


        /*Relaciona-se com o construtor parametrizado. Aqui os atributos são passados de forma
        parametrizada.*/
        /*Carro c3 = new Carro("Fiat", "Uno", 2013);
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
       /* Carro c4 = new Carro();
       /* listaDeCarros.add(c4);
        /*Resposta ex. 6c: No construtor parametrizado (ex: c3), os dados vêm de fora
        (argumentos da Main). No construtor sem parâmetros (ex: c4),
        os dados são definidos internamente pela própria classe (valores "default").
        Isso permite criar objetos mesmo quando não temos informações imediatas,
        garantindo que o objeto não tenha valores nulos indesejados.*/


       /* listaDeCarros.add(new Carro("Chevrolet", "Tracker", 2019));
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



             /*   ArrayList<Cliente> listaDeClientes = new ArrayList<>();

                listaDeClientes.add(new Cliente("Fernando", "fernando23@gmail.com", "999999"));
                listaDeClientes.add(new Cliente("Sarah", "saraoliveira@gmail.com"));
                listaDeClientes.add(new Cliente("Carlos"));

                System.out.println("---------LISTA DE CLIENTES---------");

                for (Cliente cliente : listaDeClientes) {
                    cliente.exibirDados();
                }

                System.out.println("Total de Clientes: " + Cliente.totalClientes);

            }

        }*/



