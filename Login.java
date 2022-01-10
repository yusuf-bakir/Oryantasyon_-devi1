
package LoginEkran;
import java.util.Scanner;
public class Login {

    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
        int giriş_hakkı=3;
        String sys_kulaniciadı="yusuf bakır";
        String sys_parola="212134";
        System.out.println("*****************************");
        System.out.println("kullanıcı girişine hoşgeldiniz...");
        System.out.println("*****************************");
        while(true){
            System.out.println("kulanıcı adı :");
            String kulanıcı_adı=klavye.nextLine();
            System.out.println("parola :");
           String parola=klavye.nextLine();
           if(kulanıcı_adı.equals(sys_kulaniciadı) && parola.equals(sys_parola)){
               System.out.println("hoşgeldiniz :"+kulanıcı_adı);
               break;
           }
           else if(kulanıcı_adı.equals(sys_kulaniciadı) && !parola.equals(sys_parola)){
            System.out.println("parolanız yanliş...");
            giriş_hakkı-=1;
               System.out.println("kalan giriş hakınız :"+giriş_hakkı);
        }
           else if(!kulanıcı_adı.equals(sys_kulaniciadı) && parola.equals(sys_parola)){
                   System.out.println("kulanıcı adiniz yanlış...");
                    giriş_hakkı-=1;
                   System.out.println("kalan giriş hakınız :"+giriş_hakkı);
                   
                   }else{
               System.out.println("kulanıcı ve parolanız yanlış...");
                 giriş_hakkı-=1; 
                  System.out.println("kalan giriş hakınız :"+giriş_hakkı);
           }
           if(giriş_hakkı==0){
               System.out.println("giriş hakınız bitmiştir tekrar bekleriz...");
               break;
           } 
    } 
}
}