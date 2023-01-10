public class FolhaPagamento {

    //double calcularSalario(int, int, double, double)
    double calcularSalario(int horasNormais, int horasExtras
            , double valorHoraNormal, double valorHoraExtra){

        double valorHorasNormais = horasNormais * valorHoraNormal;
        double valorHorasExtra = horasExtras * valorHoraExtra;

        return valorHorasNormais + valorHorasExtra;

    }


}
