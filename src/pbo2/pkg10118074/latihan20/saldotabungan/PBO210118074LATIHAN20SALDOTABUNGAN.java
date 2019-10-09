/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan20.saldotabungan;

/**
 *
 * @author ASUS
 */
public class PBO210118074LATIHAN20SALDOTABUNGAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i,total,bunga;
        total=3500000
        bunga= (int) (total*0.08);
        total=total+bunga;
        i=1;
        do{
            
            System.out.println("Saldo di bulan ke-" + i + "Rp" + total);
            i++;
            bunga= (int) (total * 0.08);
            total +=bunga;
        
       }while (i<=8);     
                
    }
    
}
