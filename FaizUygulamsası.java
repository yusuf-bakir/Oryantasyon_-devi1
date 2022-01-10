
package faiz.uygulamsası;
import java.util.Scanner;
public class FaizUygulamsası {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("bankamıza hoşgeldiniz . faiz oranımız %6");
            
            System.out.println("istediyiniz tutar :");
            int anapara=klavye.nextInt();
            System.out.println("kaç yıl vadeli yatırmak istıyosynuz :");
            int vade=klavye.nextInt();
            double toplampara=anapara;
            double faizoranı=0.06;
            for(int i=1;i<=vade;i++){
                toplampara=(toplampara*faizoranı)+toplampara;
                System.out.println(i+". yılın sonunda toplam para :"+toplampara);
            }       
    }
    
}
