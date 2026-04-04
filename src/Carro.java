/*Exercício 9 – final
a) Crie uma constante static final int ANO_PRIMEIRO_CARRO = 1886 na classe Carro.
b) Use essa constante na validação do setter de ano (substitua o 1886 que você escreveu no
exercício 4c).
c) Na Main, tente alterar o valor de Carro.ANO_PRIMEIRO_CARRO = 1900. O que
acontece? Comente explicando o que final faz em uma variável.*/
public class Carro {

    public static final int ANO_PRIMEIRO_CARRO = 1886;
    static void imprimirTotal() {
        System.out.println("Total de carros:" + Carro.totalCarros);
    }

    static int totalCarros = 0;/*contador.
    Resposta ex. 7d.
    Este é um atributo de classe(estático). Perceba que ele pertence apenas à classe
    Carro. Ele é um contador único que observa todos os carros de fora, diferentemente
    dos atributos de instância, como marca, modelo e ano. Por isso, ele deve ser aces
    sado por meio do nome da Classe: Carro.totalCarros.*/

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
        if (ano < 2026 && ano > ANO_PRIMEIRO_CARRO) { /*Método modificado conforme
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

        totalCarros++; //Incrementa o contador
    }

    public Carro () { //Este é o segundo construtor, conforme ex. 6b.

        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;

        totalCarros++; //Incrementa o contador
    }
/* listaDeCarros.add(new Carro("Chevrolet", "Tracker", 2019));
        listaDeCarros.add(new Carro("Ford", "Ranger", 2022));
        listaDeCarros.add(new Carro("Toyota", "Corolla", 2025));*/


}
