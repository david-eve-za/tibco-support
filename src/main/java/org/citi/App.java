package org.citi;

//import org.citi.model.crud.Operations;
import org.citi.model.util.JOOQGenerator;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		new JOOQGenerator();
		System.exit(0);
		//Operations.getOperations().recreateDataBase();
	}
}
