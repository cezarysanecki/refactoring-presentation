package pl.cezarysanecki.refactoringpresentation._5_splitentities;

import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
class VehicleRepository {

    private final PolicyRepository policyRepository;

    Set<Vehicle> findAllByPolicyId(Long policyId) {
        Policy policy = policyRepository.findById(policyId)
                .orElseThrow(() -> new IllegalArgumentException("cannot find policy by id: " + policyId));
        return policy.getVehicles();
    }

}
