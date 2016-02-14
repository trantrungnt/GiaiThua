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
    int n;
    public void inputNumber()
    {
        
        
        try{
            System.out.print("\nNhap n=");
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(oBufferedReader.readLine());
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void displayNumber()
    {
        System.out.println(n);
    }
    
}
