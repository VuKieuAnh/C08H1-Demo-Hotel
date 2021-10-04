package model;

public class User {
    private String fullName;
    private String dOB;
    private String code;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", dOB='" + dOB + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public User(String fullName, String dOB, String code) {
        this.fullName = fullName;
        this.dOB = dOB;
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
