package pl.cezarysanecki.refactoringpresentation._2_bigobject;

import java.time.Year;

/**
 * Problems:
 *  - hard to test
 * <p>
 * Solution - extract method which is needed to test
 */
class VehicleValidator {

    void validate(Policy policy) {
        boolean isAnyTooOldVehicle = policy.getVehicles()
                .stream()
                .map(Vehicle::getProductionYear)
                .allMatch(productionYear -> productionYear.isBefore(Year.of(2000)));
        if (isAnyTooOldVehicle) {
            throw new IllegalStateException("we do not handle vehicles older than made in 2000");
        }
        // ... other validators
    }

}
