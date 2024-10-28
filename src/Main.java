public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Scren Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        /* Isso tbm é um comentario*/
        //Média calculada pelas 3 notas que foram faladas

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme de aventura com um cara pika dos anos 80
                Muito bom!
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

        /* String senha = "123456";
        if (senha.equals("123456")){
            System.out.println("Acesso autorizado");
        } else{
            System.out.println("senha incorreta");
        }*/
    }
}