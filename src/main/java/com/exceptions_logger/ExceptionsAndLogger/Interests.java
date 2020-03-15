package com.exceptions_logger.ExceptionsAndLogger;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Interests {
	private static Scanner sc;
	private static final Logger logger = LogManager.getLogger(Interests.class);
	private static double simple,compound;
	private static double principle,time,rate;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		System.out.println("Enter principle amount\n");
		principle = sc.nextDouble();
		System.out.println("Enter time \n");
		time = sc.nextDouble();
		System.out.println("Enter rate of interrest \n");
		rate = sc.nextDouble();

		SimpleInterest simpleinterest = new SimpleInterest();
		simple = simpleinterest.calculate(principle,time,rate);

		CompoundInterest compoundinterest = new CompoundInterest();
		compound = compoundinterest.calculate(principle,time,rate);

		logger.info("simple interest is "+simple);
		logger.info("compound interest is "+compound);
		sc.close();
	}

}
