public class Manager extends Employee {
    private int numberOfResponsible;

    public Manager(String name, String surname, int id, int numberOfResponsible) {
        super(name, surname, id);
        this.numberOfResponsible = numberOfResponsible;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Number of people the manager is responsible for: " + numberOfResponsible);
    }

    public void raise(int raiseAmount) {
        System.out.println(getname() + " gave employees a $" + raiseAmount + " raise");
    }

    public int getNumberOfResponsible() {
        return numberOfResponsible;
    }

    public void setNumberOfResponsible(int numberOfResponsible) {
        this.numberOfResponsible = numberOfResponsible;
    }
}
