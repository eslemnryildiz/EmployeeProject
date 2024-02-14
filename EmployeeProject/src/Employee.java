public class Employee {
    private String name;
    private String surname;
    private int id;

    public Employee(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public void showInformation() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Id: " + id);
    }


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getsurname() {
        return surname;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
