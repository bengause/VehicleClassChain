package mortgage.estimator.view;

import java.util.InputMismatchException;

import mortgage.estimator.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainViewController {

	
	
	@FXML
	private TextField grossIncome;
	
	@FXML
	private TextField monthlyDebt;
	
	@FXML
	private TextField interestRate;
	
	@FXML
	private ComboBox<Double> term;
	
	@FXML
	private TextField downPayment;
	
	@FXML
	private Label housingOnly;
	
	@FXML
	private Label housingPlus;
	
	@FXML
	private Label maxPayment;
	
	@FXML
	private Label maxMortgage;
	
	@FXML
	private Button okay;
	
	@FXML
	private Button clear;
	
	public void initialize(){
		term.getItems().removeAll(term.getItems());
		term.getItems().addAll(10.0, 15.0, 30.0);
	}

	
	
	private MainApp mainApp;
	
	public MainViewController() {
		
	}
	@FXML
	private void handleClear(){
		grossIncome.setText(null);
		monthlyDebt.setText(null);
		interestRate.setText(null);
		term.setValue(null);
		downPayment.setText(null);
		housingOnly.setText("$");
		housingPlus.setText("$");
		maxPayment.setText("$");
		maxMortgage.setText("$");
	}
	
	@FXML
	private void handleOK(){
		try{
			double housingOnlyValue = CalculateHousingOnly((double)
					Double.parseDouble(grossIncome.getText()));
			
			double housingPlusValue = CalculateHousingPlus((double)
					Double.parseDouble(grossIncome.getText()), (double)
					Double.parseDouble(monthlyDebt.getText()));
			
			housingOnly.setText("$" + String.format("%.2f", housingOnlyValue));
			
			housingPlus.setText("$" + String.format("%.2f", CalculateHousingPlus((double)
					Double.parseDouble(grossIncome.getText()), (double)
					Double.parseDouble(monthlyDebt.getText()))));
			
			if (housingOnlyValue <= housingPlusValue){
				maxPayment.setText("$" + String.format("%.2f", housingOnlyValue));
			}else{
				maxPayment.setText("$" + String.format("%.2f", housingPlusValue));
			}
			
			maxMortgage.setText("$" + String.format("%.2f", CalculatePresentValue((double)
					Double.parseDouble(grossIncome.getText()), (double)
					Double.parseDouble(monthlyDebt.getText()), (double)
					Double.parseDouble(interestRate.getText()) * 0.01, (double)
					term.getValue(), (double)Double.parseDouble(downPayment.getText()))));
			
			
		}catch(InputMismatchException e){
			e.printStackTrace();
			handleClear();
		}
		
	}
	
	
	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
		
	}
	
	//To get Total financeable mortgage
		public double CalculatePresentValue(double grossIncome, double monthlyDebt, 
				double mortgageInterestRate, double term, double downPayment){
			
			
			if ((grossIncome / 12)* 0.18 <= (((grossIncome/12) * 0.36) - monthlyDebt)){
				
				double monthlyPayment = (grossIncome / 12)* 0.18;
				
				return (monthlyPayment * (1- Math.pow((1 + mortgageInterestRate/12), 
						(term * -12)))) / (mortgageInterestRate / 12) + downPayment;
				
			}else{
				double monthlyPayment = ((grossIncome/12) * 0.36) - monthlyDebt;
				
				return (monthlyPayment * (1- Math.pow((1 + mortgageInterestRate/12), 
						(term * -12)))) / (mortgageInterestRate / 12) + downPayment;
			}
			
		}
		
		//To get housing payment only
		public double CalculateHousingOnly(double grossIncome){
			
			return (grossIncome / 12)* 0.18;

		}
		
		//To get housing + other debt
		public double CalculateHousingPlus(double grossIncome, double monthlyDebt){
			
			return ((grossIncome/12) * 0.36) - monthlyDebt;
		}
	
}
