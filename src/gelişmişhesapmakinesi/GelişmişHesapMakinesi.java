
package gelişmişhesapmakinesi;

import java.util.Scanner;

public class GelişmişHesapMakinesi {
    public static int çıkarma(int a, int b){
        return a-b;
    }
    public static double bölme(int a, int b){
        return a/b;
    }
    public static int toplama(int a, int b, int c){
        return a+b+c;
    }
    public static int toplama(int a, int b){
        return a+b;
    }
    public static int çarpma(int a, int b, int c){
        return a*b*c;
    }
    public static int çarpma(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1. İşlem : Toplama işlemi\n"
                          +"2. İşlem : Çıkarma İşlemi\n"
                          +"3. İşlem : Çarpma İşlemi\n"
                          +"4. İşlem : Bölme İşlemi\n"
                          +"Çıkmak için q' ya basınız";
        System.out.println("********************************");
        System.out.println(islemler);
        System.out.println("********************************");
        
        while (true) {
            System.out.println("İşlem Seçiniz");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
                
                
            }
            else if (islem.equals("1")) {
                System.out.println("Kaç değer toplayacaksınız : (2 veya 3) : ");
                    int kacsayı = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (kacsayı == 2) {
                    System.out.println("Birinci sayıyı giriniz");
                    int a = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz");
                    int b = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Toplama işleminiz : " + toplama( a , b));
                    
                }
                    else if (kacsayı == 3 ) {
                    System.out.println("Birinci sayıyı giriniz");
                    int a = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz");
                    int b = scanner.nextInt();
                    System.out.println("Üçüncü sayıyı giriniz");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Toplama işleminiz : " + toplama(a, b, c));
                    
                }
                    else
                        System.out.println("Geçersiz metod...");
                    
                
                
            }
            else if (islem.equals("2")) {
                System.out.println("Birinici sayıyı giriniz");
                int a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Çıkarma sonucunuz : " + çıkarma(a, b));
                
                
            }
            else if (islem.equals("3")) {
                System.out.println("Kaç değer çarpacaksınız ? (2 veya 3)");
                int kacdeğer = scanner.nextInt();
                if (kacdeğer == 2) {
                System.out.println("Birinci sayıyı giriniz");
                int a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Çarpma işleminizin sonucu : " + çarpma(a, b));
                    
                }
                
                else if (kacdeğer == 3) {
                System.out.println("Birinci sayıyı giriniz");
                int a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int b = scanner.nextInt();
                System.out.println("Üçüncü sayıyı giriniz");
                int c = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Çarpma işleminizin soucu : " + çarpma(a, b, c));
                    
                }
                else
                    System.out.println("Geçersiz metod...");
                    
                
                
            }
            else if (islem.equals("4")) {
                System.out.println("Birinci sayıyı giriniz");
                int a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Bölme işleminizin sonucu : " + bölme(a, b));
                
            }
            else
                System.out.println("Geçersiz işlem...");
            

            
            
        }
        

        
                         
        
    }
    
}
