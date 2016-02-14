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
    public void inputNumber(int[] a, int n)
    {                
        try{
            BufferedReader oBufferReader = new BufferedReader(new InputStreamReader(System.in));
            
            for(int i=0; i<n; i++)
            {
                System.out.print("\na[" + i + "]=");
                a[i]= Integer.parseInt(oBufferReader.readLine()); 
            }   
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void displayNumber(int[] a ,int n)
    {        
        
    }
    
    /*void calculateGiaiThua()
    {
        int gt;
        
        if(n==1)
            gt=1;
        
    }*/
    
}
