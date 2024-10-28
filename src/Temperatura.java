public class Temperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 40.5;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f C em F é", temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensagem);

        int temperaturaF = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em F é" + temperaturaF);


    }
}
