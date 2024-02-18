package by.academy.homework7Test;

import org.junit.runner.Description;
import org.junit.runner.JUnitCore;

import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {
    @Override
    public void testFinished(Description description) {
        System.out.println("Finished : " + description.getMethodName());
    }

    public static void main(String[] args) {
        JUnitCore core = new JUnitCore();
        core.addListener(new CalculatorTestListener());

        core.run(TestAddition.class);
        core.run(TestMultiplication.class);
        core.run(TestSubtraction.class);

        core.run(TestParametrizeAddition.class);
        core.run(TestParametrizeSubtraction.class);
        core.run(TestParametrizeMultiplication.class);

        core.run(TestSuite.class);


    }
}