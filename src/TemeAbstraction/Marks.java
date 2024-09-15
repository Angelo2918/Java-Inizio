package TemeAbstraction;

abstract class Marks {
    abstract double getPercentage();
}

class a extends Marks {

    private int mark1, mark2, mark3;

    public a(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;

    }

    @Override
    double getPercentage() {

        int total = mark1 + mark2 + mark3;
        return (total / 300.0) * 100;
    }
}

class b extends Marks {
    private int mark1, mark2, mark3, mark4;

    public b(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    double getPercentage() {
        int total = mark1 + mark2 + mark3 + mark4;
        return (total / 400.0) * 100;
    }
}
