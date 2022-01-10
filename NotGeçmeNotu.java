
package not.geçme.notu;
import java.util.Scanner;
public class NotGeçmeNotu {

    public static void main(String[] args) {
  Scanner klavye=new Scanner(System.in);
  System.out.println("lütfen notunuzu giriniz:");
    double not=klavye.nextDouble();
    
    if(not>=85 && 100>=not)
    
    {
     System.out.println("tebrikler AA ile geçtiniz");
    }
             
    else if (not>=70 && not<=85) 
            {
                System.out.println("tebrikler BB ile geçtiniz");
            }
    else if(not>=50 && not<=69)
            
    {
        System.out.println("tebrikler CC geçtiniz");
    }  
    else if(not<=49  )
    {
        System.out.println("FF ile kaldın");
    }
    
        
    }
    
}
