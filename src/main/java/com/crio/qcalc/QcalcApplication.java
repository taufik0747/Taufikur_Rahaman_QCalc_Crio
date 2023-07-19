package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		StandardCalculator calc=new StandardCalculator();
		calc.add(1, 2);
		//SpringApplication.run(QcalcApplication.class, args);
	System.out.println(calc.getResult());
	}

}
