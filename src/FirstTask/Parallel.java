package FirstTask;

import FirstTask.Circuit;

public class Parallel extends Circuit {
    private Circuit a;
    private Circuit b;

    Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    public Circuit getA() {
        return a;
    }

    public void setA(Circuit a) {
        this.a = a;
    }

    public Circuit getB() {
        return b;
    }

    public void setB(Circuit b) {
        this.b = b;
    }

    @Override
    public double getResistance() {
        return a.getResistance() * b.getResistance() / (a.getResistance() + b.getResistance());
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}
