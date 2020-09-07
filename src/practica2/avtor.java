package practica2;

public class avtor {
    private String name;
    private String email;
    private char gender;

    public avtor(String name, String email, char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public char getGender()
    {
        return gender;
    }

    public String toString() {
        return "Avtor's name is "+this.name+". Email: "+this.email+". Gender: "+this.gender;
    }
}
