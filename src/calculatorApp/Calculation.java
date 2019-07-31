package calculatorApp;

/**
 * @author Melvin Campos Casares
 *
 */
public class Calculation {
	double number, result;
	int calculation;
	
	public void arithmetic_operations() {
		switch(calculation) {
		case 1: //Addition
			result = number + Double.parseDouble(MainGui.textField.getText());
			MainGui.textField.setText(Double.toString(result));
			break;
		case 2: //Substraction
			result = number - Double.parseDouble(MainGui.textField.getText());
			MainGui.textField.setText(Double.toString(result));
			break;
		case 3: //Multiplication
			result = number * Double.parseDouble(MainGui.textField.getText());
			MainGui.textField.setText(Double.toString(result));
			break;
		case 4: //Division
			result = number / Double.parseDouble(MainGui.textField.getText());
			MainGui.textField.setText(Double.toString(result));
			break;
		}
	}
}
