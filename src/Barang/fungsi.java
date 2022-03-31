package Barang;
import java.util.Scanner;

public class fungsi {

    static class User {

        Scanner input = new Scanner(System.in);
        String Pengirim,noHpPengirim,alamatPengirim;
        String Penerima,noHpPenerima,alamatPenerima;
        User next;
    
        User userHead,userTail = null;
        
        boolean isEmpty(){
            if(userHead == null){
                return true;
            }else{
                return false;
            }
        }

        void enqUser(){
            User baru;
            baru = new User();

            System.out.println("Identitas Pengirim");
            System.out.print("Nama   :");
            String newPengirim = input.next();
            System.out.print("No Hp  :");
            String noHp = input.next();
            System.out.print("Alamat :");
            String newAdd = input.next();
            System.out.println("\nIdentitas Penerima");
            System.out.print("Nama   :");
            String newPenerima = input.next();
            System.out.print("No Hp  :");
            String noHp2 = input.next();
            System.out.print("Alamat :");
            String newAdd2 = input.next();
            
            baru.Pengirim = newPengirim;
            baru.noHpPengirim = noHp;
            baru.alamatPengirim = newAdd;
            baru.Penerima = newPenerima;;
            baru.noHpPenerima = noHp2;
            baru.alamatPenerima = newAdd2;
            baru.next = null;

            if(isEmpty() == true){
                userHead = baru;
                userTail = baru;
                userTail.next = null;
            }else{
                userTail.next = baru;
                userTail = baru;
            }
            
            
        }


        void deqUser(){
            User temp = userHead;
            if(!isEmpty()){
                if(userHead != userTail){
                    userHead = userHead.next;
                    temp = null;
                }else{
                    userHead = userTail = null;
                }
            }else{
                System.out.println("Data Kosong");
            }
        }

        void viewUser(){
            if(isEmpty()){
                System.out.println("Data pelanggan tidak ada, silahkan mengisi data pelanggan terlebih dahulu (^ ^)");
            }else{
                User bantu;
                bantu = userHead;
                System.out.println("|===========================================================================|");
                System.out.println("|               Pengirim             |               Penerima               |");
                System.out.println("|===========================================================================|");
                System.out.println("|   Nama    |   No Hp     |  Alamat  |   Nama    |    No Hp   |   Alamat    |");
                System.out.println("|===========================================================================|");

                while(bantu != null){
                    System.out.printf("|  %-8s |  %-10s | %-8s | %-10s | %-9s | %-11s |" ,bantu.Pengirim,bantu.noHpPengirim,bantu.alamatPengirim,bantu.Penerima,bantu.noHpPenerima,bantu.alamatPenerima);
                    System.out.println();
                    bantu = bantu.next;
                
                }
            }
        } 
   }

  static class Barang{
      Scanner input = new Scanner(System.in);
      String nama,jenis,jumlah,ekspedisi,harga,payment;
      Barang depan = null;
      Barang belakang;
      Barang next;
      Barang pos;

      boolean isEmpty(){
        if(depan == null){
            return true;
        }else{
            return false;
        }
    }

      void tambahBelakang(){
          Barang temp;
          Barang paket = new Barang();
          
          System.out.println("=================================================================");
          System.out.println("                        Detail Barang                            ");
          System.out.println("=================================================================");
          
          System.out.println("\n|==============================|");
          System.out.println("|         Opsi Pengiriman      |");
          System.out.println("|==============================|");
          System.out.println("|   Paket     |     Harga      |");
          System.out.println("|==============================|");
          System.out.println("|   Hemat     |  Rp.20.000,00  |");   
          System.out.println("|   Reguler   |  Rp.40.000,00  |");
          System.out.println("|   Kargo     |  Rp.50.000,00  |"); 
          System.out.println("|   Same day  |  Rp.100.000,00 |");  
          System.out.println("|   Name day  |  Rp.55.000,00  |");      
          System.out.println("\nJenis : Apparel, Otomotif, Farmasi, Makanan atau Minuman");
          System.out.println("\nPayment : Gopay, Ovo, Dana, Cash, Tranfer Bank\n");

          System.out.print("Nama    :");
          String Item = input.next();
          System.out.print("Jenis   :");
          String tipe = input.next();
          System.out.print("Jumlah  :");
          String qty = input.next();
          System.out.print("Paket   :");
          String eksp = input.next();
          System.out.print("Harga   :");
          String price= input.next();
          System.out.print("Payment :");
          String pay = input.next();

          paket.nama = Item;
          paket.jenis = tipe;
          paket.jumlah = qty;
          paket.ekspedisi = eksp;
          paket.harga = price;
          paket.payment = pay;

          if(isEmpty()){
              depan = paket;
              pos = depan;
          }else{
              temp = depan;
              while(temp.next != null){
                  temp = temp.next;
              } 
              temp.next = paket;  
          }

      }

      void hapusBelakang(){
          Barang temp = depan;
          if(!isEmpty()){
              if(depan == belakang){
                  depan = belakang = null;
              }else{
                  while(temp.next != belakang){
                    temp = temp.next;
                  }
                  belakang = temp;
                  temp.next = null;
              }
          }else{
              System.out.println("Data Kosong");
          }
      }

      void pushBarang(){
          Barang first = new Barang();

          System.out.print("Nama    :");
          String Item = input.next();
          System.out.print("Jenis   :");
          String tipe = input.next();
          System.out.print("Jumlah  :");
          String qty = input.next();
          System.out.print("Paket   :");
          String eksp = input.next();
          System.out.print("Harga   :");
          String price= input.next();
          System.out.print("Payment :");
          String pay = input.next();

          first.nama = Item;
          first.jenis = tipe;
          first.jumlah = qty;
          first.ekspedisi = eksp;
          first.harga = price;
          first.payment = pay;
          first.next = null;
        if(isEmpty()){
            depan = first;
            depan.next = null;
        }else{
            first.next = depan;
            depan = first;   
        }

      }

      void popBarang(){
        Barang temp = depan;
        if(!isEmpty()){
            if(depan == belakang){
                depan = belakang = null;
            }else{
                depan = depan.next;
                // temp.next = depan;
                temp = null;
            }
        }else{
            System.out.println();
        }
      }



      void viewBarang(){
        if(isEmpty()){
            System.out.println("Data barang tidak ada");
        }else{
            Barang bantu;
            bantu = depan;
            System.out.println("|===========================================================================|");
            System.out.println("|                               Barang                                      |");
            System.out.println("|===========================================================================|");
            System.out.println("|   Nama    |   jenis     |  jumlah  |   eksp    |    harga  |   payment    |");
            System.out.println("|===========================================================================|");

            while(bantu != null){
                System.out.printf("|  %-8s |  %-10s | %-8s | %-9s | %-9s | %-11s  |" ,bantu.nama,bantu.jenis,bantu.jumlah,bantu.ekspedisi,bantu.harga,bantu.payment);
                System.out.println();
                bantu = bantu.next;
            
            }
        }
      }
    
  }

  static class Node {
    int data;
    Node left;
    Node right;
    

    public Node(int number) {
        data = number;
        left = right = null;
    };
  }

    public void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    
}
