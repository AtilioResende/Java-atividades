/*Exercício 1 – Classe e objeto
Crie uma classe Carro com atributos: marca (String), modelo (String) e ano (int). Na Main:
a) Crie dois objetos Carro e atribua valores diretamente nos atributos.
b) Imprima os dados de cada carro no console.*/
public class Carro {
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

    public Carro () {
        String marca = "";
        String modelo = "";
        int ano = 0;

    }

}
