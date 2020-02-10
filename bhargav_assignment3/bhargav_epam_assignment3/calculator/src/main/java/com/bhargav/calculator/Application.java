package com.bhargav.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

import com.bhargav.calculator.expression.Calculator;
import com.bhargav.calculator.expression.Expression;
import com.bhargav.calculator.string_parser.Parser;

public class Application {
	private void startApp() {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				String str=reader.readLine();
				Expression exp=Parser.parse(str);
				if(exp==null) {
					throw new InvalidParameterException("Invalid Expression");
				}
				System.out.println("Entered Expression  : "+exp);
				System.out.println("Answer              : "+Calculator.calculateExp(exp));
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	public void start() {
		startApp();
	}
}
