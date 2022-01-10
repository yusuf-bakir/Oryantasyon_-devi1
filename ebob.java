
package ebobbulmaa;


import java.util.Scanner;

public class ebob{
    public static int ebobbulma(int sayı1,int sayı2){
   int ebob=1;
   for(int i=1;(i<=sayı1) && (i<=sayı2);i++){
       if((sayı1%i==0) && (sayı2%i==0)){
           ebob=i;
       }
   }
    return ebob;
}
    public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
       System.out.println("birinci sayıyı giriniz :");
       int birincisayı=klavye.nextInt();
        System.out.println("ikinci sayıyı giriniz :");
       int ikincisayı=klavye.nextInt();
        
        System.out.println("iki sayının ebobu " + ebobbulma(birincisayı,ikincisayı));
    }   
    
}
