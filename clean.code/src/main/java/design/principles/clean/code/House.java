package design.principles.clean.code;



public class House {
	
Double estimatingPriceForBelowHighStandard(String material,Double areaInSquareFeet)
{Double amount = 0.0;
	if(material.compareTo("Standard")==0)
	{
		amount = 1200*areaInSquareFeet;
		
	}
	else if(material.compareTo("above Standard")==0)
	{
		amount = 1500*areaInSquareFeet;
		
	}
	return amount;
}
Double estimatingPriceForHighStandard(String material,Double areaInSquareFeet,Boolean option)
{Double amount = 0.0;
	if(option)
	{
		amount = 2500*areaInSquareFeet;
		
	}
	else 
	{
		amount = 1800*areaInSquareFeet;
		
	}
	return amount;
}
}
