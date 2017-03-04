package com.renz.discountThirtyPercent;
/*
 * 2-d array example
 * Jayson Mallari
 */
import java.util.Scanner;
public class DiscountThirtyPercent {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double[][] itemsPrice = new double[5][2];
		
			for(int x=0;x<itemsPrice.length;x++){
				System.out.println("Please enter the price for Item"+(x+1));
				itemsPrice[x][0] = in.nextDouble();
				itemsPrice[x][1] = itemsPrice[x][0] * .70;
			}
			
			for(int x=0;x<itemsPrice.length;x++){
				System.out.println("Item price: $"+itemsPrice[x][0] + 
						"\t w/ 30% discount price: $"+itemsPrice[x][1]);
			}
	}
}
