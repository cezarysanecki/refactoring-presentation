package pl.cezarysanecki.refactoringpresentation._5_splitentities;

import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
class VehicleRepository {

    private final Policy policy;

    Set<Vehicle> findAllByPolicyId(Long policyId) {
        return policy.getVehicles();
    }

}
