package pl.cezarysanecki.refactoringpresentation._5_splitentities;

import lombok.RequiredArgsConstructor;

import java.time.Year;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Problems:
 *  - very hard to test
 *  - wrong model
 * <p>
 * Solution - split entities
 */
@RequiredArgsConstructor
class VehicleService {

    private final PolicyRepository policyRepository;

    void sendAllVehicles(Long policyId) {
        Policy policy = policyRepository.findById(policyId)
                .orElseThrow(() -> new IllegalArgumentException("cannot find policy by id: " + policyId));
        Set<Year> vehiclesProductionYears = policy.getVehicles()
                .stream()
                .map(Vehicle::getProductionYear)
                .collect(Collectors.toUnmodifiableSet());

        if (vehiclesProductionYears.stream().anyMatch(productionYear -> productionYear.isBefore(Year.of(2000)))) {
            throw new IllegalStateException("we do not handle vehicles older than made in 2000");
        }
        // other validations

    }

}
