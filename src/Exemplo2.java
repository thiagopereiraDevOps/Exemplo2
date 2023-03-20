public class Exemplo2 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.setCor = ("Vermelha");
        c1.setModelo = ("Bic");
        c1.setCarga = (90);
        c1.setPonta = (0.7f);
        c1.setTampada = (false);
        c1.rabiscar();
        c1.status();
        System.out.println(" ");

        Caneta c2 = new Caneta();
        c1.setCor = ("Amarelo");
        c1.setModelo = ("ESPECIAL");
        c1.setCarga = (75);
        c1.setPonta = (0.5f);
        c1.setTampada = (true);
        c1.rabiscar();
        c1.status();
        System.out.println(" ");
    }
}
