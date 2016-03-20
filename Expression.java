package Expression.Math;
// This Program has been written to find the value of these expressions Z=X+Y*2, Z=X-Y+2, Z=(X+Y) * 2, Z=Y%X Assuming the values for X=5 & Y=10.

public class Expression {											// Declaration of class. 

	public static void main(String[] args) {						//	Main method.
		
		int iX=5, iY=10, iZ=0;										// Declaration & initialization of variables
		
		System.out.println(" SL No.     Expression     Value");		// Printing heads.
		iZ=iX+iY*2;													// Expression to be evaluated.
		System.out.println("   1.     Z = X + Y * 2   : " + iZ);	//Printing formatted output.
		iZ=iX-iY+2;													// Expression to be evaluated.
		System.out.println("   2.     Z = X - Y + 2   : " + iZ);	//Printing formatted output.
		iZ=(iX+iY)*2;												// Expression to be evaluated.
		System.out.println("   3.     Z = (X + Y) * 2 : " + iZ);	//Printing formatted output.
		iZ=iY%iX;													// Expression to be evaluated.
		System.out.println("   4.     Z = X % Y       :  " + iZ);	//Printing formatted output.
		
	}
	
}
