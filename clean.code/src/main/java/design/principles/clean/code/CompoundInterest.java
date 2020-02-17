package design.principles.clean.code;

public class CompoundInterest {
	 Double calculate(long principalAmount,Double rateOfInterest,float timePeriodInYears,int noOfTimes)
	    {
	        Double amount = (principalAmount*Math.pow((1+(Double)rateOfInterest/noOfTimes),noOfTimes*timePeriodInYears));
			return amount;
	    }
}
