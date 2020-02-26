package com.epam.simpleintrest_housecost;
import org.apache.logging.log4j.Logger;
public class HouseCost {
	
	public void houseCost(Logger Logger,char choice,double area) {
		
		double price=0;
		switch(choice)
		{
		case '1':
			price = 1200*area;
			break;
		case '2':
			price = 1500*area;
			break;	
		case '3':
			price = 1800*area;
			break;
		case '4':
			price = 2500*area;
			break;
		default:
			Logger.error("Wrong Choice..!!");

		}
		Logger.debug("House Construction Cost based on your input is : ");
		Logger.debug(price);
		
		
	}

}
