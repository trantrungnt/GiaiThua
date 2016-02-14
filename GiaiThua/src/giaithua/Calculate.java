/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaithua;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author TrungNT
 */
public class Calculate {        
    public void inputNumber(double[] a, int n)
    {                
        try{
            BufferedReader oBufferReader = new BufferedReader(new InputStreamReader(System.in));
            
            for(int i=0; i<n; i++)
            {
                System.out.print("\na[" + i + "]=");
                a[i]= Double.parseDouble(oBufferReader.readLine()); 
            }   
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void displayNumber(double[] a ,int n)
    {        
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    public double calculateGiaiThua(double x)
    {
        if(x==0)
            return 1;
         
        return x*calculateGiaiThua(x-1);        
    }
    
    public void displayGiaiThuaNumber(double[] a, int n)
    {
        for(int i=0; i<n; i++)
           System.out.print(calculateGiaiThua(a[i]) + " ");
        System.out.println();
    }
    
}
