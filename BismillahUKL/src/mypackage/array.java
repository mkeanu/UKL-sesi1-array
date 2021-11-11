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
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a = {{2, 3, 5},{5, 5, 6},{1, 2, 5}};
        int[][] b = {{2,3,4}, {3,4,6}, {1,2,2}};
        int[][] hasil = {{0,0,0}, {0,0,0},{0,0,0}};
        
        //a-b
        for(int i=0; i<a.length;i++){//baris a.length = mendapatkan jumnlah baris
            for(int j=0;j<a[0].length;j++){//kolom a[0].length = mendapatkan jumlah kolom
                System.out.print(a[i][j]-b[i][j] + " ");
            }
            System.out.println();
        }
        /*
        // a x b
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<hasil.length;k++)
                    hasil[i][j]+=a[i][j]*b[k][j];
                }
            }
        }
        */
        
        /*//tampil
        for(int i=0;i<hasil.length;i++){
            for(int j=0;j<hasil.length;j++){
                System.out.print(hasil[i][j]+" ");
        }
            System.out.println();
    }*/
    
}
}
