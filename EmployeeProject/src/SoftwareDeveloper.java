public class SoftwareDeveloper extends Employee {

    private String language;

    public SoftwareDeveloper(String name, String surname, int id, String language) {
        super(name, surname, id);
        this.language = language;
    }

    public void formatting(String OS) {
        System.out.println(getname() + " " + OS + " loading the operating system...");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Language: " + language);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
