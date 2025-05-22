package may17;

public class SalaryMain {
    public static void main(String[] args) {

        Salary salary = new Salary(80000.800);
        salary.bonusIncome = 7500;
        salary.incentives = 5000;

        salary.showIncome();

    }
}
