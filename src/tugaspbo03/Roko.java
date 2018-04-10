package tugaspbo03;

public class Roko {
    private String merk;
    private double nikotin;
    private double harga;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getNikotin() {
        return nikotin;
    }

    public void setNikotin(double nikotin) {
        this.nikotin = nikotin;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    void cetakInfo(){
        System.out.println("Merk \t:"+merk+"\n"+
                "Takaran\t:"+nikotin+"\n"+
                "Harga \t:"+harga);
    }
}
