import java.util.Calendar;

public class Principal_carro {
    public static void main(String[] args){
        /*Crie uma classe Carro com atributos modelo, ano, cor
         e métodos para exibir a ficha técnica e calcular a idade do carro.*/
        Carro novoCarro = new Carro();

        //Exibe a ficha técnica
        novoCarro.modelo = "Yaris";
        novoCarro.ano = 2020;
        novoCarro.cor = "Prata";

        novoCarro.exibeFichaTecnica();

        //Calcula a idade do carro
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println(novoCarro.idadeDoCarro(year));
    }
}
