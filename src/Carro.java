/*Exercício 2 – Método void vs método com retorno
Na classe Carro:
a) Crie um método void exibir() que imprime marca, modelo e ano formatados.
b) Crie um método int idadeDoCarro() que retorna 2026 - ano.
c) Na Main, chame os dois métodos. Comente no código: qual devolve valor? Qual só
executa uma ação?*/
public class Carro {

    public void exibir(){ //Método que imprime marca, modelo e ano formatados.
        System.out.format("Marca: %s | Modelo: %s | Ano: %d", this.marca, this.modelo, this.ano);
        System.out.println();
    }

    public void idadeDoCarro() {
        int idade = 2026 - this.ano;
        System.out.println("A idade desse carro é: " + idade + " anos.");
        System.out.println();
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
        this.ano = ano;
    }

    private int ano;


    public Carro () { //Construtor padrão
        String marca = "";
        String modelo = "";
        int ano = 0;

    }


}
