package pl.wsb.model;

public class Human {

    private Animal pet;
    private Car car;
    private Double salary;

    public Double getSalary() {
        System.out.println("Wypłata: " + this.salary);
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary < 0) {
            System.err.println("Nie można podać ujemnej wartośći");
        } else {
            System.out.println("Nowe dane zostały wysłane");
            System.out.println("Proszę odebrać aneks do umowy");
            salary = newSalary;
        }
    }
}
