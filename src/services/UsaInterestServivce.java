package services;

public class UsaInterestServivce implements InterestService {
	
	private double interestRate;

	public UsaInterestServivce(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}