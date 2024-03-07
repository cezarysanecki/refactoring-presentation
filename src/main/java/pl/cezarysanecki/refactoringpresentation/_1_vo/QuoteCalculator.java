package pl.cezarysanecki.refactoringpresentation._1_vo;

import lombok.RequiredArgsConstructor;

/**
 * Problems:
 *  - duplicated validation
 *  - potential mismatch of parameters (primitive obsession)
 * <p>
 * Solution - introduce value objects
 */
@RequiredArgsConstructor
class QuoteCalculator {

    private final ExternalServiceQuoteCalculator externalServiceQuoteCalculator;

    double calculateQuoteFor(String vinNumber, String registrationNumber) {
        if (vinNumber == null) {
            throw new IllegalArgumentException("vin number cannot be null");
        }
        if (vinNumber.trim().length() != 17) {
            throw new IllegalArgumentException("vin number should contains 17 letters");
        }
        return externalServiceQuoteCalculator.calculate(vinNumber, registrationNumber);
    }

    private class ExternalServiceQuoteCalculator {

        double calculate(String vinNumber, String registrationNumber) {
            // call external API
            return 0.0;
        }

    }
}
