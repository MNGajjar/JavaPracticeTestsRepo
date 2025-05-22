package may17;

public class Salary {

    double baseIncome;
    double bonusIncome;
    double incentives;

    public Salary(double baseIncome) {
        this.baseIncome = baseIncome;
    }

    public Salary(double baseIncome, double bonusIncome) {
        this.baseIncome = baseIncome;
        this.bonusIncome = bonusIncome;
    }

    public Salary(double baseIncome, double bonusIncome, double incentives) {
        this.baseIncome = baseIncome;
        this.bonusIncome = bonusIncome;
        this.incentives = incentives;
    }

    public void showIncome(){
        System.out.println("Base:"+baseIncome);
        System.out.println("Bonus:"+bonusIncome);
        System.out.println("Incentives:"+incentives);
    }
}
