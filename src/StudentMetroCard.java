public class StudentMetroCard extends MetroCard
{
    // INSTANCE VARIABLES (if any)
    private int remainingSwipes;
    // CONSTRUCTOR(S)
    public StudentMetroCard() {
        remainingSwipes = 3;
    }
    // METHODS (if any), including overridden methods
    public void resetSwipes() {
        remainingSwipes = 3;
    }
    @Override
    public boolean swipe() {
        if (remainingSwipes >= 1) {
            remainingSwipes--;
            return true;
        }
        else {
            return false;
        }
    }





}