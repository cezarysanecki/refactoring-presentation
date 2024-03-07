package pl.cezarysanecki.refactoringpresentation._4_externalclass;

/**
 * Problems:
 *  - impossible to unit test
 * <p>
 * Solution - hide external class behind our interface
 */
class CalculatorService {

    String call(ExternalLibraryObject externalLibraryObject) {
        // a lot of logic
        return externalLibraryObject.returnSomeValue() + "-000";
    }

}
