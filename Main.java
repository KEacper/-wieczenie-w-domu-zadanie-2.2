import java.util.Scanner;
import java.lang.*;



class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Witaj w programie, Wybierz funkcję:");
  System.out.println("1) Zamiana liter");
  System.out.println("2) Kopiowanie znak po znaku");
  System.out.println("3) Liczenie znaków");
  System.out.println("4) Zamiana spacji na podkreślenia");
  int s = scan.nextInt();
    switch(s){
      case 1:
        System.out.println("1) Zamiana małych liter na duże: ");
        System.out.println("2) Zamiana dużych liter na małe: ");
            int z = scan.nextInt();
        
            System.out.println("Wprowadz dowolny tekst:");
            scan.nextLine();
            String tekst = scan.nextLine();
            int dlugosc = tekst.length();
            char tab[]=new char[dlugosc];
        
            for (int i=0; i<dlugosc; i++){
            tab[i]=tekst.charAt(i);
            }
        
            int zmienione = 0;
              
           for(int i=0;i<dlugosc;i++){
              if(Character.isLowerCase(tab[i])){
              if(z==1){
                tab[i]= Character.toUpperCase(tab[i]);
                zmienione = zmienione +1;
                System.out.print(tab[i]);
                }else{System.out.print(tab[i]);
                }
                }else{
                if(z==2){
                tab[i]= Character.toLowerCase(tab[i]);
                zmienione = zmienione +1;
               System.out.print(tab[i]);
              } else{
                System.out.print(tab[i]);
              }
              
          }
          
        } 
        System.out.println();
        System.out.println("Liczba zamienionych liter:  "+zmienione);
    
    break;
    }
  }
 }