
package atm;
import java.util.Scanner;
public class ATM {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int bakiye=1000;
        System.out.println("**************************");
        String işlemler=
                "1.işlem: bakiye ögrenme\n"
                +"2.işlem:para çekme\n"
                +"3.işlem para yatırma\n"
                +"çıkış için q'a  basın";
        System.out.println(işlemler);
        System.out.println("**************************");
 while(true){
     System.out.println("işlemi seçiniz :");
     String işlem=klavye.nextLine();
     if(işlem.equals("q")){
         System.out.println("programdan çıkılıyor.......");
       break;} 
     
     else if(işlem.equals("1")){
             System.out.println("bakineniz :"+bakiye);
             }
             
     else if(işlem.equals("2")){
         System.out.print("çekmek istediyiniz tutar :");
         int tutar=klavye.nextInt();
         klavye.nextLine();
         if(bakiye-tutar<0){
             System.out.println("yeterli bakiye yok.  bakinez:"+bakiye);
         } else{
                bakiye-=tutar;
                System.out.println("yeni bakiyeniz :"+bakiye);
                     }
                     
                     
         }
     else if(işlem.equals("3")){
         System.out.println("yatirmak istediyiniz tutar :");
         int tutar=klavye.nextInt();
         klavye.nextLine();
         bakiye+=tutar;
         System.out.println("yeni bakiyeniz :"+bakiye);
     }
     else{
         System.out.println("geçersiz işlem....");
     }
             
     
 }
    
    }
}
    