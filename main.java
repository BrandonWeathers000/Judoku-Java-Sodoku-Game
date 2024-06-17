public class main{
	public static void main (String args []){
		box myBoxOne = new box(0, 1, 2, 3, 4, 5, 6, 7, 8);
		box myBoxTwo = new box(0, 1, 2, 3, 4, 5, 6, 7, 8);
		box myBoxThree = new box(0, 1, 2, 3, 4, 5, 6, 7, 8);
		box myBoxFour = new box(0, 1, 2, 3, 4, 5, 6, 7, 8);
		box myBoxFive = new box(0, 1, 2, 3, 4, 5, 6, 7, 8);
		box myBoxSix = new box(0, 1, 2, 3, 4, 5, 6, 7, 8);
		box myBoxSeven = new box(0, 1, 2, 3, 4, 5, 6, 7, 8);
		box myBoxEight = new box(0, 1, 2, 3, 4, 5, 6, 7, 8);
		box myBoxNine = new box(0, 1, 2, 3, 4, 5, 6, 7, 8);

		grid myGrid = new grid(myBoxOne, myBoxTwo, myBoxThree, myBoxFour, myBoxFive, myBoxSix, myBoxSeven, myBoxEight, myBoxNine);

		myGrid.printGrid();

		// grid testGrid = new grid();
		// testGrid.printGrid();
	}
}
