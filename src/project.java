import java.util.Scanner;


public class App {

    static class User {
        String Pengirim,noHpPengirim,alamatPengirim;
        String Penerima,noHpPenerima,alamatPenerima;
        int data;
        User next;
        User prev;
    
        User userHead,userTail = null;
        
        boolean isEmpty(){
            if(userHead == null){
                return true;
            }else{
                return false;
            }
        }

        void enqUser(String newPengirim,String noHp, String newAdd, String newPenerima, String noHp2, String newAdd2){
            User baru;
            baru = new User();
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
                System.out.println("Data user tidak ada");
            }else{
                User bantu;
                bantu = userHead;
                System.out.println("|===========================================================================|");
                System.out.println("|               Pengirim             |               Penerima               |");
                System.out.println("|===========================================================================|");
                System.out.println("|   Nama    |   No Hp     |  Alamat  |   Nama    |    No Hp   |   Alamat    |");
                System.out.println("|===========================================================================|");

                while(bantu != null){
                    System.out.printf("|  %-8s |  %-10s | %-8s | %-10s | %-10s | %-10s |" ,bantu.Pengirim,bantu.noHpPengirim,bantu.alamatPengirim,bantu.Penerima,bantu.noHpPenerima,bantu.alamatPenerima);
                    System.out.println();
                    bantu = bantu.next;
                
                }
            }
        } 
   }

  static class Barang{
      String nama,jenis,belakangrat,jumlah,ekspedisi,harga,payment;
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

      void tambahbelakanglakang(String Item, String tipe, String qty, String eksp, String price, String pay){
          Barang temp;
          Barang paket = new Barang();
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
              temp.next = temp;  
          }

      }

      void hapusbelakanglakang(){
          Barang temp = depan;
          if(isEmpty()){
              if(depan == belakang){
                  depan = belakang = null;
              }else{
                  while(temp.next != null){
                    temp.next = temp;
                  }
                  belakang = temp;
                  temp.next = null;
              }
          }else{
              System.out.println("Data Kosong");
          }
      }

      void pushBarang(String Item, String tipe, String qty, String eksp, String price, String pay){
          Barang first = new Barang();
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
            System.out.println("Data user tidak ada");
        }else{
            Barang bantu;
            bantu = depan;
            System.out.println("|===========================================================================|");
            System.out.println("|                               Barang                                      |");
            System.out.println("|===========================================================================|");
            System.out.println("|   Nama    |   jenis     |  jumlah  |   eksp    |    harga  |   payment    |");
            System.out.println("|===========================================================================|");

            while(bantu != null){
                System.out.printf("|  %-8s |  %-10s | %-8s | %-10s | %-10s | %-10s |" ,bantu.nama,bantu.jenis,bantu.jumlah,bantu.ekspedisi,bantu.harga,bantu.payment);
                System.out.println();
                bantu = bantu.next;
            
            }
        }
      }
    
  }

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
        
            // System.out.println("Ketik start untuk memulai ");
            // String pil1 = input.next();

            // switch(pil1){

            //     case "start":
                
                    System.out.print("\nPilihan : ");
                    pilihanUser = input.next();
                    switch(pilihanUser){
                        case"1":
                            System.out.println("Masukkan identitas");
                            System.out.println();
                            String pengirim = input.next();
                            String noHp = input.next();
                            String alamat1 = input.next();
                            String penerima = input.next();
                            String noHp2 = input.next();
                            String alamat2 = input.next();
                            user.enqUser(pengirim,noHp,alamat1,penerima,noHp2,alamat2);
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
                    isContinue = pilihanUser.equalsIgnoreCase("y");
                    if(!isContinue){
                        while(isContinue2){
                            System.out.println("==============================================");
                            System.out.println("               Menu Barang                ");
                            System.out.println("==============================================");
                            pilihanUser = input.next();
                            
                            switch(pilihanUser){
                                case"1":
                                    String Item = input.next();
                                    String tipe = input.next();
                                    String qty = input.next();
                                    String eksp = input.next();
                                    String price= input.next();
                                    String pay = input.next();
                                    barang.tambahbelakanglakang(Item, tipe, qty, eksp, price, pay);
                                    break;
                                case "2":
                                    
                                    break;
                                case "3":
                                    barang.hapusbelakanglakang();
                                    break;
                                default:
                                    System.out.println("Pilihan tidak tersedia");
                                    break;
                                    
                            
                                 }
                            System.out.print("\nApakah Anda ingin melanjutkan [y/n]? ");
                            pilihanUser = input.next();
                            isContinue2 = pilihanUser.equalsIgnoreCase("y");
                            

                       

                        }
                        isContinue = true;

                    }

            //         break;

            //     default:
            //         isContinue = false;
            //         break;
                
            // }

	    }
 
    }
                  
}

// int a = 0;
// 		int b = 0;
// 		int c = 0;
// 		ArrayList <String> list_komen = new ArrayList <>();
//         Scanner masukkan = new Scanner (System.in);
//         System.out.println("Feedback Penerima");
//         System.out.println("-----------------");
		
// 		while (true){
// 			System.out.println("Menu : \n1. Lihat ulasan\n2. Beri ulasan\n3. Keluar\n\nPilih :");
// 			int pilihan = masukkan.nextInt();
// 			if (pilihan == 1){
// 				if (list_komen.isEmpty()){
// 				System.out.println("Tidak ada ulasan");
// 				}
				
// 				else{
// 					for(int d = 0;d < a;d++){
// 						System.out.println(list_komen.get(d)+"\n");
// 					}
// 				}
// 			}
// 			else if (pilihan == 2){
// 				System.out.println("\nMasukkan Nama: ");
// 				String name = masukkan.next();
// 				System.out.println("Nama: "+name);

// 				System.out.println("\nPenilaian Pelayanan: ");
// 				System.out.println("1\t2\t3\t4\t5");
// 				System.out.println("\nNilai: ");
// 				Integer pilih = masukkan.nextInt();
// 				System.out.println("\nMasukkan Komentar: ");
// 				String komen = masukkan.next();
// 				list_komen.add("\nNama\t\t: "+name+"\nPenilaian\t:"+pilih+"\nKomentar\t:"+komen);
		
// 				System.out.println("\nNama\t\t: "+name+"\nPenilaian\t: "+pilih+"\nKomentar\t:"+komen);
		
// 				a = a +1;
// 				b = b +1;
// 				c = c +1;
// 			}
// 			else if(pilihan == 3)
// 				System.exit(0);
// 			else{
// 				System.out.println("Pilihan tidak ditemukan");
// 			}
