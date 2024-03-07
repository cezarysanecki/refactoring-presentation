package pl.cezarysanecki.refactoringpresentation._3_anemicmodel;

/**
 * Problems:
 *  - duplicated logic (anemic model)
 * <p>
 * Solution - extract method and move them to proper class
 */
class BatteryService {

    void checkBattery(Battery battery) {
        if (battery.getPowerLevel() < 0.06) {
            sendToCharge(battery);
        }
        // other logic
    }

    boolean canLendBattery(Battery battery) {
        return !(battery.getPowerLevel() < 0.06);
    }

    private void sendToCharge(Battery battery) {
        // logic
    }

}
