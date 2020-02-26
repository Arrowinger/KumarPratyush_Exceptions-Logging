package com.epam.simpleintrest_housecost;

import org.apache.logging.log4j.Logger;
public class Intrest {
	
	

	public void calculateIntrest(Logger Logger,double principle, double rate, double time) {

		
		double simpleIntrest = (principle*rate*time)/100.0;
		double compoundIntrest = principle*(Math.pow((1+rate/100), time));
		Logger.debug("Simple Intrest : ");
		Logger.info(simpleIntrest);
		Logger.debug("Compound Intrest : ");
		Logger.debug(compoundIntrest);
		
		
		
		
	}

}
