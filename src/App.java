public class App {
    public static void main(String[] args) throws Exception {
        // Pengguna jasa Barang (QUEUE)




        // Barang (Linked List)
        String name;
        Integer i=0;
        boolean bool = true;
        String weight;

        LinkedList<String> nama = new LinkedList<>();
        LinkedList<String> jenis = new LinkedList<>();
        LinkedList<String> berat = new LinkedList<>();
        LinkedList<String> jumlah = new LinkedList<>();
        LinkedList<String> ekspedisi = new LinkedList<>();
        LinkedList<String> payment = new LinkedList<>();

        Scanner nma = new Scanner(System.in);
        Scanner jen = new Scanner(System.in);
        Scanner brt = new Scanner(System.in);
        Scanner jml = new Scanner(System.in);
        Scanner eksp = new Scanner(System.in);
        Scanner byr = new Scanner(System.in);

        System.out.println("Jumlah barang yang akan dikirim :");
        i=0;

        int h=jml.nextInt();

            do {
                System.out.println("Masukkan nama barang :");
                name=nma.next();
                nama.add(name);
                i++;
            }
                while(i<h);
                System.out.println("");
            
                System.out.println("Jenis barang:");
                System.out.println("1. Apparel");
                System.out.println("2. Otomotif");
                System.out.println("3. Farmasi");
                System.out.println("4. Makanan atau minuman");
                System.out.println("5. Kosmetik");
                System.out.println("6. Elektronik");
                System.out.println("Pilih jenis barang :");
            do {
                int type=jen.nextInt();

                switch(type){

                    case 1:
                    jenis.add("Apparel");
                    System.out.println("");
                    i=0;
                    break;

                    case 2:
                    jenis.add("Otomotif");
                    System.out.println("");
                    i=0;
                    break;

                    case 3:
                    jenis.add("Farmasi");
                    System.out.println("");
                    i=0;
                    break;

                    case 4:
                    jenis.add("Makanan atau minuman");
                    System.out.println("");
                    i=0;
                    break;

                    case 5:
                    jenis.add("Kosmetik");
                    System.out.println("");
                    i=0;
                    break;

                    case 6:
                    jenis.add("Elektronik");
                    System.out.println("");
                    i=0;
                    break;
                }     
                System.out.println("Masukkan berat barang :");
                weight=brt.next();
                berat.add(weight);
                System.out.println("");
    
            System.out.println("Opsi pengiriman");
            System.out.println("1. Hemat ");
            System.out.println("2. Reguler ");
            System.out.println("3. Kargo ");
            System.out.println("4. Same Day ");
            System.out.println("5. Next Day ");
            System.out.println("Pengiriman yang dipilih :");

            int kirim=eksp.nextInt();

            switch(kirim){
                case 1:
                System.out.println("Pengiriman hemat");
                System.out.println("Ongkos kirim : Rp. 20.000");
                ekspedisi.add("Pengiriman hemat");
                ekspedisi.add("Biaya : Rp. 20.000");
                System.out.println("");
                break;

                case 2:
                System.out.println("Pengiriman reguler");
                System.out.println("Ongkos kirim : Rp. 40.000");
                ekspedisi.add("Pengiriman reguler");
                ekspedisi.add("Biaya : Rp. 40.000");
                System.out.println("");
                break;

                case 3:
                System.out.println("Pengiriman kargo");
                System.out.println("Ongkos kirim : Rp. 50.000");
                ekspedisi.add("Pengiriman kargo");
                ekspedisi.add("Biaya : Rp. 50.000");
                System.out.println("");
                break;

                case 4:
                System.out.println("Pengiriman Same Day");
                System.out.println("Ongkos kirim : Rp. 100.000");
                ekspedisi.add("Pengiriman Same Day");
                ekspedisi.add("Biaya : Rp. 100.000");
                System.out.println("");

                case 5:
                System.out.println("Pengiriman Next Day");
                System.out.println("Ongkos kirim : Rp. 55.000");
                ekspedisi.add("Pengiriman Next Day");
                ekspedisi.add("Biaya : Rp. 55.000");
                System.out.println("");
            }
                
            System.out.println("Opsi pembayaran");
            System.out.println("1. Gopay ");
            System.out.println("2. Dana ");
            System.out.println("3. OVO ");
            System.out.println("4. Cash ");
            System.out.println("5. Transfer Bank ");
            System.out.println("Pembayaran yang dipilih :");

            int bayar=byr.nextInt();

            switch(bayar){
                case 1:
                System.out.println("Gopay");
                payment.add("Gopay");
                System.out.println("");
                break;

                case 2:
                System.out.println("Dana");
                payment.add("Dana");
                System.out.println("");
                break;

                case 3:
                System.out.println("OVO");
                payment.add("OVO");
                System.out.println("");
                break;

                case 4:
                System.out.println("Cash");
                payment.add("Cash");
                System.out.println("");
                break;

                case 5:
                System.out.println("Transfer Bank");
                payment.add("Transfer Bank");
                System.out.println("");
                break;
            }
                System.out.println("PENGIRIMAN ANDA");
                System.out.println("Nama barang         \t: "+nama);
                System.out.println("Jumlah barang       \t: "+jumlah);
                System.out.println("Jenis barang        \t: "+jenis);
                System.out.println("Berat Barang        \t: "+berat); 
                System.out.println("Ekspedisi       \t: "+ekspedisi);
                System.out.println("Metode pembayaran \t: " +payment);
                System.out.println("PENGIRIMAN ANDA AKAN SEGERA DIPROSES");
                System.out.println("");

                System.out.println("");

            }
            while (bool);
            
        }
    }
        




        // Sorting barang berdasarkan tujuan(Stack)




        // Barang telah sampai ke penerima (arraylist)



        
    }
}
