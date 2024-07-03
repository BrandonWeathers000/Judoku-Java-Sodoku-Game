class Grid{
	Box[] Boxes = new Box[9];

	// Creating a default grid
	public Grid(){
		for(int boxesIndex = 0; boxesIndex <= 8; boxesIndex++){
			Boxes[boxesIndex] = new Box();
		}
	}

	// Creating a grid with custom inputs
	public Grid(Box boxZero, Box boxOne, Box boxTwo, Box boxThree, Box boxFour, Box boxFive, Box boxSix, Box boxSeven, Box boxEight){
		for(int boxesIndex = 0; boxesIndex <= 8; boxesIndex++){
			     if(boxesIndex == 0) Boxes[boxesIndex] = boxZero;
			else if(boxesIndex == 1) Boxes[boxesIndex] = boxOne;
			else if(boxesIndex == 2) Boxes[boxesIndex] = boxTwo;
			else if(boxesIndex == 3) Boxes[boxesIndex] = boxThree;
			else if(boxesIndex == 4) Boxes[boxesIndex] = boxFour;
			else if(boxesIndex == 5) Boxes[boxesIndex] = boxFive;
			else if(boxesIndex == 6) Boxes[boxesIndex] = boxSix;
			else if(boxesIndex == 7) Boxes[boxesIndex] = boxSeven;
			else if(boxesIndex == 8) Boxes[boxesIndex] = boxEight;
		}
	}

	/*
	public boolean alternateCheckRow(int wantedRow){
		int[] numbersInRow = new int[9];
		// Need to check with father to see if there
		// is a better way to implement this method
	}
	*/

	public boolean checkRow(int wantedRow){
		// Will return false if all the elements in the given row are the same
		int[] row = new int[9];
		if(wantedRow == 0){
			row[0] = Boxes[0].getCellValue(0);
			row[1] = Boxes[0].getCellValue(1);
			row[2] = Boxes[0].getCellValue(2);
			row[3] = Boxes[1].getCellValue(0);
			row[4] = Boxes[1].getCellValue(1);
			row[5] = Boxes[1].getCellValue(2);
			row[6] = Boxes[2].getCellValue(0);
			row[7] = Boxes[2].getCellValue(1);
			row[8] = Boxes[2].getCellValue(2);
		}else if(wantedRow == 1){
			row[0] = Boxes[0].getCellValue(3);
			row[1] = Boxes[0].getCellValue(4);
			row[2] = Boxes[0].getCellValue(5);
			row[3] = Boxes[1].getCellValue(3);
			row[4] = Boxes[1].getCellValue(4);
			row[5] = Boxes[1].getCellValue(5);
			row[6] = Boxes[2].getCellValue(3);
			row[7] = Boxes[2].getCellValue(4);
			row[8] = Boxes[2].getCellValue(5);
		}else if(wantedRow == 2){
			row[0] = Boxes[0].getCellValue(6);
			row[1] = Boxes[0].getCellValue(7);
			row[2] = Boxes[0].getCellValue(8);
			row[3] = Boxes[1].getCellValue(6);
			row[4] = Boxes[1].getCellValue(7);
			row[5] = Boxes[1].getCellValue(8);
			row[6] = Boxes[2].getCellValue(6);
			row[7] = Boxes[2].getCellValue(7);
			row[8] = Boxes[2].getCellValue(8);
		}else if(wantedRow == 3){
			row[0] = Boxes[3].getCellValue(0);
			row[1] = Boxes[3].getCellValue(1);
			row[2] = Boxes[3].getCellValue(2);
			row[3] = Boxes[4].getCellValue(0);
			row[4] = Boxes[4].getCellValue(1);
			row[5] = Boxes[4].getCellValue(2);
			row[6] = Boxes[5].getCellValue(0);
			row[7] = Boxes[5].getCellValue(1);
			row[8] = Boxes[5].getCellValue(2);
		}else if(wantedRow == 4){
			row[0] = Boxes[3].getCellValue(3);
			row[1] = Boxes[3].getCellValue(4);
			row[2] = Boxes[3].getCellValue(5);
			row[3] = Boxes[4].getCellValue(3);
			row[4] = Boxes[4].getCellValue(4);
			row[5] = Boxes[4].getCellValue(5);
			row[6] = Boxes[5].getCellValue(3);
			row[7] = Boxes[5].getCellValue(4);
			row[8] = Boxes[5].getCellValue(5);
		}else if(wantedRow == 5){
			row[0] = Boxes[3].getCellValue(6);
			row[1] = Boxes[3].getCellValue(7);
			row[2] = Boxes[3].getCellValue(8);
			row[3] = Boxes[4].getCellValue(6);
			row[4] = Boxes[4].getCellValue(7);
			row[5] = Boxes[4].getCellValue(8);
			row[6] = Boxes[5].getCellValue(6);
			row[7] = Boxes[5].getCellValue(7);
			row[8] = Boxes[5].getCellValue(8);
		}else if(wantedRow == 6){
			row[0] = Boxes[6].getCellValue(0);
			row[1] = Boxes[6].getCellValue(1);
			row[2] = Boxes[6].getCellValue(2);
			row[3] = Boxes[7].getCellValue(0);
			row[4] = Boxes[7].getCellValue(1);
			row[5] = Boxes[7].getCellValue(2);
			row[6] = Boxes[8].getCellValue(0);
			row[7] = Boxes[8].getCellValue(1);
			row[8] = Boxes[8].getCellValue(2);
		}else if(wantedRow == 7){
			row[0] = Boxes[6].getCellValue(3);
			row[1] = Boxes[6].getCellValue(4);
			row[2] = Boxes[6].getCellValue(5);
			row[3] = Boxes[7].getCellValue(3);
			row[4] = Boxes[7].getCellValue(4);
			row[5] = Boxes[7].getCellValue(5);
			row[6] = Boxes[8].getCellValue(3);
			row[7] = Boxes[8].getCellValue(4);
			row[8] = Boxes[8].getCellValue(5);
		}else{
			row[0] = Boxes[6].getCellValue(6);
			row[1] = Boxes[6].getCellValue(7);
			row[2] = Boxes[6].getCellValue(8);
			row[3] = Boxes[7].getCellValue(6);
			row[4] = Boxes[7].getCellValue(7);
			row[5] = Boxes[7].getCellValue(8);
			row[6] = Boxes[8].getCellValue(6);
			row[7] = Boxes[8].getCellValue(7);
			row[8] = Boxes[8].getCellValue(8);
		}

		return allTheSame(row);
	}

	public void printArray(int[] inputArray){
		for(int index = 0; index < inputArray.length; index++){
			System.out.println(inputArray[index]);
		}
	}

	public boolean checkColumn(int columnIndex){
		// Will return false if all the elements in the given column are the same
		int[] currentColumn = new int[9];
		if(columnIndex == 0){
			currentColumn[0] = Boxes[0].getCellValue(0);
			currentColumn[1] = Boxes[0].getCellValue(3);
			currentColumn[2] = Boxes[0].getCellValue(6);
			currentColumn[3] = Boxes[3].getCellValue(0);
			currentColumn[4] = Boxes[3].getCellValue(3);
			currentColumn[5] = Boxes[3].getCellValue(6);
			currentColumn[6] = Boxes[6].getCellValue(0);
			currentColumn[7] = Boxes[6].getCellValue(3);
			currentColumn[8] = Boxes[6].getCellValue(6);
		}else if(columnIndex == 1){
			currentColumn[0] = Boxes[0].getCellValue(1); currentColumn[1] = Boxes[0].getCellValue(4);
			currentColumn[2] = Boxes[0].getCellValue(7);
			currentColumn[3] = Boxes[3].getCellValue(1);
			currentColumn[4] = Boxes[3].getCellValue(4);
			currentColumn[5] = Boxes[3].getCellValue(7);
			currentColumn[6] = Boxes[6].getCellValue(1);
			currentColumn[7] = Boxes[6].getCellValue(4);
			currentColumn[8] = Boxes[6].getCellValue(7);
		}else if(columnIndex == 2){
			currentColumn[0] = Boxes[0].getCellValue(2);
			currentColumn[1] = Boxes[0].getCellValue(5);
			currentColumn[2] = Boxes[0].getCellValue(8);
			currentColumn[3] = Boxes[3].getCellValue(2);
			currentColumn[4] = Boxes[3].getCellValue(5);
			currentColumn[5] = Boxes[3].getCellValue(8);
			currentColumn[6] = Boxes[6].getCellValue(2);
			currentColumn[7] = Boxes[6].getCellValue(5);
			currentColumn[8] = Boxes[6].getCellValue(8);
		}else if(columnIndex == 3){
			currentColumn[0] = Boxes[1].getCellValue(0);
			currentColumn[1] = Boxes[1].getCellValue(3);
			currentColumn[2] = Boxes[1].getCellValue(6);
			currentColumn[3] = Boxes[4].getCellValue(0);
			currentColumn[4] = Boxes[4].getCellValue(3);
			currentColumn[5] = Boxes[4].getCellValue(6);
			currentColumn[6] = Boxes[7].getCellValue(0);
			currentColumn[7] = Boxes[7].getCellValue(3);
			currentColumn[8] = Boxes[7].getCellValue(6);
		}else if(columnIndex == 4){
			currentColumn[0] = Boxes[1].getCellValue(1);
			currentColumn[1] = Boxes[1].getCellValue(4);
			currentColumn[2] = Boxes[1].getCellValue(7);
			currentColumn[3] = Boxes[4].getCellValue(1);
			currentColumn[4] = Boxes[4].getCellValue(4);
			currentColumn[5] = Boxes[4].getCellValue(7);
			currentColumn[6] = Boxes[7].getCellValue(1);
			currentColumn[7] = Boxes[7].getCellValue(4);
			currentColumn[8] = Boxes[7].getCellValue(7);
		}else if(columnIndex == 5){
			currentColumn[0] = Boxes[1].getCellValue(2);
			currentColumn[1] = Boxes[1].getCellValue(5);
			currentColumn[2] = Boxes[1].getCellValue(8);
			currentColumn[3] = Boxes[4].getCellValue(2);
			currentColumn[4] = Boxes[4].getCellValue(5);
			currentColumn[5] = Boxes[4].getCellValue(8);
			currentColumn[6] = Boxes[7].getCellValue(2);
			currentColumn[7] = Boxes[7].getCellValue(5);
			currentColumn[8] = Boxes[7].getCellValue(8);
		}else if(columnIndex == 6){
			currentColumn[0] = Boxes[2].getCellValue(0);
			currentColumn[1] = Boxes[2].getCellValue(3);
			currentColumn[2] = Boxes[2].getCellValue(6);
			currentColumn[3] = Boxes[5].getCellValue(0);
			currentColumn[4] = Boxes[5].getCellValue(3);
			currentColumn[5] = Boxes[5].getCellValue(6);
			currentColumn[6] = Boxes[8].getCellValue(0);
			currentColumn[7] = Boxes[8].getCellValue(3);
			currentColumn[8] = Boxes[8].getCellValue(6);
		}else if(columnIndex == 7){           
			currentColumn[0] = Boxes[2].getCellValue(1);
			currentColumn[1] = Boxes[2].getCellValue(4);
			currentColumn[2] = Boxes[2].getCellValue(7);
			currentColumn[3] = Boxes[5].getCellValue(1);
			currentColumn[4] = Boxes[5].getCellValue(4);
			currentColumn[5] = Boxes[5].getCellValue(7);
			currentColumn[6] = Boxes[8].getCellValue(1);
			currentColumn[7] = Boxes[8].getCellValue(4);
			currentColumn[8] = Boxes[8].getCellValue(7);
		}else{                                            
			currentColumn[0] = Boxes[2].getCellValue(2);
			currentColumn[1] = Boxes[2].getCellValue(5);
			currentColumn[2] = Boxes[2].getCellValue(8);
			currentColumn[3] = Boxes[5].getCellValue(2);
			currentColumn[4] = Boxes[5].getCellValue(5);
			currentColumn[5] = Boxes[5].getCellValue(8);
			currentColumn[6] = Boxes[8].getCellValue(2);
			currentColumn[7] = Boxes[8].getCellValue(5);
			currentColumn[8] = Boxes[8].getCellValue(8);
		}
		return allTheSame(currentColumn);
	}

	public boolean allTheSame(int[] givenRow){
		for(int firstIndex = 0; firstIndex < givenRow.length; firstIndex++){
			for(int secondIndex = 0; secondIndex < givenRow.length; secondIndex++){
				if(firstIndex == secondIndex){
					break;
				}else if(givenRow[firstIndex] == givenRow[secondIndex]){
					return true;
				}
			}
		}
		return false;
	}

	// Method to print out general info about each cell for debugging purposes
	public void displayInfo(int boxIndex, int cellIndex){
		System.out.println("You are currently on box: " + boxIndex);
		System.out.println("You are currently on cell: " + cellIndex);
	}

	public void printCell(int boxIndex, int cellIndex){
		System.out.print("" + Boxes[boxIndex].getCellValue(cellIndex) + " ");
	}


	
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
				printCell(boxIndex, cellIndex);

				System.out.println();
				break;
			}else if(((boxIndex == 2) || (boxIndex == 5) || (boxIndex == 8)) && (cellIndex == 8)){
				printCell(boxIndex, cellIndex);

				System.out.println();
				System.out.println("=======================");

				boxIndex++;
				cellIndex = 0;
			}else if(((boxIndex == 2) || (boxIndex == 5) || (boxIndex == 8)) && ((cellIndex == 2) || (cellIndex == 5) || (cellIndex == 8))){
				printCell(boxIndex, cellIndex);

				System.out.println();

				boxIndex -= 2;
				cellIndex++;
			}else if((cellIndex == 2) || (cellIndex == 5) || (cellIndex == 8)){
				printCell(boxIndex, cellIndex);

				System.out.print("|| ");

				boxIndex++;
				cellIndex -= 2;
			}else{
				printCell(boxIndex, cellIndex);

				cellIndex++;
			}
		}
		return;
	}
}
