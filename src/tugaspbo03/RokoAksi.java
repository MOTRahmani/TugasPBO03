package tugaspbo03;

public class RokoAksi {
    public static void main(String[] args) {
        Roko r1 = new Roko();
        r1.setMerk("LA");
        r1.setNikotin(1.2);
        r1.setHarga(16000);
        
        r1.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(r1.getMerk());
        System.out.print("Nikotinnya\t: ");
        System.out.println(r1.getNikotin());
        System.out.print("Harganya \t: ");
        System.out.println(r1.getHarga());
        
        ProdukRoko r2 = new ProdukRoko();
        r2.setMerk("Gudang Jati");
        r2.setNikotin(1.6);
        r2.setHarga(12000);
        r2.setJenisroko("Roko urang tuha");
        r2.cetakInfo();
        System.out.println("Produk :"+r2.getJenisroko());
        r2.throttle();
    }
}
