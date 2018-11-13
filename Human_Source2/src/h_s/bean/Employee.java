package h_s.bean;
// default package



/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String employeeName;
     private String password;
     private Integer age;
     private String email;
     private String apartment;
     private String education;
     private String phone;
     private String birthday;
     private String sex;
     private String major;


    // Constructors

    /** default constructor */
    public Employee() {
    }

    
    /** full constructor */
    public Employee(String employeeName, String password, Integer age, String email, String apartment, String education, String phone, String birthday, String sex, String major) {
        this.employeeName = employeeName;
        this.password = password;
        this.age = age;
        this.email = email;
        this.apartment = apartment;
        this.education = education;
        this.phone = phone;
        this.birthday = birthday;
        this.sex = sex;
        this.major = major;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getApartment() {
        return this.apartment;
    }
    
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getEducation() {
        return this.education;
    }
    
    public void setEducation(String education) {
        this.education = education;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return this.major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
   








}