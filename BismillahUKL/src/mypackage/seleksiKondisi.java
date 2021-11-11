/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class seleksiKondisi {

    /**
     * @param args the command line arguments
     */
    static int input_id=0, input_pendapatan=0, input_jmlhBulan =0;
    static char golongan = 'A';
    static int[] id = {1,2,3,4};
    static String[] nama = {"Mira", "Nina", "Oemar", "Pena"};
    static String[] alamat = {"Sawojajar", "Kedung Kandang", "ijen","Dinoyo"};
    static String[] jalur_masuk = {"SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"};

    static int ID_siswa =0;
    static String Nama=" ", Alamat=" ", Jalur=" ";

    static int total_pemebayaran_spp = 0, DSP = 0, SPP = 0, total_bayar_SPP_DSP = 0;

    static void proses(int Input_id, int Input_pendapatan, int Input_jmlhBulan){
        int index = Input_id-1;
        
        ID_siswa = id[index];
        Nama = nama[index];
        Alamat = alamat[index];
        Jalur = jalur_masuk[index];

        switch(Jalur){
            case "SBMPTN":
            if(Input_pendapatan<2000000){
                DSP =5000000;
                SPP = 500000;
            }else if(Input_pendapatan>10000000){
                golongan = 'C';
                DSP = 30000000;
                SPP = 2000000;
            }else{
                golongan ='B';
                DSP = 15000000;
                SPP = 1000000;
            }
            break;

            case "SNMPTN":
            if(Input_pendapatan<2000000){
                DSP =7000000;
                SPP = 500000;
            }else if(Input_pendapatan>10000000){
                golongan = 'C';
                DSP = 35000000;
                SPP = 2000000;
            }else{
                golongan ='B';
                DSP = 17000000;
                SPP = 1000000;
            }
            break;

            case "Mandiiri":
            if(Input_pendapatan<2000000){
                DSP =10000000;
                SPP = 1000000;
            }else if(Input_pendapatan>10000000){
                golongan = 'C';
                DSP = 50000000;
                SPP = 3000000;
            }else{
                golongan ='B';
                DSP = 25000000;
                SPP = 3000000;
            }
            break;
        }

        total_pemebayaran_spp = SPP*Input_jmlhBulan;
        total_bayar_SPP_DSP=DSP + total_pemebayaran_spp;

    }

    static void tampil(){
        System.out.println("======++DATA++======");
        System.out.println("Id Siswa : " + ID_siswa);
        System.out.println("Nama Siswa : " + Nama + "\n" + "Alamat : "+Alamat);
        System.out.println("Pendapatan Ortu : " + input_pendapatan);
        System.out.println("Golongan : " + golongan);
        System.out.println("Jalur Masuk : " + Jalur + "\n" + "SPP : " + SPP + "\n" + "DSP : " + DSP);
        System.out.println();
        System.out.println("Jumlah bulan SPP yang akan dibayar : " + input_jmlhBulan);
        System.out.println("Total biaya SPP yang harus dibayar : " + total_pemebayaran_spp);
        System.out.println("\nTotal biaya keseluruhan yang harus dibayar : " + total_bayar_SPP_DSP);
        System.out.println("======++++++++======");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("input id : ");input_id = input.nextInt();

        System.out.print("input jumlah pendapatan : ");input_pendapatan = input.nextInt();

        System.out.print("input jumlah bulan spp : ");input_jmlhBulan = input.nextInt();

        System.out.println(); //jarak
        
        proses(input_id, input_pendapatan, input_jmlhBulan);

        tampil();
    }
    
}
