public class main {
    public static void main(String[] args){
        Televisao tele = new Televisao();

        tele.ligar();

        for(int i=0; i<3;i++){
            if(tele.estahLigado()) {
                tele.sobeVolume();
            }else{
                System.out.println("(!) Tv desligada.");
            }
        }
        tele.desligar();
        for(int i=0; i<3;i++){
            if(tele.estahLigado()) {
                tele.sobeVolume();
            }else{
                System.out.println("(!) Tv desligada.");
            }
        }

        tele.ligar();
        tele.sobeCanal();
        tele.sobeCanal();

        System.out.println(tele.toString());

    }
}