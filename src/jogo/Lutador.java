package jogo;

public class Lutador {

    String nome;
    Integer energia;
    Integer vida;
    Golpe[] golpes;

    public Lutador(String nome, Golpe[] golpes){
        this.nome = nome;
        this.energia = 50;
        this.vida = 100;
        this.golpes = golpes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Golpe[] getGolpes() {
        return golpes;
    }

    public void setGolpes(Golpe[] golpes) {
        this.golpes = golpes;
    }

    



}