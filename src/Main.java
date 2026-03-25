/*Exercício 1 – Classe e objeto
Crie uma classe Carro com atributos: marca (String), modelo (String) e ano (int). Na Main:
a) Crie dois objetos Carro e atribua valores diretamente nos atributos.
b) Imprima os dados de cada carro no console.*/
public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setMarca("Honda");
        c1.setModelo("City");
        c1.setAno(2026);
        System.out.println("Este é o modelo " + c1.getModelo() + " da marca " + c1.getMarca() + " de ano " + c1.getAno());

        Carro c2 = new Carro();
        c2.setMarca("Citroën");
        c2.setModelo("Basalt");
        c2.setAno(2027);
        System.out.println("Este é o modelo " + c2.getModelo() + " da marca " + c2.getMarca() + " de ano " + c2.getAno());

    }
}