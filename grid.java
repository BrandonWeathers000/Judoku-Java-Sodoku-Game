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
			     if(boxesIndex == 0) boxes[0] = boxZero;
			else if(boxesIndex == 1) boxes[1] = boxOne;
			else if(boxesIndex == 2) boxes[2] = boxTwo;
			else if(boxesIndex == 3) boxes[3] = boxThree;
			else if(boxesIndex == 4) boxes[4] = boxFour;
			else if(boxesIndex == 5) boxes[5] = boxFive;
			else if(boxesIndex == 6) boxes[6] = boxSix;
			else if(boxesIndex == 7) boxes[7] = boxSeven;
			else if(boxesIndex == 8) boxes[8] = boxEight;
		}
	}

	// Method to print out general info about each cell for debugging purposes
	public void displayInfo(int boxIndex, int cellIndex){
		System.out.println("You are currently on box: " + boxIndex);
		System.out.println("You are currently on cell: " + cellIndex);
	}

	public void printCell(int boxIndex, int cellIndex){
		System.out.print("" + boxes[boxIndex].getCellValue(cellIndex) + " ");
	}

	// 0.0  0.1  0.2 || 1.0  1.1  1.2 || 2.0  2.1  2.2
	// 0.3  0.4  0.5 || 1.3  1.4  1.5 || 2.3  2.4  2.5 0.6  0.7  0.8 || 1.6  1.7  1.8 || 2.6  2.7  2.8
	// ===============================================
	// 3.0  3.1  3.2 || 4.0  4.1  4.2 || 5.0  5.1  5.2
	// 3.3  3.4  3.5 || 4.3  4.4  4.5 || 5.3  5.4  5.5
	// 3.6  3.7  3.8 || 4.6  4.7  4.8 || 5.6  5.7  5.8
	// ===============================================
	// 6.0  6.1  6.2 || 7.0  7.1  7.2 || 8.0  8.1  8.2
	// 6.3  6.4  6.5 || 7.3  7.4  7.5 || 8.3  8.4  8.5
	// 6.6  6.7  6.8 || 7.6  7.7  7.8 || 8.6  8.7  8.8
	
	public void printGridInDebugMode(){

		int boxIndex = 0;
		int cellIndex = 0;
		int emergencyStop = 0;

		while(true){
			if(emergencyStop >= 100){
				System.out.println("The emergency stop counter has reached its limit. Program forcably stopped.");
				break;
			}else if((boxIndex == 8) && (cellIndex == 8)){
				System.out.println("Goal: end the function");
				displayInfo(boxIndex, cellIndex);

				printCell(boxIndex, cellIndex);

				break;
			}else if(((boxIndex == 2) || (boxIndex == 5) || (boxIndex == 8)) && (cellIndex == 8)){
				System.out.println("Goal: print the BAR");
				displayInfo(boxIndex, cellIndex);

				printCell(boxIndex, cellIndex);

				System.out.println("===============================================");

				boxIndex++;
				cellIndex = 0;
				emergencyStop++;
			}else if(((boxIndex == 2) || (boxIndex == 5) || (boxIndex == 8)) && ((cellIndex == 2) || (cellIndex == 5) || (cellIndex == 8))){
				System.out.println("Goal: go to a new line");
				displayInfo(boxIndex, cellIndex);

				printCell(boxIndex, cellIndex);

				System.out.println();

				boxIndex -= 2;
				cellIndex++;
				emergencyStop++;
			}else if((cellIndex == 2) || (cellIndex == 5) || (cellIndex == 8)){
				System.out.println("Goal: print double pipes");
				displayInfo(boxIndex, cellIndex);

				printCell(boxIndex, cellIndex);

				System.out.println("||");

				boxIndex++;
				cellIndex -= 2;
				emergencyStop++;
			}else{
				System.out.println("Goal: print out a normal cell");
				displayInfo(boxIndex, cellIndex);

				printCell(boxIndex, cellIndex);

				cellIndex++;
				emergencyStop++;
			}
		}
		return;
	}

	public void printGrid(){

		int boxIndex = 0;
		int cellIndex = 0;

		while(true){
			if((boxIndex == 8) && (cellIndex == 8)){
				// System.out.println("Goal: end the function");
				// displayInfo(boxIndex, cellIndex);

				printCell(boxIndex, cellIndex);

				System.out.println();
				break;
			}else if(((boxIndex == 2) || (boxIndex == 5) || (boxIndex == 8)) && (cellIndex == 8)){
				// System.out.println("Goal: print the BAR");
				// displayInfo(boxIndex, cellIndex);

				printCell(boxIndex, cellIndex);

				System.out.println();
				System.out.println("=======================");

				boxIndex++;
				cellIndex = 0;
			}else if(((boxIndex == 2) || (boxIndex == 5) || (boxIndex == 8)) && ((cellIndex == 2) || (cellIndex == 5) || (cellIndex == 8))){
				// System.out.println("Goal: go to a new line");
				// displayInfo(boxIndex, cellIndex);

				printCell(boxIndex, cellIndex);

				System.out.println();

				boxIndex -= 2;
				cellIndex++;
			}else if((cellIndex == 2) || (cellIndex == 5) || (cellIndex == 8)){
				// System.out.println("Goal: print double pipes");
				// displayInfo(boxIndex, cellIndex);

				printCell(boxIndex, cellIndex);

				System.out.print("|| ");

				boxIndex++;
				cellIndex -= 2;
			}else{
				// System.out.println("Goal: print out a normal cell");
				// displayInfo(boxIndex, cellIndex);

				printCell(boxIndex, cellIndex);

				cellIndex++;
			}
		}
		return;
	}
}
