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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number= ");
		int n=s.nextInt();
                int c = 0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				c=1;
				System.out.println("**Number is prime**");
			}
			else
				System.out.println("**Number is not prime**");
		}
	}
}
