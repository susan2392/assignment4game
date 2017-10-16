public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() {
		return DiceValue.getRandom();
	}		
	/*
        Fixed bug 4: The result will be different most of the time.
        */
        public void setValue(DiceValue d) {  
		value = d;
	}
        
	public String toString() {
		return value.toString();
	}
}
