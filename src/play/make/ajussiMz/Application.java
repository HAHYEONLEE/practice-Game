package play.make.ajussiMz;

public class Application {
    public static void main(String[] args) {
        AjussiManager ajussi = new AjussiManager();
        ajussi.getIjussi();

        Ajussi a1 = new DuManSik(10);
        Ajussi a2 = new KKwakDooPal();
        a1.ment();
        a2.ment();


    }
}
