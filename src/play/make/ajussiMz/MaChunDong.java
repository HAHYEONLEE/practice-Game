package play.make.ajussiMz;

public class MaChunDong implements Ajussi{

    private static final String NAME = "마춘동";
    private static final int AGE = 58;
    public int mzPower;

    public MaChunDong() {
    }

    public MaChunDong(int mzPower) {
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
            System.out.println(introduce() + "나 춘동쓰" + AGE + "세 인디! MZ력은 " + this.mzPower
                    + "이여! 요즘 신세대들은 아이폰 쓴다해서 하나 장만 해봤는디 어뗘!");
        }
    }


}
