package Barang;

import Barang.fungsi.Barang;
import Barang.fungsi.User;
import Barang.fungsi.Node;
import java.util.ArrayList;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        ArrayList <String> list_komen = new ArrayList <>();
        boolean isContinue = true;
        boolean isContinue1;
        boolean isContinue2;
        boolean isContinue3;
        String pilihanUser;
        User user = new User();
        Barang barang = new Barang();

      
        while(isContinue){
            System.out.println("==============================================");
            System.out.println("               SELAMAT DATANG                 ");
            System.out.println("==============================================");
            System.out.println("DISKON HINGGA 50%");
            System.out.println("Buka Senin - Jum'at , jam 10.00 - 22.00 WIB");
            System.out.println("""
            1. Menu Pelanggan
            2. Menu Barang
            3. Menu penerima
            4. Tree
            5. Keluar
            """);
            isContinue1 =true;
            isContinue2 = true;
            isContinue3 = true;
            System.out.print("Input pilihan : ");
            String pil1 = input.next();
            
            switch(pil1){
                case "1":
                        while(isContinue1){
                            System.out.println("===============================================");
                            System.out.println("               Menu pelanggan                  ");
                            System.out.println("===============================================");
                            System.out.println("""
                            \n1.Masukkan identitas pengirim dan penerima
                            2.Lihat pelanggan
                            3.Hapus pelanggan
                            """);
                            System.out.print("Pilihan : ");
                            pilihanUser = input.next();
                            switch(pilihanUser){
                                case"1":
                                    user.enqUser();
                                    break;
                                case "2":
                                    user.viewUser();
                                    break;
                                case "3":
                                    user.deqUser();
                                    break;
                                default:
                                    System.out.println("Pilihan tidak tersedia");
                                    break;
                            }
                            System.out.print("\nApakah Anda ingin melanjutkan [y/n]? ");
                            pilihanUser = input.next();
                            isContinue1 = pilihanUser.equalsIgnoreCase("y");
                        
                        }
                    break;
                case "2":
                    if(user.isEmpty()){
                        System.out.println("Silahkan isi data pelanggan dulu");
                    }else{
                        while(isContinue2){
                            System.out.println("===============================================");
                            System.out.println("               Menu Barang                   ");
                            System.out.println("===============================================");
                            System.out.println("""
                            1.Tampil barang
                            2.Tambah Belakang
                            3.Hapus Belakang
                            4.Push Barang
                            5.Pop Barang
                            6.Kirim barang
                            """);
                            System.out.print("Masukkan pilihan : ");
                            pilihanUser = input.next();
                            
                            switch(pilihanUser){
                                case "1":
                                    barang.viewBarang();
                                    break;
                                case "2":
                                    barang.tambahBelakang();
                                    break;
                                case "3":
                                    barang.hapusBelakang();
                                    barang.hapusBelakang();
                                    System.out.println("Barang telah dihapus");
                                    break;
                                case "4":
                                    barang.pushBarang();
                                    break;
                                case "5":
                                    barang.popBarang();
                                    break;
                                case "6":
                                    System.out.println("Pengiriman barang dalam proses");
                                    break;
                                default:
                                    System.out.println("Pilihan tidak tersedia");
                                    break;
                            }
                            System.out.print("\nApakah Anda ingin melanjutkan [y/n]? ");
                            pilihanUser = input.next();
                            isContinue2 = pilihanUser.equalsIgnoreCase("y");
                        }       
                    }
                        break;
                case "3":            
                        if(user.isEmpty() && barang.isEmpty()){
                            System.out.println("Silahkan isi data pelanggan dan barang terlebih dahulu (^ ^)");
                        }else{
                            while(isContinue3){
                                System.out.println("-----------------");
                                System.out.println("Feedback Penerima");
                                System.out.println("-----------------");
                                System.out.print("Menu : \n1. Lihat ulasan\n2. Beri ulasan\n\nPilih :");
                                int pilihan = input.nextInt();
                                switch(pilihan){
                                case 1:
                                    if (list_komen.isEmpty()){
                                    System.out.println("Tidak ada ulasan");
                                    }
                                    else{
                                        for(int d = 0;d < list_komen.size();d++){
                                            System.out.println(list_komen.get(d)+"\n");
                                        }
                                        break;
                                    }
                                    break;

                                    case 2:
                                    System.out.print("\nMasukkan Nama: ");
                                    String name = input.next();
                                    System.out.println("Nama: "+name);
                                    System.out.println("\nPenilaian Pelayanan: ");
                                    System.out.println("1\t2\t3\t4\t5");
                                    System.out.print("\nNilai: ");
                                    Integer pilih = input.nextInt();
                                    System.out.print("\nMasukkan Komentar: ");
                                    String komen = input.next();
                                    list_komen.add("\nNama\t\t: "+name+"\nPenilaian\t:"+pilih+"\nKomentar\t: "+komen);
                                    System.out.println("\nNama\t\t: "+name+"\nPenilaian\t: "+pilih+"\nKomentar\t: "+komen);
                                    break;

                                    default:
                                    System.out.println("Pilihan tidak tersedia");
                                    break;
                                }
                                System.out.print("\nApakah Anda ingin melanjutkan [y/n]? ");
                                pilihanUser = input.next();
                                isContinue3 = pilihanUser.equalsIgnoreCase("y");
                            
                            }
                               
                        }
                        
                       
                    break;
                case "4":
                    Node root = new Node(2);
                    root.left = new Node(3);
                    root.right = new Node(5);
                    root.right.left = new Node(7);
                    root.right.right = new Node(11);
                    root.left.left = new Node(13);
                    root.left.left.left = new Node(17);
                    root.left.left.right = new Node(19);
                
                            
                    fungsi treeOrder = new fungsi();

                    System.out.println("Kode  tujuan Pengiriman barang");
                    System.out.println("""
                        2 : Sumatera Barat -> Provinsi
                        3 : Padang         -> Kota
                        5 : Bukittinggi    -> Kota
                        11 : Mandiangin    -> Kecamatan
                        7  : Gugukpanjang  -> Kecamatan
                        13 : Kuranji       -> Kecamatan
                        17 : Kalumbuk      -> Kelurahan
                        19 : Korong Gadang -> Kelurahan
                    """);

                    System.out.println("\n\tGambar pohon biner:\n");
                    System.out.println("\t       2\n\t      / \\\n\t     3   5\n\t    / \t/ \\ \n\t   13  11  7\n\t  / \\\n\t 17 19\n\n");
                    
                    //PreOrder traversal
                    System.out.println("Pre-Order");
                    treeOrder.preOrder(root);
                    System.out.println("\n");
                    
                    //InOrder traversal
                    System.out.println("In-Order");
                    treeOrder.inOrder(root);
                    System.out.println("\n");
                    
                    //PostOrder traversal
                    System.out.println("Post-Order");
                    treeOrder.postOrder(root);
                    System.out.println("\n");
                break;

                case "5":
                    System.out.println("Terima kasih (^ ^)");
                    isContinue = false;
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
                
            }
        }
 
    }
                  
}

