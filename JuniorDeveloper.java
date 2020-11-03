/**
 * Here, we declare a class which is sub class of parent class developer.
 * @author Pawan Chaudhary
 * @version(13-01-2019)
 */ 
public class JuniorDeveloper extends Developer
{  
    // Following are the attributes of this class.
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    /**
     * Here we declare constructor.
     * @param String thePlatform,String interviewerName,int workingHours,int salary,String appointedBy,String terminationDate
     */
    public JuniorDeveloper(String thePlatform,String interviewerName,int workingHours,int salary,String appointedBy,String terminationDate)
    {
        super(thePlatform,interviewerName,workingHours);//calling parameter from parent class
        // Initializing instance variables
        this.salary=salary;
        this.appointedBy=appointedBy;
        this.terminationDate=terminationDate;
        this.appointedDate="";
        this.evaluationPeriod="";
        this.specialization="";
        this.joined=false;
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
        if (getJoined()==false){
            this.salary=salary;
        }
        else if(getJoined()==true){
            System.out.println("A junior developer has already appointed. It is not possible to change salary.");
        }
    }
    /**
     * Here, we declare getter method for appointedDate
     * @return appointedDate
     */
    public String getAppointedDate()
    {
        return appointedDate;
    }
    /**
     * Here, we declare getter method for evaluationPeriod
     * @return evaluationPeriod
     */
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
    /**
     * Here, we declare getter method for terminationDate
     * @return terminationDate
     */
    public String getTerminationDate()
    {
        return terminationDate;
    }
    /**
     * Here, we declare getter method for specialization
     * @return specialization
     */
    public String getSpecialization()
    {
        return specialization;
    }
    /**
     * Here, we declare getter method for appointedBy
     * @return appointedBy
     */
    public String getAppointedBy()
    {
        return appointedBy;
    }
    /**
     * Here, we declare getter method for joined
     * @return joined
     */
    public boolean getJoined()
    {
        return joined;
    }
    /**
     * Here, we declare method to hire junior developer.
     * @param String developerName,String appointedDate,String terminationDate,String specialization
     */
    public void hireJuniorDeveloper(String developerName,String appointedDate,String terminationDate,String specialization)
    {
        if (getJoined()==false){
            setDeveloperName(developerName);
            this.appointedDate=appointedDate;
            joined=true;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
        }
        else{
            System.out.println("The developer is already appointed on : "+getAppointedDate());     
        }
    }
    /* This method is set display the values of variables according to given conditions. 
     */
    public void display()
    {
        super.display();
        if(getJoined()==false){
            System.out.println("A junior developer is required to hire to work for this platform.");
        }
        else if(getJoined()==true){
            System.out.println("Junior Developer:"+getDeveloperName()+"\nAppointed Date: "+getAppointedDate()+"\nEvaluation Period: NA "+getEvaluationPeriod()+"\nTermination Date: "+getTerminationDate()+"\nSalary: "+getSalary()+"\nSpecialization: "+getSpecialization()+"\nAppointed by: "+getAppointedBy()+"\n||=================================================================||");
        }
        
    }   
}
    
    
        
    

