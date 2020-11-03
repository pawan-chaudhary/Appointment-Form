/**
 * Here, we declare a class which is sub class of parent class developer.
 * @author(Pawan Chaudhary)
 * @version(13-01-2019)
 */ 
public class SeniorDeveloper extends Developer
{
    // Followings are the attributes of this class.
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;
    /**
     * Here we declare constructor.
     * @param String thePlatform,String interviewerName,int workingHours,int salary,int contractPeriod
     */
    public SeniorDeveloper(String thePlatform,String interviewerName,int workingHours,int salary,int contractPeriod)
    {
        super(thePlatform,interviewerName,workingHours);//calling parameter from super class or parent class.
        //Initializing instance variables
        this.salary=salary;
        this.contractPeriod=contractPeriod;
        this.joiningDate="";
        this.staffRoomNumber="";
        this.advanceSalary=0.0;
        this.appointed=false;
        this.terminated=false;
    }
    /**
     * Here, we declare getter method for salary
     * @return salary
     */
    public int getSalary()
    {
        return salary;
    }
    /**
     * Here, we declare setter method for salary
     * @param int salary
     */
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    /**
     * Here, we declare getter method for joiningDate
     * @return joiningDate
     */
    public String getJoiningDate()
    {
        return joiningDate;
    }
    /**
     * Here, we declare getter method for staffRoomNumber
     * @return staffRoomNumber
     */
    public String getStaffRoomNumber(){
        return staffRoomNumber;
    }
    /**
     * Here, we declare getter method for contractPeriod
     * @return contractPeriod
     */
    public int getContractPeriod()
    {
        return contractPeriod;
    }
    /**
     * Here, we declare setter method for contractPeriod
     * @param int contractPeriod
     */
    public void setContractPeriod(int contractPeriod)
    {
        this.contractPeriod=contractPeriod;
    }
    /**
     * Here, we declare getter method for advanceSalary
     * @return advanceSalary
     */
    public double getAdvanceSalary()
    {
        return advanceSalary;
    }
    /**
     * Here, we declare getter method for appointed
     * @return appointed
     */
    public boolean getAppointed()
    {
        return appointed;
    }
    /**
     * Here, we declare getter method for terminated
     * @return terminated
     */
    public boolean getTerminated()
    {
        return terminated;
    }
    /**
     * Here, we declare method to hire senior developer.
     * @param String developerName,String joiningDate,double advanceSalary,String staffRoomNumber
     * It returns variables according to its condition as follow
     */
    public void hireSeniorDeveloper(String developerName,String joiningDate,double advanceSalary,String staffRoomNumber)
    {
        if (getAppointed()==true){
            System.out.println("A senior developer has already appointed for this platform.\nAppointed Developer: "+getDeveloperName());
            System.out.println("Staff Room: "+getStaffRoomNumber());
        }
        else if (getAppointed()==false){
            setDeveloperName(developerName);
            this.joiningDate=joiningDate;
            this.advanceSalary=advanceSalary;
            this.staffRoomNumber=staffRoomNumber;
            appointed=true;
            terminated=false;
        }
    }
    /*
     * This method is created to check condition of getter method of terminated.
     * Value of variables are changed according to condition as follow:
     */
    public void contractTermination()
    {
        if(getTerminated()==false){
            System.out.println("A developer's contract has been terminated, please hire another senior developer.");
            setDeveloperName("");
            joiningDate="";
            staffRoomNumber="";
            advanceSalary=0.0;
            appointed=false;
            terminated=true;
        }
        else if(getTerminated()==true){
            System.out.println("The session has already expired.");
        }
    }
    public void displayInfo(){
        System.out.println("Platform:"+thePlatform+"\nInterviewer Name:"+interviewerName+"\nWorking Hours:"+workingHours);
    }
    /*
     * This method displays the value of variables according to the condition as follow
     */
    public void display()
    {
        super.display();//callling from parent class.
        System.out.println("Salary: Rs "+getSalary());        
        if(getAppointed()==true){
        System.out.println("Joined Date: "+getJoiningDate()+"\nAdvanced Salary: "+getAdvanceSalary()+"\nTermination Period: "+getContractPeriod()+"\n||=================================================================||");
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    



