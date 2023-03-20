package lambda_recap;

public class Apartman {
    private String cephe;
    private int katsayı;
    private int kira;

    public Apartman() {
    }

    public Apartman(String cephe, int katsayı, int kira) {
        this.cephe = cephe;
        this.katsayı = katsayı;
        this.kira = kira;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKatsayı() {
        return katsayı;
    }

    public void setKatsayı(int katsayı) {
        this.katsayı = katsayı;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    @Override
    public String toString() {
        return "Apartman{" +
                "cephe='" + cephe + '\'' +
                ", katsayı=" + katsayı +
                ", kira=" + kira +
                '}';
    }
}
