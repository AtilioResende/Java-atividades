/*Exercício 2 – Método void vs método com retorno
Na classe Carro:
a) Crie um método void exibir() que imprime marca, modelo e ano formatados.
b) Crie um método int idadeDoCarro() que retorna 2026 - ano.
c) Na Main, chame os dois métodos. Comente no código: qual devolve valor? Qual só
executa uma ação?*/
public class Main {
    public static void main(String[] args) {
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
        c2.idadeDoCarro();
    }
}