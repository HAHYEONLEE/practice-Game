package play.make.ajussiMz;

public class DuManSik implements Ajussi {

    private static final String NAME = "두만식";
    private static final int AGE = 53;
    public int mzPower;

    public DuManSik() {
    }

    public DuManSik(int mzPower) {
        this.mzPower = mzPower;
    }

    public String introduce() {
        return "---------------\n" +
                "이름 : " + NAME + "\n"
                + "나이 : " + AGE + "세 \n"
                + "MZ력 : " + this.mzPower
                + "\n---------------\n";
    }

    @Override
    public void ment() {
        if (true) {
            System.out.println(introduce() + "나 만식쓰" + AGE + "세여~! 그.. MZ력이 " + this.mzPower
                    + "인디! 핸대폰은 전화 걸고 받는거만 할 줄 알믄 되는거 아녀?!");
        }
    }

}
