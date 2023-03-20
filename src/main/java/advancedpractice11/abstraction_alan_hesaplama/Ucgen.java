package advancedpractice11.abstraction_alan_hesaplama;

public class Ucgen extends Alan{
    @Override
    public double alanaHesapla(double taban, double yukseklik) {
        return taban*yukseklik/2;
    }
}
