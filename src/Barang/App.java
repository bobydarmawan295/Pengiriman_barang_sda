package Barang;

import Barang.fungsi.Barang;
import Barang.fungsi.User;
import Barang.fungsi.Node;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        boolean isContinue =  true;
        boolean isContinue2 =  true;
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
            3. Tree
            4. Keluar
            """);

            System.out.print("Input pilihan : ");
            String pil1 = input.next();
            
            switch(pil1){
                case "1":
                    System.out.println("===============================================");
                    System.out.println("               Menu pelanggan                  ");
                    System.out.println("===============================================");
                    System.out.println("""
                    \n1.Masukkan identitas pengirim dan penerima
                    2.Lihat pelanggan
                    3. Hapus pelanggan
                    4.Kembali ke menu utama
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
                        case "4":
                            App.main(null);
                            // continue
                            break;
                        // case "3":
                        //     user.deqUser();
                        //     break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                            break;

                    }
                        System.out.print("Apakah Anda ingin menambah pelanggan[y/n]? ");
                        pilihanUser = input.next();
                        isContinue = pilihanUser.equalsIgnoreCase("y");
                        if(!isContinue){
                            App.main(null);
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
                            if(barang.isEmpty()){
                                isContinue2 = true;
                            }else{
                                System.out.print("\nApakah Anda ingin melanjutkan [y/n]? ");
                                pilihanUser = input.next();
                                isContinue2 = pilihanUser.equalsIgnoreCase("y");
                            }
                        
                        }
                   
                    }
                    break;
                case "3":
                    // Node root = new Node("a");
                    // root.left = new Node("b");
                    // root.right = new Node("c");
                    // root.left.left = new Node("d");
                    // root.left.right = new Node("e");
                    // root.right.left = new Node("f");
                    // root.left.left.left = new Node("g");
                    // root.left.left.right = new Node("h");
                    // root.left.right.right = new Node("i");
                    // root.right.left.right = new Node("j");
                            
                    // //PreOrder traversal
                    // treeOrder.preOrder(root);
                    // System.out.println("");
                    
                    // //InOrder traversal
                    // treeOrder.inOrder(root);
                    // System.out.println();
                    
                    // //PostOrder traversal
                    // treeOrder.postOrder(root);
                    // System.out.println();
                break;
                case "4":
                    
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

