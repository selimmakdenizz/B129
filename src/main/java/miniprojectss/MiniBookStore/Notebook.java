package miniprojectss.MiniBookStore;


//1-c:product öz+brand,sheet,code
public class Notebook {
    private String brand;
    private int sheet;
    private int code;

    public Notebook(String name, String price, int stock, String brand, int sheet, int code) {
        super();
        this.brand = brand;
        this.sheet = sheet;
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSheet() {
        return sheet;
    }

    public void setSheet(int sheet) {
        this.sheet = sheet;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
