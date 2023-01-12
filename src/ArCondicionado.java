public class ArCondicionado {

   private int temperatura;

    public void trocarTemperatura(int temperatura){
        if (temperatura >= 17 && temperatura <= 25){
            this.temperatura = temperatura;
        }
    }


    int obterTemperatura(){
        return temperatura;


    }
}
