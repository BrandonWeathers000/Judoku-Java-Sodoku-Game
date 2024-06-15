class box{
	int[] cells = new int[9];

	// Creating a default box
	public box(){
		for(int cellIndex = 0; cellIndex <= 8; cellIndex++){
			cells[cellIndex] = 0;
		}
	}

	//Creating a box with custom inputs
	public box(int inputZero, int inputOne, int inputTwo, int inputThree, int inputFour, int inputFive, int inputSix, int inputSeven, int inputEight){
		for(int cellIndex = 0; cellIndex <= 8; cellIndex++){
			     if(cellIndex == 0) cells[0] = inputZero;
			else if(cellIndex == 1) cells[1] = inputOne;
			else if(cellIndex == 2) cells[2] = inputTwo;
			else if(cellIndex == 3) cells[3] = inputThree;
			else if(cellIndex == 4) cells[4] = inputFour;
			else if(cellIndex == 5) cells[5] = inputFive;
			else if(cellIndex == 6) cells[6] = inputSix;
			else if(cellIndex == 7) cells[7] = inputSeven;
			else if(cellIndex == 8) cells[8] = inputEight;
		}
	}

	public void changeCell(int cellYouWantToChange, int newNum){
		cells[cellYouWantToChange] = newNum;
	}

	// Returns false is the box contains multiple of the same value and true otherwize
	public boolean checkBox(){
		for(int firstCellIndex = 0; firstCellIndex <= 8; firstCellIndex++){
			for(int secondCellIndex = 0; secondCellIndex <= 8; secondCellIndex++){
				if(firstCellIndex == secondCellIndex){
					break;
				}else if(cells[firstCellIndex] == cells[secondCellIndex]){
					return false;
				}
			}
		}
		return true;
	}

	
	public void printBox(){
		System.out.println(" " + cells[0] + " | " + cells[1] + " | " + cells[2]);
		System.out.println("-----------"); //I am using 10 dashes
		System.out.println(" " + cells[3] + " | " + cells[4] + " | " + cells[5]);
		System.out.println("-----------");
		System.out.println(" " + cells[6] + " | " + cells[7] + " | " + cells[8]);
		System.out.println();
	}
}
