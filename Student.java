package javapro;


public class Student {
	private String id;
    private String firstName;
    private String lastName;
    private int contact;
    private double gpa;
    private String major;
    private String date;
    
    public Student() {
    	
    }
    
    public Student(String id, String firstName, String lastName, String major,int contact, double gpa, String dob)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
        this.major= major;
        this.gpa = gpa;
        this.date=dob;
    }
    
    public String getSid()
    {
        return id;
    }
    public void setSid(String id)
    {
        this.id = id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getMajor()
    {
        return major;
    }
    public String getDate() 
    {
    	return date;
    }
    public void setMajor(String major)
    {
        this.major = major;
    }
    
    public int getContact()
    {
        return contact;
    }
    public void setContact(int contact)
    {
        this.contact = contact;
    }
    
    public double getGPA()
    {
        return gpa;
    }
    public void setGPA(double gpa)
    {
        if (gpa >= 0)
        {
        this.gpa = gpa;
        }
        else
        {
            this.gpa = 0;
        }
    }
    public void setDate(String dob) 
    {
    	date=dob;
    }
    
    public String getData()
    {
        String result = "\n==============================================\n";
        result += "Student ID: ========> " + this.id + "\n";
        result += "First Name: =========> " + this.firstName + "\n";
        result += "Last Name: ==========> " + this.lastName + "\n";
        result += "Major:===============> " + this.major + "\n";
        result += "Contact Number: ==========> " + this.contact + "\n";
        result += "GPA: =============> " + this.gpa + "\n";
        result += "Date of Birth: =============> " + this.date + "\n";
        result += "==============================================\n";
        return result;
    
    }
    
}

