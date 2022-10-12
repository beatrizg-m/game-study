package jogo;

public class Golpe {
    private String nomeGolpe;
    private Integer energiaGolpe;
    private Integer danoGolpe;

    public Golpe(){
    }

    public Golpe(String nomeGolpe, Integer energiaGolpe, Integer danoGolpe){
        this.nomeGolpe = nomeGolpe;
        this.energiaGolpe = energiaGolpe;
        this.danoGolpe = danoGolpe;
    }

    public String getNomeGolpe() {
        return nomeGolpe;
    }

    public void setNomeGolpe(String nomeGolpe) {
        this.nomeGolpe = nomeGolpe;
    }

    public Integer getEnergiaGolpe() {
        return energiaGolpe;
    }

    public void setEnergiaGolpe(Integer energiaGolpe) {
        this.energiaGolpe = energiaGolpe;
    }

    public Integer getDanoGolpe() {
        return danoGolpe;
    }

    public void setDanoGolpe(Integer danoGolpe) {
        this.danoGolpe = danoGolpe;
    }

    

}
