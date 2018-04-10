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
    }
}
