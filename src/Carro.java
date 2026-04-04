/*Exercício 6 – Sobrecarga de construtor
a) Mantenha o construtor do exercício 5.
b) Crie um segundo construtor sem parâmetros que define marca = "Desconhecido",
modelo = "Desconhecido", ano = 0.
c) Na Main, crie um carro de cada forma e imprima. Comente: o que muda entre os dois?*/
public class Carro {

    public void exibir(){ //Método que imprime marca, modelo e ano formatados.
        System.out.format("Marca: %s | Modelo: %s | Ano: %d | Idade: %d", this.marca, this.modelo, this.ano, this.getIdadeDoCarro());
        System.out.println();
    }

    /*public void setIdadeDoCarro(int ano) {
        int idade = 2026 - this.ano;
        System.out.println("A idade desse carro é: " + idade + " anos.");
        System.out.println();
    }*/
/*Tive de gerar um get para retornar a idade do Carro. Apaguei o método public void idadeDoCarro()*/
    public int getIdadeDoCarro() {
        return 2026 - this.ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String modelo;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 2026 && ano > 1886) { /*Método modificado conforme
                                                  o exercício 4c.*/
            this.ano = ano;
        }else{
            System.out.println("ERRRO!");
        }

    }

    private int ano;


   /* public Carro () { //Construtor padrão
        /*String marca = "";
        String modelo = "";
        int ano = 0;*/


    public Carro (String marca, String modelo, int ano) {/*Resposta ao
                                                        ex. 5a.*/
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro () { //Este é o segundo construtor, conforme ex. 6b.

        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }
/* listaDeCarros.add(new Carro("Chevrolet", "Tracker", 2019));
        listaDeCarros.add(new Carro("Ford", "Ranger", 2022));
        listaDeCarros.add(new Carro("Toyota", "Corolla", 2025));*/


}
