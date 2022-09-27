package test2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class App {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Test2.class);
//		System.out.println(result.getFailureCount());
		for(Failure f:result.getFailures())
			System.out.println(f);
	}

}
