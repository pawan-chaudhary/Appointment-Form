/**
 * Here, we declare a class and this is parent class as well.
 * @author(Pawan Chaudhary)
 * @version(13-01-2019)
 */
public class Developer
{
    // Followings are the attributes of this class.
    protected String thePlatform;
    protected String interviewerName;
    protected String developerName;
    protected int workingHours;
    /**
     * Here, we declare a constructor.
     * @param String thePlatform,String interviewerName,int workingHours
     */
    public Developer(String thePlatform,String interviewerName,int workingHours)
    {
        // Initializing instance variables
        this.thePlatform=thePlatform;
        this.interviewerName=interviewerName;
        this.workingHours=workingHours;
        this.developerName="";
    }
    /**
     * Here, we declare getter method for thePlatform
     * @return thePlatform
     */
    public String getThePlatform() 
    {
        return thePlatform;
    }
    /**
     * Here, we declare getter method for interviewerName
     * @return interviewerName
     */
    public String getInterviewerName()
    {
        return interviewerName;
    }
    /**
     * Here, we declare getter method for workingHours
     * @return workingHours
     */
    public int getWorkingHours()
    {
        return workingHours;
    }
    /**
     * Here, we declare getter method for developerName
     * @return developerName
     */
    public String getDeveloperName()
    {
        return developerName;
    }
    /**
     * Here, we declare setter method for developerName
     * @param String developerName
     */
    public void setDeveloperName(String developerName)
    {
        this.developerName=developerName;
    }
    /* 
     * This method is set to display the value of variables which is declare 
       in above methods.
     */

    public void display()
    {
        System.out.println("Platform : "+getThePlatform());
        System.out.println("Interviewer Name : "+getInterviewerName());
        System.out.println("Working Hours : "+getWorkingHours());
        if(!developerName.equals("")){
            System.out.println("Appointed Developer: "+getDeveloperName()+"\n||=================================================================||");
        }
    }
}

