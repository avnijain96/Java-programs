/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Avni Jain
 */
public class Fibonacci
{
    public static void main(String ar[])
    {
        int a=0, b=1, c;
        System.out.print("\n"+a+"\t"+b);
        for(int i=0;i<10;i++)
        {
         c=a+b;
         System.out.print("\t"+c);
         a=b;
         b=c;
        }
    }
}
