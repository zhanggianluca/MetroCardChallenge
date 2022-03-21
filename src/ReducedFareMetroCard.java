public class ReducedFareMetroCard extends MetroCard
{
    // INSTANCE VARIABLES (if any)
    public double balance;
    public double fareCost;
    // CONSTRUCTOR(S)
    public ReducedFareMetroCard() {
        super();
        setFareCost(1.35);
    }

    public ReducedFareMetroCard(double initialBalance) {
        super(initialBalance);
        setFareCost(1.35);
    }

    // METHODS (if any), including overridden methods
}
