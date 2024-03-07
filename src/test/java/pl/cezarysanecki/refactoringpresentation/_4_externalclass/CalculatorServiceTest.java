package pl.cezarysanecki.refactoringpresentation._4_externalclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

//    @Test
    void return_proper_value_for_service_call() {
        String result = calculatorService.call(new ExternalLibraryObject());

        assertEquals("132-001", result);
    }

}
