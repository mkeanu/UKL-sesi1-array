/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author user
 */
public class perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 7, selisih = 4, nilai1 = a, nilai2 = 0, total =0, n=10;
        System.out.println("Deret aritmatika\n" +"suku 1 : " + a + "\nselisih : "+ selisih );
        /*for(int i=0; i<10;i++){
            System.out.println(nilai1);
            total+=nilai1;
            nilai1+=selisih;
        }
        System.out.println("Jumlah : " + total);*/
        /*for(int i = 0; i<5;i++){
            for(int j=0;j<4;j++){
                System.out.print(nilai1 + " ");
                total +=nilai1;
                nilai1+=selisih;
            }
            System.out.println();
        }
        System.out.println("Jumlah : " + total);*/
        
        /*for(int i = 0; i<5; i++){
            for(int j=0;j<=i;j++){
                System.out.print(nilai1 +" ");
                total +=nilai1;
                nilai1+=selisih;
            }
            System.out.println();
        }
        System.out.println("Jumlah : " + total);*/
        
        for(int i=2;i<7;i++){
            for(int j=7;j>i;j--){
                System.out.print(nilai1 + " ");
                nilai1+=selisih;
            }
            System.out.println();
        }
        for(int i=3; i<7;i++){
            for(int j = 1;j<i;j++){
                System.out.print(nilai1 + " ");
                nilai1+=selisih;
            }
            System.out.println();
        }
        
    }
}
    

