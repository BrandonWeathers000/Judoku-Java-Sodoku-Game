/*
 * To-Do:
 * Creating a print function for the whole grid
 *
 */
class grid{
	box[] boxes = new box[9];

	// Creating a default grid
	public grid(){
		for(int boxesIndex = 0; boxesIndex <= 8; boxesIndex++){
			boxes[boxesIndex] = new box();
		}
	}

	// Creating a grid with custom inputs
	public grid(box boxZero, box boxOne, box boxTwo, box boxThree, box boxFour, box boxFive, box boxSix, box boxSeven, box boxEight){
		for(int boxesIndex = 0; boxesIndex <= 8; boxesIndex++){
				if(boxIndex == 0) boxes[boxIndex] = boxZero;
			else if(boxIndex == 0) boxes[boxIndex] = boxOne;
			else if(boxIndex == 0) boxes[boxIndex] = boxTwo;
			else if(boxIndex == 0) boxes[boxIndex] = boxThree;
			else if(boxIndex == 0) boxes[boxIndex] = boxFour;
			else if(boxIndex == 0) boxes[boxIndex] = boxFive;
			else if(boxIndex == 0) boxes[boxIndex] = boxSix;
			else if(boxIndex == 0) boxes[boxIndex] = boxSeven;
			else if(boxIndex == 0) boxes[boxIndex] = boxEight;
		}
	}
}
