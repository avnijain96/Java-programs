/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Avni Jain
 */
public class array11
{
   
    public static void main()
    {
        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter rows-");
        int r=s.nextInt();
        System.out.println("Enter columns-");
        int c=s.nextInt();
        int ar[][]=new int[r][c];
        System.out.println("Enter elements-");
        for(int i=0;i<=r;i++)
        {
            for(int j=0;j<=c;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }
        
    }
}