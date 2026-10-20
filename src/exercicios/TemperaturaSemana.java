package exercicios;

public class TemperaturaSemana {
    static void main(String[] args) {
        double [][] temperatura = {{22.5, 25.0, 19.5},{28.0, 30.5}};
        for (double[] dia : temperatura){
            System.out.println("Medições do dia:");
            for (double medição : dia){
                System.out.println("Temperatura: "+ medição + " °C");

            }
        }
    }
}
