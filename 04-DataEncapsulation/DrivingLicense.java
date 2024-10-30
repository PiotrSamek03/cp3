public class DrivingLicense {
    // Private fields for the driving license details
    private String name;
    private String dateOfBirth;
    private String licenseNumber;
    private String issueDate;
    private String expirationDate;

    // Constructor to initialize driving license data
    public DrivingLicense(String name, String dateOfBirth, String licenseNumber, String issueDate, String expirationDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.licenseNumber = licenseNumber;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
    }

    // Public method to display the driving license details
    public void display() {
        System.out.println(getName());
        System.out.println(getDateOfBirth());
        System.out.println(getLicenseNumber());
        System.out.println(getIssueDate());
        System.out.println(getExpirationDate());
    }
    public String getName() {
        return name;
    }
    public void setname(String newname){
        this.name= newname;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirtch(String newDateOfBirth){
        this.name= newDateOfBirth;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String newLicenseNumber){
        this.name= newLicenseNumber;
    }
    public String getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(String newIssueDate){
        this.name= newIssueDate;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String newExpirationDate){
        this.name= newExpirationDate;
    }
}



