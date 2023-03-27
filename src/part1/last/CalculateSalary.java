package part1.last;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary test = new CalculateSalary();
        test.calculateSalaries();
    }
    public long getSalaryIncrease(Employee employee) {
        if (employee.getType() == 1) {
            return (long) (employee.getSalary() / 2);
        } else if (employee.getType() == 2) {
            return (long) (employee.getSalary() * 1.1);
        } else if (employee.getType() == 3) {
            return (long) (employee.getSalary() * 1.2);
        } else if (employee.getType() == 4) {
            return (long) (employee.getSalary() * 1.3);
        } else if (employee.getType() == 5) {
            return (long) (employee.getSalary() * 2);
        }
        return 1;
    }
    public void calculateSalaries() {
        String[] name = {"LeeDaeRi", "KimManager", "WhangDesign", "ParkArchi", "LeeDevelop"};
        int[] type = {1, 2, 3, 4, 5};
        long[] salary = {1000000000, 100000000, 70000000, 80000000, 60000000};
        for (int i = 0; i < 5; i++) {
            Employee c = new Employee(name[i], type[i], salary[i]);
            long salaryIncrease = getSalaryIncrease(c);
            c.setSalary(salaryIncrease);
            System.out.println(name[i] + " = " + c.getSalary());
        }
    }
}