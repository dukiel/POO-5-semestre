public class Televisao {
    private int canal = 1;
    private int volume = 0;
    private boolean ligado = false;

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
        this.canal = 1;
        this.volume = 0;
    }

    public void sobeCanal(){
        if(ligado && canal < 16){
            this.canal++;
        }
    }

    public void desceCanal(){
        if(ligado && canal > 1){
            this.canal--;
        }
    }

    public void sobeVolume(){
        if(ligado) {
            if (volume < 10) {
                this.volume++;
            }else{
                System.out.println("Volume no maximo");
            }
        }
    }

    public void desceVolume(){
        if(ligado && volume > 0){
            this.volume--;
        }
    }

    public boolean estahLigado(){
        return ligado;
    }

    @Override
    public String toString() {
        return "TV Ligada: " + ligado + " | Canal: " + canal + " | Volume: " + volume;
    }

}