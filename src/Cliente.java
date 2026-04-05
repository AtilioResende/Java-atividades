/*Exercício 15 – Mini-sistema integrando tudo
Crie um programa console (Scanner + menu) com as opções:
1) Cadastrar Carro | 2) Listar todos | 3) Total cadastrado | 4) Sair
Requisitos:
a) Use ArrayList<Carro> para armazenar.
b) Atributos private, com getters/setters e validação.
c) Use construtor para criar os objetos.
d) Opção 3 usa Carro.totalCarros (static).
e) Validação de ano usa a constante final*/

import java.util.Scanner;
public class Cliente {

    static int totalClientes = 0;

    private String nome;
    private String email;
    private String telefone;

    public void exibirDados(){
        System.out.format("Nome: %s | Email: %s | Telefone: %s ", this.nome, this.email, this.telefone);
        System.out.println();
    }

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

        totalClientes++;
    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = "Não informado";

        totalClientes++;
    }

    public Cliente(String nome) {
        this.nome = nome;
        this.email = "Não informado";
        this.telefone = "Não informado";

        totalClientes++;
    }

}


