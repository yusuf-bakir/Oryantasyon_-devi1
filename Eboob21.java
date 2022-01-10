package eboob21;

import java.util.Scanner;

public class Eboob21 {

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int cıkarma(int a, int b) {
        return (a - b);
    }

    public static int cıkarma(int a, int b, int c) {
        return (a - b - c);
    }

    public static int çarpma(int a, int b) {
        return (a * b);
    }

    public static int çarpma(int a, int b, int c) {
        return (a * b * c);
    }

    public static double bölme(double a, double b) {
        return (a / b);
    }

    public static double bölme(double a, double b, double c) {
        return ((a / b) / c);
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        String işlemler = "1. toplama işemi\n"
                + "2. cıkarma işlemi\n"
                + "3. çarpma işlemi\n"
                + "4. bölme işlemi\n"
                + "5. çıkmak için q basınız";
        System.out.println("*********************************************");
        System.out.println(işlemler);
        System.out.println("*********************************************");
        while (true) {
            System.out.println("işleminizi seçiniz :");
            String işlem = klavye.nextLine();
            if (işlem.equals("q")) {
                System.out.println("sistemden çıkılıyor...");
                break;
            } else if (işlem.equals("1")) {
                System.out.println("kaç deger toplayacaksınız (2 veya 3)");
                int kaçsayı = klavye.nextInt();

                if (kaçsayı == 2) {
                    System.out.println("toplanacak 1. sayıyı giriniz :");
                    int a = klavye.nextInt();
                    System.out.println("toplanacak 2. sayıyı giriniz :");
                    int b = klavye.nextInt();
                    klavye.nextLine();
                    System.out.println("sayıların toplamı :" + toplama(a, b));
                } else if (kaçsayı == 3) {
                    System.out.println("toplanacak 1. sayıyı giriniz :");
                    int a = klavye.nextInt();
                    System.out.println("toplanacak 2. sayıyı giriniz :");
                    int b = klavye.nextInt();
                    System.out.println("toplanacak 3. sayıyı giriniz :");
                    int c = klavye.nextInt();
                    klavye.nextLine();
                    System.out.println("sayıların toplamı :" + toplama(a, b, c));

                } else {
                    System.out.println("uygun metod bulunmuyo...");
                }
            }
            if (işlem.equals("2")) {
                System.out.println("çıkarmak için kaç deger gireceksınız (2 veya 3)");
                int kaçsayı = klavye.nextInt();
                if (kaçsayı == 2) {
                    System.out.println("çıkarilacak 1. sayıyı giriniz :");
                    int a = klavye.nextInt();
                    System.out.println("çıkarilacak  2. sayıyı giriniz :");
                    int b = klavye.nextInt();
                    klavye.nextLine();
                    System.out.println("sayıların sonucu :" + cıkarma(a, b));
                } else if (kaçsayı == 3) {
                    System.out.println("çıkarilacak 1. sayıyı giriniz :");
                    int a = klavye.nextInt();
                    System.out.println("çıkarilacak 2. sayıyı giriniz :");
                    int b = klavye.nextInt();
                    System.out.println("çıkarilacak 3. sayıyı giriniz :");
                    int c = klavye.nextInt();
                    klavye.nextLine();
                    System.out.println("sayıların sonucu :" + cıkarma(a, b, c));

                } else if (kaçsayı != 2 || kaçsayı != 3) {
                    System.out.println("uygun metod bulunmuyo...");
                }
            } else if (işlem.equals("3")) {
                System.out.println("çarpmak için kac deger gireceksiniz (2 veya 3)");
                int kaçsayı = klavye.nextInt();
                if (kaçsayı == 2) {
                    System.out.println("çarpmak için 1. sayıyı giriniz :");
                    int a = klavye.nextInt();
                    System.out.println("çarpmak için 2. sayıyı giriniz :");
                    int b = klavye.nextInt();
                    klavye.nextLine();
                    System.out.println("sayıların çarpımı :" + çarpma(a, b));
                } else if (kaçsayı == 3) {
                    System.out.println("çarpmak 1. sayıyı giriniz :");
                    int a = klavye.nextInt();
                    System.out.println("çarpmak 2. sayıyı giriniz :");
                    int b = klavye.nextInt();
                    System.out.println("çarpmak 3. sayıyı giriniz :");
                    int c = klavye.nextInt();
                    klavye.nextLine();
                    System.out.println("sayıların toplamı :" + çarpma(a, b, c));
                } else if (kaçsayı != 2) {
                    System.out.println("uygun metot bulunmuyo :");
                }
            } else if (işlem.equals("4")) {
                System.out.println("bölmek için kaç deger gireceksiniz (2 veya 3) :");
                int kaçsayı = klavye.nextInt();
                if (kaçsayı == 2) {
                    System.out.println("bölmek  için 1. sayıyı giriniz :");
                    int a = klavye.nextInt();
                    System.out.println("bölmek için 2. sayıyı giriniz :");
                    int b = klavye.nextInt();
                    klavye.nextLine();
                    System.out.println("sayıların çarpımı :" + bölme(a, b));
                } else if (kaçsayı == 3) {
                    System.out.println("bölmek 1. sayıyı giriniz :");
                    int a = klavye.nextInt();
                    System.out.println("bölmek 2. sayıyı giriniz :");
                    int b = klavye.nextInt();
                    System.out.println("bölmek 3. sayıyı giriniz :");
                    int c = klavye.nextInt();
                    klavye.nextLine();
                    System.out.println("sayıların toplamı :" + bölme(a, b, c));
                } else {
                    System.out.println("uygun metod bulunmuyo...");
                }
            }
        }
    }
}
