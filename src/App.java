public class App {
    public static void main(String[] args) throws Exception {
        // Pengguna jasa Barang (QUEUE)
             String pengirim;
        String penerima;
        String NoHP;
        String alamatKirim;
        String alamatTerima;
        

        Queue<String> nama_pengirim = new LinkedList<>();
        Queue<String> nama_penerima = new LinkedList<>();
        Queue<String> No_HP = new LinkedList<>();
        Queue<String> alamat_pengirim = new LinkedList<>();
        Queue<String> alamat_penerima = new LinkedList<>();

        Scanner masukkan_namaPengirim = new Scanner(System.in);
        Scanner masukkan_namaPenerima = new Scanner(System.in);
        Scanner masukkan_NoHP = new Scanner(System.in);
        Scanner masukkan_AlPengirim = new Scanner(System.in);
        Scanner masukkan_AlPenerima = new Scanner(System.in);

        System.out.println("Masukkan Nama Pengirim :");
        pengirim=masukkan_namaPengirim.nextLine();
        nama_pengirim.add(pengirim);

        System.out.println("Masukkan Nama Penerima :");
        penerima=masukkan_namaPenerima.nextLine();
        nama_penerima.add(penerima);
        
        System.out.println("Masukkan No HP :");
        NoHP=masukkan_NoHP.nextLine();
        No_HP.add(NoHP);

        System.out.println("Masukkan Alamat Pengirim :");
        alamatKirim=masukkan_AlPengirim.nextLine();
        alamat_pengirim.add(alamatKirim);

        System.out.println("Masukkan Alamat Penerima :");
        alamatTerima=masukkan_AlPenerima.nextLine();
        alamat_penerima.add(alamatTerima);

        System.out.println("Nama Pengirim \t:"+nama_pengirim);
        System.out.println("Nama Penerima \t:"+nama_penerima);
        System.out.println("No HP   \t:"+No_HP);
        System.out.println("Alamat Kirim \t:"+alamat_pengirim);
        System.out.println("Alamat Terima \t:"+alamat_penerima);


    }
    
}



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

	import java.util.Scanner;
	import java.util.Stack;

    		boolean bool = true;
    
    		String metodekirim;
    		String kodetujuan;
    		String kodebarang;

    		Stack<String> kode_barang = new Stack<String>();
    		Stack<String> kode_tujuan = new Stack<String>();
    		Stack<String> metode_kirim = new Stack<String>();
    
    		Scanner kodbarang = new Scanner(System.in);
    		Scanner kodtujuan = new Scanner(System.in);
    		Scanner metodepengirim = new Scanner(System.in);
    		Scanner pilih = new Scanner(System.in);
    

    		do{
        		System.out.println("\t\t\t\t=======================================");
        		System.out.println("\t\t\t\t 1. Input Kode dan Metode Pengiriman Barang ");
        		System.out.println("\t\t\t\t---------------------------------------");
        		System.out.println("\t\t\t\t 2. Lihat Stack Pengiriman Barang ");
        		System.out.println("\t\t\t\t---------------------------------------");
            		System.out.print("\t\t\t\t MASUKAN PILIHAN: ");


        		int input=pilih.nextInt();
        		switch(input){
            		case 1:
                		System.out.print("\n\t\t\t\t Kode Tujuan: ");
                		kodetujuan = kodtujuan.nextLine();
                		kode_tujuan.push(kodetujuan);
                		System.out.print("\t\t\t\t Kode Barang: ");
                		kodebarang = kodbarang.nextLine();
				kode_barang.push(kodebarang);
                		System.out.print("\t\t\t\t Metode Pengiriman: ");
                		metodekirim = metodepengirim.nextLine();
                		metode_kirim.push(metodekirim);
                		break;
              
            		case 2:
                		System.out.println("\n\t\t\t\t Stack Barang Pengiriman: "+kode_barang);
                		System.out.println("\t\t\t\t Tujuan Barang Pengiriman: "+kode_tujuan);
                		System.out.println("\t\t\t\t Metode Pengiriman       : "+metode_kirim);
				
				System.out.println("");	
                		System.out.println("\n\t\t\t\t Kode barang selanjutnya: "+kode_barang.peek());
                		System.out.println("\t\t\t\t Kota Tujuan selanjutnya: "+kode_tujuan.peek());                		
                		System.out.println("\t\t\t\t Pengiriman melalui     : "+metode_kirim.peek());
                
                		break;

            		default:
            		System.err.println("\n\t\t\t\t Pilihan tidak tersedia!");
            		System.out.println("");
        		}
    		}
    		while(bool);
	}
}




        // Barang telah sampai ke penerima (arraylist)

import java.util.ArrayList;
import java.util.Scanner;

public class jpbArraylist {
    public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		ArrayList <String> list_komen = new ArrayList <>();
        Scanner masukkan = new Scanner (System.in);
        System.out.println("Feedback Penerima");
        System.out.println("-----------------");
		
		while (true){
			System.out.println("Menu : \n1. Lihat ulasan\n2. Beri ulasan\n3. Keluar\n\nPilih :");
			int pilihan = masukkan.nextInt();
			if (pilihan == 1){
				if (list_komen.isEmpty()){
				System.out.println("Tidak ada ulasan");
				}
				
				else{
					for(int d = 0;d < a;d++){
						System.out.println(list_komen.get(d)+"\n");
					}
				}
			}
			else if (pilihan == 2){
				System.out.println("\nMasukkan Nama: ");
				String name = masukkan.next();
				System.out.println("Nama: "+name);

				System.out.println("\nPenilaian Pelayanan: ");
				System.out.println("1\t2\t3\t4\t5");
				System.out.println("\nNilai: ");
				Integer pilih = masukkan.nextInt();
				System.out.println("\nMasukkan Komentar: ");
				String komen = masukkan.next();
				list_komen.add("\nNama\t\t: "+name+"\nPenilaian\t:"+pilih+"\nKomentar\t:"+komen);
		
				System.out.println("\nNama\t\t: "+name+"\nPenilaian\t: "+pilih+"\nKomentar\t:"+komen);
		
				a = a +1;
				b = b +1;
				c = c +1;
			}
			else if(pilihan == 3)
				System.exit(0);
			else{
				System.out.println("Pilihan tidak ditemukan");
			}
		}
		
    }
}

	// Tree
    import java.util.Scanner;

public class tree{
    static Scanner in=new Scanner(System.in);
    public void insert(node a, int b){
        if(b<a.value){
            if(a.left!=null) insert(a.left,b);
            else{
                a.left=new node();
                a.left.input(b);
                System.out.println(b+" di kiri  "+a.value);
            }
        }
        else if(b>a.value){
            if(a.right!=null) insert(a.right,b);
            else{
                a.right=new node();
                a.right.input(b);
                System.out.println(b+" di kanan "+a.value);
            }
        }
    }
    public void view(node a){
        System.out.print("Pre Order  : ");
        preOrder(a);
        System.out.println(" ");
    }  
public void preOrder(node a){
        if(a!=null){
            System.out.print(a.value+" ");
            preOrder(a.left);
            preOrder(a.right);
        }
    }
}
 
class node{
    node left,right;
    int value;
    public void input(int a){
        value=a;
    }
    public static void main(String[] args){
        tree tr=new tree();
        node root=new node();
        int menu=1;
        int r=1;
        int a;
        while(menu!=3){
            System.out.print("1.input\n2.view\n3.exit\n : ");
            menu=tr.in.nextInt();
            if(menu==1){
                System.out.print("Masukkan Angka : ");
                a=tr.in.nextInt();
                if(r==1){
                    root.input(a);
                    r--;
                }
                else tr.insert(root,a);
            }
            else if(menu==2) tr.view(root);
            else if(menu==3) System.out.println("Keluar");
            else System.out.println("Salah");
            System.out.println(" ");
        }
    }
} 
    }
}
