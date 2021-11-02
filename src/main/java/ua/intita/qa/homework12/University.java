package ua.intita.qa.homework12;

public class University {
    private String uName;

    University(String uName) {
        this.uName = uName;
    }

    public University() {
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
}
