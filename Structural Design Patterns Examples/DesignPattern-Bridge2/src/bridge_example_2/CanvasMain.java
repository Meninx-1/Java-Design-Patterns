package bridge_example_2;

public class CanvasMain {
	
	public static void main(String[] args) {
		
		CheckboxButton checkboxButton = new CheckboxButton(new SmallButtonSize());
		checkboxButton.draw();
		
		RadioButton radioButton = new RadioButton(new MediumButtonSize());
		radioButton.draw();
		
		DropdownButton dropdownButton = new DropdownButton(new LargeButtonSize());
		dropdownButton.draw();
		
	}
}
