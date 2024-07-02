public class Main{
	public static void main (String args []){
		// Solved sudoku grid
		Box myBoxOne = new Box(3, 9, 1, 4, 8, 7, 6, 5, 2);
		Box myBoxTwo = new Box(2, 8, 6, 3, 5, 9, 7, 1, 4);
		Box myBoxThree = new Box(5, 7, 4, 1, 2, 6, 8, 3, 9);
		Box myBoxFour = new Box(8, 7, 5, 2, 1, 3, 9, 6, 4);
		Box myBoxFive = new Box(4, 3, 1, 9, 6, 7, 5, 2, 8);
		Box myBoxSix = new Box(6, 9, 2, 4, 8, 5, 7, 1, 3);
		Box myBoxSeven = new Box(1, 4, 9, 5, 3, 8, 7, 2, 6);
		Box myBoxEight = new Box(6, 7, 3, 1, 4, 2, 8, 9, 5);
		Box myBoxNine = new Box(2, 5, 8, 9, 6, 7, 3, 4, 1);

		Grid myGrid = new Grid(myBoxOne, myBoxTwo, myBoxThree, myBoxFour, myBoxFive, myBoxSix, myBoxSeven, myBoxEight, myBoxNine);

		//myGrid.printGrid();

		//System.out.println(myGrid.checkRow(0));
		
		System.out.println(myGrid.checkColumn(0));
	}
}
