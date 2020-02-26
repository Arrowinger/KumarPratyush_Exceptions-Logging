package com.epam.simpleintrest_housecost;


import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client 
{
	private static Logger Logger = LogManager.getLogger(test.class);
    public static void main( String[] args )
    {
        char choice=0;
        char choice1=0; //choices for the types of homes
        double principle,time,rate;
        double area;
        Scanner sc = new Scanner(System.in);
        
        do
		{
     	
        	Logger.info("\n\nMain Menu : \n1.Calculate Simple Intrest and Compund Intrest \n2.Calculate House Construction Cost\n3.Exit\n");
        	choice=sc.next().charAt(0);
			switch(choice)
			{
			case '1':
				Logger.warn("Enter the Principal: \n");
				principle = sc.nextDouble();
				Logger.warn("Enter the rate of intrest: \n");
				rate = sc.nextDouble();
				Logger.warn("Enter the Time Period:  \n");
				time = sc.nextDouble();
				Intrest in = new Intrest();
				in.calculateIntrest( Logger,principle,  rate,  time);
				break;
				
			case '2':
				Logger.info("\nChoose from 1 to 4 which type of materials you want : \n 1.Standard Materials \n 2.Above Standard Materials \n 3.High Standard Materials \n 4.High Standard Materials with fully automated home \n");
				choice1=sc.next().charAt(0);
				Logger.warn("Enter the total area of the house ");
				area = sc.nextDouble();
				HouseCost hc = new HouseCost();
				hc.houseCost(Logger,choice1,area);
				break;
			 case '3':
				 System.exit(0);
				 break;
			
			 default : 
				 Logger.error("Wrong Choice.....");
				
			}
			
			
		}
		
	  while(choice!=3);
		sc.close();
		
    }
}
