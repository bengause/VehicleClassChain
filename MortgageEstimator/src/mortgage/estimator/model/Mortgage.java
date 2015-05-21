package mortgage.estimator.model;

public class Mortgage {

	private double grossIncome;
	private double monthlyDebt;
	private double interestRate;
	private double term;
	private double downPayment;
	private double housingOnly;
	private double housingPlus;
	private double maxPayment;
	private double maxMortgage;
	
	public Mortgage(){
		
	}
	
	public Mortgage(double grossIncome, double monthlyDebt, 
			double interestRate, double term, double downPayment){
		this.setGrossIncome(grossIncome);
		this.setMonthlyDebt(monthlyDebt);
		this.setInterestRate(interestRate);
		this.setTerm(term);
		this.setDownPayment(downPayment);
	}

	public double getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(double grossIncome) {
		this.grossIncome = grossIncome;
	}

	public double getMaxMortgage() {
		return maxMortgage;
	}

	public void setMaxMortgage(double maxMortgage) {
		this.maxMortgage = maxMortgage;
	}

	public double getMonthlyDebt() {
		return monthlyDebt;
	}

	public void setMonthlyDebt(double monthlyDebt) {
		this.monthlyDebt = monthlyDebt;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getTerm() {
		return term;
	}

	public void setTerm(double term) {
		this.term = term;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public double getHousingOnly() {
		return housingOnly;
	}

	public void setHousingOnly(double housingOnly) {
		this.housingOnly = housingOnly;
	}

	public double getHousingPlus() {
		return housingPlus;
	}

	public void setHousingPlus(double housingPlus) {
		this.housingPlus = housingPlus;
	}

	public double getMaxPayment() {
		return maxPayment;
	}

	public void setMaxPayment(double maxPayment) {
		this.maxPayment = maxPayment;
	}
	
	
	
	
}


