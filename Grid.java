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
			     if(boxesIndex == 0) Boxes[0] = boxZero;
			else if(boxesIndex == 1) Boxes[1] = boxOne;
			else if(boxesIndex == 2) Boxes[2] = boxTwo;
			else if(boxesIndex == 3) Boxes[3] = boxThree;
			else if(boxesIndex == 4) Boxes[4] = boxFour;
			else if(boxesIndex == 5) Boxes[5] = boxFive;
			else if(boxesIndex == 6) Boxes[6] = boxSix;
			else if(boxesIndex == 7) Boxes[7] = boxSeven;
			else if(boxesIndex == 8) Boxes[8] = boxEight;
		}
	}

	public boolean checkRow(int rowIndex){
		int[] currentRow = new int[9];
		if(rowIndex == 0){
			currentRow[0] = Boxes[0].getCellValue(0);
			currentRow[1] = Boxes[0].getCellValue(1);
			currentRow[2] = Boxes[0].getCellValue(2);
			currentRow[3] = Boxes[1].getCellValue(0);
			currentRow[4] = Boxes[1].getCellValue(1);
			currentRow[5] = Boxes[1].getCellValue(2);
			currentRow[6] = Boxes[2].getCellValue(0);
			currentRow[7] = Boxes[2].getCellValue(1);
			currentRow[8] = Boxes[2].getCellValue(2);
		}else if(rowIndex == 1){
			currentRow[0] = Boxes[0].getCellValue(3);
			currentRow[1] = Boxes[0].getCellValue(4);
			currentRow[2] = Boxes[0].getCellValue(5);
			currentRow[3] = Boxes[1].getCellValue(3);
			currentRow[4] = Boxes[1].getCellValue(4);
			currentRow[5] = Boxes[1].getCellValue(5);
			currentRow[6] = Boxes[2].getCellValue(3);
			currentRow[7] = Boxes[2].getCellValue(4);
			currentRow[8] = Boxes[2].getCellValue(5);
		}else if(rowIndex == 2){
			currentRow[0] = Boxes[0].getCellValue(6);
			currentRow[1] = Boxes[0].getCellValue(7);
			currentRow[2] = Boxes[0].getCellValue(8);
			currentRow[3] = Boxes[1].getCellValue(6);
			currentRow[4] = Boxes[1].getCellValue(7);
			currentRow[5] = Boxes[1].getCellValue(8);
			currentRow[6] = Boxes[2].getCellValue(6);
			currentRow[7] = Boxes[2].getCellValue(7);
			currentRow[8] = Boxes[2].getCellValue(8);
		}else if(rowIndex == 3){
			currentRow[0] = Boxes[3].getCellValue(0);
			currentRow[1] = Boxes[3].getCellValue(1);
			currentRow[2] = Boxes[3].getCellValue(2);
			currentRow[3] = Boxes[4].getCellValue(0);
			currentRow[4] = Boxes[4].getCellValue(1);
			currentRow[5] = Boxes[4].getCellValue(2);
			currentRow[6] = Boxes[5].getCellValue(0);
			currentRow[7] = Boxes[5].getCellValue(1);
			currentRow[8] = Boxes[5].getCellValue(2);
		}else if(rowIndex == 4){
			currentRow[0] = Boxes[3].getCellValue(3);
			currentRow[1] = Boxes[3].getCellValue(4);
			currentRow[2] = Boxes[3].getCellValue(5);
			currentRow[3] = Boxes[4].getCellValue(3);
			currentRow[4] = Boxes[4].getCellValue(4);
			currentRow[5] = Boxes[4].getCellValue(5);
			currentRow[6] = Boxes[5].getCellValue(3);
			currentRow[7] = Boxes[5].getCellValue(4);
			currentRow[8] = Boxes[5].getCellValue(5);
		}else if(rowIndex == 5){
			currentRow[0] = Boxes[3].getCellValue(6);
			currentRow[1] = Boxes[3].getCellValue(7);
			currentRow[2] = Boxes[3].getCellValue(8);
			currentRow[3] = Boxes[4].getCellValue(6);
			currentRow[4] = Boxes[4].getCellValue(7);
			currentRow[5] = Boxes[4].getCellValue(8);
			currentRow[6] = Boxes[5].getCellValue(6);
			currentRow[7] = Boxes[5].getCellValue(7);
			currentRow[8] = Boxes[5].getCellValue(8);
		}else if(rowIndex == 6){
			currentRow[0] = Boxes[6].getCellValue(0);
			currentRow[1] = Boxes[6].getCellValue(1);
			currentRow[2] = Boxes[6].getCellValue(2);
			currentRow[3] = Boxes[7].getCellValue(0);
			currentRow[4] = Boxes[7].getCellValue(1);
			currentRow[5] = Boxes[7].getCellValue(2);
			currentRow[6] = Boxes[8].getCellValue(0);
			currentRow[7] = Boxes[8].getCellValue(1);
			currentRow[8] = Boxes[8].getCellValue(2);
		}else if(rowIndex == 7){
			currentRow[0] = Boxes[6].getCellValue(3);
			currentRow[1] = Boxes[6].getCellValue(4);
			currentRow[2] = Boxes[6].getCellValue(5);
			currentRow[3] = Boxes[7].getCellValue(3);
			currentRow[4] = Boxes[7].getCellValue(4);
			currentRow[5] = Boxes[7].getCellValue(5);
			currentRow[6] = Boxes[8].getCellValue(3);
			currentRow[7] = Boxes[8].getCellValue(4);
			currentRow[8] = Boxes[8].getCellValue(5);
		}else{
			currentRow[0] = Boxes[6].getCellValue(6);
			currentRow[1] = Boxes[6].getCellValue(7);
			currentRow[2] = Boxes[6].getCellValue(8);
			currentRow[3] = Boxes[7].getCellValue(6);
			currentRow[4] = Boxes[7].getCellValue(7);
			currentRow[5] = Boxes[7].getCellValue(8);
			currentRow[6] = Boxes[8].getCellValue(6);
			currentRow[7] = Boxes[8].getCellValue(7);
			currentRow[8] = Boxes[8].getCellValue(8);
		}

		return allTheSame(currentRow);
	}

	public boolean allTheSame(int[] givenRow){
		for(int firstIndex = 0; firstIndex < givenRow.length; firstIndex++){
			for(int secondIndex = 0; secondIndex < givenRow.length; secondIndex++){
				if(firstIndex == secondIndex){
					break;
				}else if(givenRow[firstIndex] == givenRow[secondIndex]){
					return false;
				}
			}
		}
		return true;
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
