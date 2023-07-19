package play.make.ajussiMz;

public class Application {
    public static void main(String[] args) {
        AjussiManager ajussi = new AjussiManager();
        ajussi.getAjussi();



        Ajussi a1 = new DuManSik(10);
        a1.ment();
        Ajussi a2 = new KwakDooPal(40);
        a2.ment();
        Ajussi a3 = new MaChunDong(20);
        a3.ment();
        Ajussi a4 = new SeoPalGwang(30);
        a4.ment();


    }
}
