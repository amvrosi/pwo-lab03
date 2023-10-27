/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

/**
 *
 * @author student
 */
public class LucasGenerator 
{
	public static void main (String[] args)
	{
		// 
		int count=0;
		
		while(count<=100)//while it is less than Lucas 30
		{
			System.out.println(lucas(count));
			count++;
		}
	}
	public static Integer lucas(int i)
	{
		/**Method to use recusion to return
		 * the first 30 Lucas numbers.
		 */
		if (i == 0) return 2;
		if (i == 1) return 1;
		Integer z = lucas(i - 1) + lucas(i - 2);
		if (i > 1) return z;
		return z;
	}
}