package oop;

public class MotoBike extends Vehicle{

    private boolean hasCarrier;
    public MotoBike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start(){

    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
}
