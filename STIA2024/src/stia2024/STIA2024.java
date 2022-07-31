/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stia2024;

public class STIA2024 
{
    public static void main(String[] args)
    {
        System.out.print(gcd(54, 24));
    }

    public static int gcd(int x, int y)
    {
        if (y==0)
            return x;
        
        else
            return gcd(y, x%y);
    }
    
}
