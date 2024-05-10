package springnewpart;

public class ElectricityBillCalculator {
    public static double calculateBill(int units) {
        double[] rates = {2, 3, 4, 5, 6, 7, 8};
        double bill = 0;
        int[] thresholds = {50, 100, 150, 200, 250, 300};

        int remainingUnits = units;
        for (int i = 0; i < thresholds.length; i++) {
            if (remainingUnits <= 0) break;
            int unitsInThisTier = Math.min(thresholds[i], remainingUnits);
            bill += unitsInThisTier * rates[i];
            remainingUnits -= unitsInThisTier;
        }

        if (remainingUnits > 0) {
            bill += remainingUnits * rates[rates.length - 1];
        }

        return bill;
    }



    public static void main(String[] args) {
        // Example usage
        int unitsConsumed = 110;
        double billAmount = calculateBill(unitsConsumed);
        System.out.println("Electricity bill for " + unitsConsumed + " units: $" + billAmount);
    }
}
