package at.htl;

public class Teacher extends Person{
    private int salery;
    private String title;
    private String vorname;
    private String nachname;
    private String rolle;


    public Teacher(String vorname, String nachname,String rolle,int salery) {
        this.salery = salery;
        this.nachname=vorname;
        this.vorname=nachname;
        this.rolle=rolle;
    }


    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    String greeting(){
        return "Hallo "+ getTitle();

    }
}
