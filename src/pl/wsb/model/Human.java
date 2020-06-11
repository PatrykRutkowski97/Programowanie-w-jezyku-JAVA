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

    public Car getCar() {
        return car;
    }

    public void setCar() {
        if(salary > 50000) {
            System.out.println("Udało się kupić za gotówkę");
        } else if(salary > (50000/12)) {
            System.out.println("Udało się kupić na kredyt");
        } else {
            System.out.println("Nie stać cię mordo");
        }
    }
}
