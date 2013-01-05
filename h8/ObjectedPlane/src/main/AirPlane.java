package main;

import java.util.Random;

public class AirPlane {
	private Human seats[][] = new Human[27][6];
	private int sum = 0;
	private int minRow = 0;
	private int maxRow = 26;
	private int[] sLines = new int[2];
	private int gSize = 3;
	
	AirPlane() {
		sLines[0] = 3;
		sLines[1] = 3;
		for ( int i = 0; i <27; i++) {
			for ( int k = 0; k < 6; k++) {
				seats[i][k] = new Human();
			}
		}
		
	}
	
	public void fill() {
		Random addRand = new Random();
		while ( (this.sum < 162) || (this.gSize>0) ) {
			int tempGSize = this.gSize;
			int gSizeRand = addRand.nextInt(gSize)+1;
			add(gSizeRand);
			System.out.println(gSizeRand + "ppl enter the plane.");
			if ( this.gSize != tempGSize ) {
				continue;
			}
			print_seats();
			System.out.println("sum:" + this.sum);
			System.out.println(this.gSize);
			System.out.println();
		}
	}
	
	public void print_seats() {
		int colSeats = 0;
		for( int i = 0; i<sLines.length; i++) {
			colSeats += sLines[i];
		}
		for( int r = 0; r < maxRow; r++) {
			for ( int c = 0; c < colSeats; c++) {
				int colTemp = 0;
				printSeat(r,c);
				if ( c == this.sLines[colTemp]-1) {
					System.out.print("             ");
				}
			}
			System.out.println();
		}
	}
	
	public void add(int gSize) {
		for (int minRowT = minRow; minRowT <= maxRow; minRowT++) {
			int pointer = 0-sLines[0];
			for (int i2 = 0; i2 < sLines.length; i2++) {
				pointer += sLines[i2];
				if ( sLines[i2] < gSize ) {
					pointer += sLines[i2];
					continue;
				} else {
					int result = seats_taken(pointer, i2, minRowT);
					if( gSize > sLines[i2] - result ) {
						continue;
					} else {
						int pRes = pointer+result;
						for( int i3 = pRes; i3 <= pRes + gSize-1; i3++ ) {
							seats[minRowT][i3] = new Human("arg");
						}
						this.sum += gSize;
						return;
					}
				}
			}
		}
		System.out.println("Group of this size is unable to enter the plane.");
		this.gSize = gSize-1;
		return;		
	}
			
	public int seats_taken(int pointer, int i, int minRowT) {
		int counter = 0;
		for( int i2 = pointer; i2 <= pointer + sLines[i]-1; i2++) {
			if( seats[minRowT][i2].getGender().equals("Empty ")) {
				continue;
			} else {
				counter++;
			}
		}
		return counter;
	}

	public Human[][] getSeats() {
		return seats;
	}

	public void setSeats(Human[][] seats) {
		this.seats = seats;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getMinRow() {
		return minRow;
	}

	public void setMinRow(int minRow) {
		this.minRow = minRow;
	}

	public int getMaxRow() {
		return maxRow;
	}

	public void setMaxRow(int maxRow) {
		this.maxRow = maxRow;
	}

	public int[] getsLines() {
		return sLines;
	}

	public void setsLines(int[] sLines) {
		this.sLines = sLines;
	}

	public int getgSize() {
		return gSize;
	}

	public void setgSize(int gSize) {
		this.gSize = gSize;
	}

	public void printSeat(int r, int c) {
		System.out.print( "[" + seats[r][c].getGender() + "]");
	}
	
	//Getters and setters...
	
			
		
		
}

