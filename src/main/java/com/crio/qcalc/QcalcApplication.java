package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//StandardCalculator calc=new StandardCalculator();
		//ScientificCalculator calc=new ScientificCalculator();
		
		LogicCalculator calc = new LogicCalculator();

		calc.AND(8, 6);

		calc.printResult();

//		calc.add(25,25);
		//SpringApplication.run(QcalcApplication.class, args);

//	calc.printResult();
	}

}
