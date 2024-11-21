    import java.util.Scanner;

    public class Percobaan6 {

        public static int hitungLuas(int pjg, int lb) {
            return pjg * lb;
        }
        
        public static int hitungVolume(int tinggi, int a, int b) {
            return hitungLuas(a, b) * tinggi;  
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int p, l, t, L, vol;

        
            System.out.println("Masukan panjang:");
            p = input.nextInt();
            System.out.println("Masukan lebar:");
            l = input.nextInt();
            System.out.println("Masukan tinggi:");
            t = input.nextInt();

        
            L = hitungLuas(p, l);
            System.out.println("Luas Persegi panjang adalah " + L);

            vol = hitungVolume(t, p, l);
            System.out.println("Volume balok adalah " + vol);
            
        }
    }
