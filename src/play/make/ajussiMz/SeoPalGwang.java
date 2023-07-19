package play.make.ajussiMz;

public class SeoPalGwang implements Ajussi {

    private static final String NAME = "서팔광";
    private static final int AGE = 50;
    public int mzPower;

    public SeoPalGwang() {
    }

    public SeoPalGwang(int mzPower) {
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
            System.out.println(introduce() + "나 팔광쓰" + AGE + "세! MZ력 " + this.mzPower
                    + "! 아따 인서타로 다렉트메쎄지 정도는 보낼 줄 알지!!");
        }
    }

}

