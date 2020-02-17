package design.principles.clean.code;

public class SimpleInterest {
	 Double calculate(long principalAmount,Double rateOfInterest,int timePeriodInYears)
	    {
	        Double amount =  (principalAmount*(1+rateOfInterest*timePeriodInYears));
			return amount;
	    }
}
