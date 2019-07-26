package calculatorApp;

import javax.swing.JTextField;

/**
 * @author Melvin Campos Casares
 *
 */
public class Calculation {
	JTextField textField = MainGui.textField;
	double number, result;
	int calculation;
	
	public void arithmetic_operations() {
		switch(calculation) {
		case 1: //Addition
			result = number + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			break;
		case 2: //Substraction
			result = number - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			break;
		case 3: //Multiplication
			result = number * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			break;
		case 4: //Division
			result = number / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			break;
		}
	}
}
