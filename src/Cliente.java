/*Exercício 14 – Sobrecarga de construtor completa
Crie uma classe Cliente com atributos private: nome, email, telefone.
a) Construtor 1: recebe nome, email e telefone.
b) Construtor 2: recebe só nome e email. Telefone fica "Não informado".
c) Construtor 3: recebe só nome. Email e telefone ficam "Não informado".
d) Adicione static int totalClientes e incremente nos construtores.
e) Na Main, crie um objeto com cada construtor e imprima os dados dos três.*/

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


