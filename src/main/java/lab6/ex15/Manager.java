package lab6.ex15;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" + "name='" + this.getName() + '\'' +
                ", salary=" + this.getSalary() + ", " +
                "bonus=" + bonus +
                '}';
    }
}
