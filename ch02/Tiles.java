package ch02;

import java.util.Scanner;

/**
 * Compute the number of tiles needed and the gap at each end, 
 * given the space available and the width of each tile.
 */
public class Tiles {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the total width: ");
		int totalWidth = in.nextInt(); //inches
		System.out.print("Enter the tile width: ");
		int tileWidth = in.nextInt();	//inches
		
		int numOfPairs = (totalWidth - tileWidth) / (2 * tileWidth);
		int numOfTiles = 1 + 2 * numOfPairs;
		int gapAtEachEnd = (totalWidth - numOfTiles * tileWidth) / 2;
		
		System.out.println("Number of Pairs: "+numOfPairs);
		System.out.println("Number of Tiles: "+numOfTiles);
		System.out.println("Gap at Each End: "+gapAtEachEnd);
	}

}
