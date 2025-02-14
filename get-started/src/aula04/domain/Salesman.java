package aula04.domain;

public non-sealed class Salesman extends Employee {

    private double percentPerSold;

    private double soldAmout;

    public Salesman(String code, String name, String adress, int age, double salary, double soldAmout) {
        super(code, name, adress, age, salary);
        this.percentPerSold = getPercentPerSold();
        this.soldAmout = soldAmout;
    }

    @Override
    public String getCode() {
        return "SL" + this.code;
    }

    @Override
    public double getFullSalary() {
        return this.salary + ((soldAmout * percentPerSold) / 100);
    }

    public Salesman() {
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmout() {
        return soldAmout;
    }

    public void setSoldAmout(double soldAmout) {
        this.soldAmout = soldAmout;
    }
}
