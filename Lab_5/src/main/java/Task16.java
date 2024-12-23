import java.time.LocalDate;
public class Task16 implements IEmployee {
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate dateOfBirth;
    private String gender;
    private String education;
    private String educationDocumentNumber;
    private String educationalInstitution;
    private LocalDate startDate;
    private String homeAddress;

    // Конструктор
    public Task16(String firstName, String lastName, String middleName, LocalDate dateOfBirth,
                    String gender, String education, String educationDocumentNumber,
                    String educationalInstitution, LocalDate startDate, String homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.education = education;
        this.educationDocumentNumber = educationDocumentNumber;
        this.educationalInstitution = educationalInstitution;
        this.startDate = startDate;
        this.homeAddress = homeAddress;
    }

    // Геттери та сеттери
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void setEducationDocumentNumber(String documentNumber) {
        this.educationDocumentNumber = documentNumber;
    }

    @Override
    public void setEducationalInstitution(String institution) {
        this.educationalInstitution = institution;
    }

    @Override
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getEducation() {
        return education;
    }

    @Override
    public String getEducationDocumentNumber() {
        return educationDocumentNumber;
    }

    @Override
    public String getEducationalInstitution() {
        return educationalInstitution;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public String getHomeAddress() {
        return homeAddress;
    }
}
interface IEmployee {
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setMiddleName(String middleName);
    void setDateOfBirth(LocalDate dateOfBirth);
    void setGender(String gender);
    void setEducation(String education);
    void setEducationDocumentNumber(String documentNumber);
    void setEducationalInstitution(String institution);
    void setStartDate(LocalDate startDate);
    void setHomeAddress(String homeAddress);

    String getFirstName();
    String getLastName();
    String getMiddleName();
    LocalDate getDateOfBirth();
    String getGender();
    String getEducation();
    String getEducationDocumentNumber();
    String getEducationalInstitution();
    LocalDate getStartDate();
    String getHomeAddress();
}