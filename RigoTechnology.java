import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/**
 * This Class is GUI based class.
 * All the Components used in this class are of Java GUI i.e. awt and Swing. 
 * @author Pawan Chaudhary
 * @version 1.2
 */

public class RigoTechnology extends WindowAdapter implements ActionListener
{
    //Following are the Java GUI components used in this program.
    JFrame rigoTech_Frame;
    JPanel senDev_panel, jnrDev_panel, displayPanel;
    
    JLabel senDev_Heading, senDev_platform, senDev_interviewer, senDev_workingHrs, senDev_salary, senDev_contractPeriod, senDev_platformNm, senDev_name, senDev_joiningDate,
    senDev_advSalary, senDev_staffRoomNum,jnrDev_Heading, jnrDev_platform, jnrDev_interviewer, jnrDev_workingHrs, jnrDev_salary, jnrDev_appointBy, jnrDev_terminationDt,
    jnrDev_platformNm, jnrDev_name, jnrDev_appointDate, jnrDev_terminationDate, jnrDev_specialization ;
    
    JTextField senDevPlatform_txtFld, senDevInterviewer_txtFld, senDevWorkingHrs_txtFld, senDevSalary_txtFld, senDevContractPeriod_txtfld,senDevPlatformNm_txtfld,
    senDevName_txtfld, senDevJoiningDate_txtfld, senDevAdvSalary_txtfld, senDevStaffRoom_txtfld , jnrDevPlatform_txtFld, jnrDevInterviewer_txtfld, jnrDevWorkingHrs_txtfld,
    jnrDevSalary_txtfld, jnrDevAppointBy_txtfld, jnrDevTerminationDt_txtfld, JnrDevPlatformNm_txtfld, jnrDevName_txtfld, jnrDevAppointDate_txtfld, jnrDevTerminationDate_txtfld,
    jnrDevSpecializtion_txtfld;
    
    JButton senDev_addButton, senDev_appointButton, senDev_terminateButton, jnrDev_addButton,
    jnrDev_appointButton, displayButton, clearButton;
    
    ArrayList<Developer> list = new ArrayList<Developer>();
    /**
     * Below, We Define a main method.
     * This method creates static object of this class.
     */
   public static void main (String[]args)
    {
        //Calling gui method and created it as an object.
        new RigoTechnology().gui();
    }
    /**
     * This method consists the GUI layout of the program.
     */
   public void gui()
    {
       
       rigoTech_Frame=new JFrame("Rigo Technology");     
       Image icon= Toolkit.getDefaultToolkit().getImage("icon.png");
       Font fn=new Font("Arial", Font.BOLD,26);
       
       
       senDev_panel=new JPanel();
       senDev_panel.setSize(700,500);
       senDev_panel.setLocation(1,1);
       senDev_panel.setBorder(BorderFactory.createLineBorder(Color.black));//Panel Border
       senDev_panel.setBackground(new Color(0,0,0,50));
       
       senDev_Heading = new JLabel("Senior Developer");//heading sen
       senDev_Heading.setBounds(200,10,300,50);
       senDev_Heading.setFont(fn);
       senDev_panel.add(senDev_Heading);
       
       senDev_platform=new JLabel("Platform:");
       senDev_platform.setBounds(30, 90, 120, 30);
       senDev_panel.add(senDev_platform);
       
       senDevPlatform_txtFld=new JTextField();
       senDevPlatform_txtFld.setBounds(150, 90, 130, 30);
       senDev_panel.add(senDevPlatform_txtFld);
       
       senDev_interviewer=new JLabel("Interviewer Name:");
       senDev_interviewer.setBounds(370, 90, 150, 30);
       senDev_panel.add(senDev_interviewer);
       
       senDevInterviewer_txtFld=new JTextField();
       senDevInterviewer_txtFld.setBounds(490, 90, 170, 30);
       senDev_panel.add(senDevInterviewer_txtFld);
       
       senDev_workingHrs=new JLabel("Working Hours:");
       senDev_workingHrs.setBounds(30, 130, 120, 30);
       senDev_panel.add(senDev_workingHrs);
       
       senDevWorkingHrs_txtFld=new JTextField();
       senDevWorkingHrs_txtFld.setBounds(150, 130, 90, 30);
       senDev_panel.add(senDevWorkingHrs_txtFld);
       
       senDev_salary=new JLabel("Salary:");
       senDev_salary.setBounds(440, 130, 120, 30);
       senDev_panel.add(senDev_salary);
       
       senDevSalary_txtFld=new JTextField();
       senDevSalary_txtFld.setBounds(550, 130, 110,30);
       senDev_panel.add(senDevSalary_txtFld);
       
       senDev_contractPeriod=new JLabel("Contract Period:");
       senDev_contractPeriod.setBounds(30, 170, 150, 30);
       senDev_panel.add(senDev_contractPeriod);
       
       senDevContractPeriod_txtfld=new JTextField();
       senDevContractPeriod_txtfld.setBounds(150, 170, 120, 30);
       senDev_panel.add(senDevContractPeriod_txtfld);
       
       senDev_addButton=new JButton("Add");
       senDev_addButton.setBounds(470, 220, 160, 50);
       senDev_panel.add(senDev_addButton);
       
       senDev_platformNm=new JLabel("Platform Num#:");
       senDev_platformNm.setBounds(30, 280, 150, 30);
       senDev_panel.add(senDev_platformNm);
       
       senDevPlatformNm_txtfld=new JTextField();
       senDevPlatformNm_txtfld.setBounds(150, 280, 130, 30);
       senDev_panel.add(senDevPlatformNm_txtfld);
       
       senDev_name=new JLabel("Developer's Name:");
       senDev_name.setBounds(30, 320, 150, 30);
       senDev_panel.add(senDev_name);
       
       senDevName_txtfld=new JTextField();
       senDevName_txtfld.setBounds(150, 320, 160, 30);
       senDev_panel.add(senDevName_txtfld);
       
       senDev_joiningDate=new JLabel("Joining Date:");
       senDev_joiningDate.setBounds(430, 320, 100, 30);
       senDev_panel.add(senDev_joiningDate);
       
       senDevJoiningDate_txtfld=new JTextField();
       senDevJoiningDate_txtfld.setBounds(530, 320, 130, 30);
       senDev_panel.add(senDevJoiningDate_txtfld);
       
       senDev_advSalary=new JLabel("Advance Salary:");
       senDev_advSalary.setBounds(30, 360, 120, 30);
       senDev_panel.add(senDev_advSalary);
       
       senDevAdvSalary_txtfld=new JTextField();
       senDevAdvSalary_txtfld.setBounds(150, 360, 110, 30);
       senDev_panel.add(senDevAdvSalary_txtfld);
       
       senDev_staffRoomNum=new JLabel("Staff Room Num#:");
       senDev_staffRoomNum.setBounds(395, 360, 150, 30);
       senDev_panel.add(senDev_staffRoomNum);
       
       senDevStaffRoom_txtfld=new JTextField();
       senDevStaffRoom_txtfld.setBounds(590, 360, 70, 30);
       senDev_panel.add(senDevStaffRoom_txtfld);
       
       senDev_appointButton=new JButton("Appoint");
       senDev_appointButton.setBounds(200, 430, 180, 50);
       senDev_panel.add(senDev_appointButton);
       
       senDev_terminateButton=new JButton("Terminate");
       senDev_terminateButton.setBounds(410, 430, 180, 50);
       senDev_panel.add(senDev_terminateButton);
       
       jnrDev_panel=new JPanel();  
       jnrDev_panel.setSize(700,500);
       jnrDev_panel.setLocation(702,1);
       jnrDev_panel.setBorder(BorderFactory.createLineBorder(Color.black));//Panel Border
       jnrDev_panel.setBackground(new Color(0,0,0,50));
       
       jnrDev_Heading = new JLabel("Junior Developer");
       jnrDev_Heading.setBounds(200,10,300,50);
       jnrDev_Heading.setFont(fn);
       jnrDev_panel.add(jnrDev_Heading);
       
       jnrDev_platform=new JLabel("Platform:");
       jnrDev_platform.setBounds(30, 90, 120, 30);
       jnrDev_panel.add(jnrDev_platform);
       
       jnrDevPlatform_txtFld=new JTextField();
       jnrDevPlatform_txtFld.setBounds(150, 90, 130, 30);
       jnrDev_panel.add(jnrDevPlatform_txtFld);
       
       jnrDev_interviewer=new JLabel("Interviewer Name:");
       jnrDev_interviewer.setBounds(370, 90, 150, 30);
       jnrDev_panel.add(jnrDev_interviewer);
       
       jnrDevInterviewer_txtfld=new JTextField();
       jnrDevInterviewer_txtfld.setBounds(490, 90, 170, 30);
       jnrDev_panel.add(jnrDevInterviewer_txtfld);
       
       jnrDev_workingHrs=new JLabel("Working Hours:");
       jnrDev_workingHrs.setBounds(30, 130, 120, 30);
       jnrDev_panel.add(jnrDev_workingHrs);
       
       jnrDevWorkingHrs_txtfld=new JTextField();
       jnrDevWorkingHrs_txtfld.setBounds(150, 130, 90, 30);
       jnrDev_panel.add(jnrDevWorkingHrs_txtfld);
       
       jnrDev_salary=new JLabel("Salary:");
       jnrDev_salary.setBounds(440, 130, 120, 30);
       jnrDev_salary.setToolTipText("Use Number Only!!");  
       jnrDev_panel.add(jnrDev_salary);
       
       jnrDevSalary_txtfld=new JTextField();
       jnrDevSalary_txtfld.setBounds(550, 130, 110,30);
       jnrDev_panel.add(jnrDevSalary_txtfld);
       
       jnrDev_appointBy=new JLabel("Appointed By:");
       jnrDev_appointBy.setBounds(30, 170, 130, 30);
       jnrDev_panel.add(jnrDev_appointBy);
       
       jnrDevAppointBy_txtfld=new JTextField();
       jnrDevAppointBy_txtfld.setBounds(150, 170, 160, 30);
       jnrDev_panel.add(jnrDevAppointBy_txtfld);
       
       jnrDev_terminationDt=new JLabel("Termination Date:");
       jnrDev_terminationDt.setBounds(370, 170, 120, 30);
       jnrDev_panel.add(jnrDev_terminationDt);
       
       jnrDevTerminationDt_txtfld=new JTextField();
       jnrDevTerminationDt_txtfld.setBounds(530, 170, 130, 30);
       jnrDev_panel.add(jnrDevTerminationDt_txtfld);
       
       jnrDev_addButton=new JButton("Add");
       jnrDev_addButton.setBounds(470, 220, 160, 50);
       jnrDev_panel.add(jnrDev_addButton);
       
       jnrDev_platformNm=new JLabel("Platform Num#:");
       jnrDev_platformNm.setBounds(30, 280, 150, 30);
       jnrDev_panel.add(jnrDev_platformNm);
       
       JnrDevPlatformNm_txtfld=new JTextField();
       JnrDevPlatformNm_txtfld.setBounds(150, 280, 130, 30);
       jnrDev_panel.add(JnrDevPlatformNm_txtfld);
       
       jnrDev_name=new JLabel("Developer's Name:");
       jnrDev_name.setBounds(30, 320, 150, 30);
       jnrDev_panel.add(jnrDev_name);
       
       jnrDevName_txtfld=new JTextField();
       jnrDevName_txtfld.setBounds(150, 320, 160, 30);
       jnrDev_panel.add(jnrDevName_txtfld);
       
       jnrDev_appointDate=new JLabel("Appointed Date:");
       jnrDev_appointDate.setBounds(390, 320, 120, 30);
       jnrDev_panel.add(jnrDev_appointDate);
       
       jnrDevAppointDate_txtfld=new JTextField();
       jnrDevAppointDate_txtfld.setBounds(545, 320, 110, 30);
       jnrDev_panel.add(jnrDevAppointDate_txtfld);
       
       jnrDev_terminationDate=new JLabel("Termination Date:");
       jnrDev_terminationDate.setBounds(30, 360, 120, 30);
       jnrDev_panel.add(jnrDev_terminationDate);
       
       jnrDevTerminationDate_txtfld=new JTextField();
       jnrDevTerminationDate_txtfld.setBounds(150, 360, 110, 30);
       jnrDev_panel.add(jnrDevTerminationDate_txtfld);
       
       jnrDev_specialization=new JLabel("Specialization:");
       jnrDev_specialization.setBounds(400, 360, 130, 30);
       jnrDev_panel.add(jnrDev_specialization);
       
       jnrDevSpecializtion_txtfld=new JTextField();
       jnrDevSpecializtion_txtfld.setBounds(515, 360, 140, 30);
       jnrDev_panel.add(jnrDevSpecializtion_txtfld);
       
       jnrDev_appointButton=new JButton("Appoint");
       jnrDev_appointButton.setBounds(280, 430, 200, 50);
       jnrDev_panel.add(jnrDev_appointButton);
       
       displayPanel=new JPanel();
       displayPanel.setSize(500, 80);
       displayPanel.setLocation(450,501);
       displayPanel.setBorder(BorderFactory.createLineBorder(Color.black));
       displayPanel.setBackground(new Color(0,0,0,50));
       
       displayButton=new JButton("Display All");
       displayButton.setBounds(20, 10, 200, 60);
       displayPanel.add(displayButton);
       
       clearButton=new JButton("Clear");
       clearButton.setBounds(280, 10, 200, 60);
       displayPanel.add(clearButton);
       
       senDev_addButton.addActionListener(this);
       senDev_appointButton.addActionListener(this);
       senDev_terminateButton.addActionListener(this);
       jnrDev_addButton.addActionListener(this);
       jnrDev_appointButton.addActionListener(this);
       displayButton.addActionListener(this);
       clearButton.addActionListener(this);
       
       rigoTech_Frame.getRootPane().setBorder(BorderFactory.createLineBorder(Color.black));
       rigoTech_Frame.setIconImage(icon);
       rigoTech_Frame.setContentPane(new JLabel(new ImageIcon("bg.png")));
       rigoTech_Frame.addWindowListener(this);
       rigoTech_Frame.setSize(1400,610);
       rigoTech_Frame.setLayout(null);
       rigoTech_Frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       rigoTech_Frame.setVisible(true);
       rigoTech_Frame.setResizable(false);
       rigoTech_Frame.add(senDev_panel);
       rigoTech_Frame.add(jnrDev_panel);
       rigoTech_Frame.add(displayPanel);
    }
    /**
     * This method provide popup check box while click on close button on the top of frame.
     */
   public void windowClosing(WindowEvent e)
    {
         int a=JOptionPane.showConfirmDialog(rigoTech_Frame, "Do you want to close?");
         if(a==JOptionPane.YES_OPTION){
            rigoTech_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    } 
    /**
     * This method provide buttons to do their function.
     * This method consists different types of conditions and exception to each button.
     */
   public void actionPerformed(ActionEvent btn)
    {
        if (btn.getSource()==senDev_addButton){
           String senPlatform = senDevPlatform_txtFld.getText();
           String senInterviewer= senDevInterviewer_txtFld.getText();
           String senWorking= senDevWorkingHrs_txtFld.getText();
           String senSalary= senDevSalary_txtFld.getText();
           String senContract= senDevContractPeriod_txtfld.getText();
           if (senPlatform.isEmpty()||senInterviewer.isEmpty()||senWorking.isEmpty()||senSalary.isEmpty()||senContract.isEmpty()){
               JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Enter value in all the fields!!!","Alert",JOptionPane.WARNING_MESSAGE);
           }
            else{
                try{
                    int intsenWorking= Integer.parseInt(senWorking);
                    int intsenSalary= Integer.parseInt(senSalary);
                    int intsenContract= Integer.parseInt(senContract);
                    if (intsenWorking>5 && intsenWorking<=12){
                        if(intsenSalary>=20000 && intsenSalary<=100000){
                            if(intsenContract>=1 && intsenContract<=20){
                                SeniorDeveloper senDevInfo =new SeniorDeveloper(senPlatform, senInterviewer,
                                intsenWorking, intsenSalary, intsenContract);
                                list.add(senDevInfo);
                                clearButton.doClick();
                                JOptionPane.showMessageDialog(rigoTech_Frame,"Data has been successfully added to the system.");
                            }
                            else{
                                JOptionPane.showMessageDialog(rigoTech_Frame,"Maximum Contract For a Developer is 20 Years.","Alert",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(rigoTech_Frame,"Developer's Salary Start From 20,000-1,00,000 ","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else{
                       JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Keep Working Hours from 6-12 Hours","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Enter Numeric values in Working Hours, Salary and Contract Period!!!","Alert",JOptionPane.WARNING_MESSAGE);
                }
           }
        }
        if (btn.getSource()==senDev_appointButton){
           String senDeveloper= senDevName_txtfld.getText();
           String devJoiningDate= senDevJoiningDate_txtfld.getText();
           String devAdvanceSalary= senDevAdvSalary_txtfld.getText();
           String devRoom= senDevStaffRoom_txtfld.getText();
           String senDevPfNum=senDevPlatformNm_txtfld.getText();
           if(senDeveloper.isEmpty()||devJoiningDate.isEmpty()||devAdvanceSalary.isEmpty()||devRoom.isEmpty()||senDevPfNum.isEmpty()){
               JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Enter value in all the fields!!!","Alert",JOptionPane.WARNING_MESSAGE);
           }
           else{
               try{
                   double advanceSalary= Double.parseDouble(devAdvanceSalary);
                   int senDevPlatformNum=((Integer.parseInt(senDevPfNum))-1);  
                   if(senDevPlatformNum>=0 && senDevPlatformNum<list.size()){
                       if(list.get(senDevPlatformNum) instanceof SeniorDeveloper){
                           if(advanceSalary>=5000 && advanceSalary<=10000){
                               SeniorDeveloper senDev=(SeniorDeveloper)list.get(senDevPlatformNum);
                               senDev.hireSeniorDeveloper(senDeveloper, devJoiningDate, advanceSalary, devRoom);
                               clearButton.doClick();
                               JOptionPane.showMessageDialog(rigoTech_Frame,"Congratulation!!, A Senior developer has been appointed.");
                            }
                           else{
                               JOptionPane.showMessageDialog(rigoTech_Frame,"Advance Salary is Limit from 5,000 upto 10,000 only! ","Alert",JOptionPane.WARNING_MESSAGE);
                           }
                       }
                       else{
                        JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Use Senior Developer's Platform Number!!!","Alert",JOptionPane.WARNING_MESSAGE);
                       } 
                     }
                     else{
                    JOptionPane.showMessageDialog(rigoTech_Frame,"Enter valid Platform Number! i.e.Starting From 1\nor\nAdd Senior Developer First!","Alert",JOptionPane.WARNING_MESSAGE);
                   }
               }
               catch(Exception e){
                   JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Use Numeric value in Platform Number and Advance Salary!!!","Alert",JOptionPane.WARNING_MESSAGE);
                }
           }
        }
        if(btn.getSource()==senDev_terminateButton){
            try{
                String senDevPfNum=senDevPlatformNm_txtfld.getText();
                if(senDevPfNum.isEmpty()){
                    JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Enter value in Platform Number!!!","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    int senDevPlatformNum=((Integer.parseInt(senDevPfNum))-1);
                    if(list.get(senDevPlatformNum) instanceof SeniorDeveloper){
                        SeniorDeveloper senDev=(SeniorDeveloper)list.get(senDevPlatformNum);
                        if(senDev.getAppointed()==false){
                            JOptionPane.showMessageDialog(rigoTech_Frame,"Developer has not appointed yet!!!","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
                        else{
                            senDev.contractTermination();
                            clearButton.doClick();
                            JOptionPane.showMessageDialog(rigoTech_Frame,"Developer's Contract has been terminated.");
                        }
                        }
                   else{
                      JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Use Senior Developer's Platform Number!!!","Alert",JOptionPane.WARNING_MESSAGE);
                   }
                }
            }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Use Numeric value and Enter valid Platform Number!!!","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        if(btn.getSource()==jnrDev_addButton){
            String junPlatfrom= jnrDevPlatform_txtFld.getText();
            String junInterviewer= jnrDevInterviewer_txtfld.getText();
            String junWorking= jnrDevWorkingHrs_txtfld.getText();
            String junSalary= jnrDevSalary_txtfld.getText();
            String junAppoint= jnrDevAppointBy_txtfld.getText();
            String junTermination= jnrDevTerminationDt_txtfld.getText();
            if(junPlatfrom.isEmpty()||junInterviewer.isEmpty()||junWorking.isEmpty()||junSalary.isEmpty()||junAppoint.isEmpty()||junTermination.isEmpty()){
                JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Enter value in all the fields!!!","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                 try{
                    int intjunWorking= Integer.parseInt(junWorking);
                    int intjunSalary= Integer.parseInt(junSalary);
                    if (intjunWorking>5 && intjunWorking<=12){
                        if(intjunSalary>=20000 && intjunSalary<=100000){
                            JuniorDeveloper jnrDevInfo=new JuniorDeveloper(junPlatfrom, junInterviewer, intjunWorking, intjunSalary, junAppoint, junTermination);
                            list.add(jnrDevInfo);
                            clearButton.doClick();
                            JOptionPane.showMessageDialog(rigoTech_Frame,"Data has been successfully added to the system.");
                        }
                        else{
                            JOptionPane.showMessageDialog(rigoTech_Frame,"Developer's Salary Start From 20,000-1,00,000 ","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                  else{
                        JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Keep Working Hours from 6-12 Hours","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                }
                
               catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Use Numeric value in Working hours and Salary!!!","Alert",JOptionPane.WARNING_MESSAGE);
               }
            }
        }
        if(btn.getSource()==jnrDev_appointButton){
          String jnrDeveloper= jnrDevName_txtfld.getText();
          String jnrAppointDate= jnrDevAppointDate_txtfld.getText();
          String jnrTermination= jnrDevTerminationDate_txtfld.getText();
          String jnrSpecialization= jnrDevSpecializtion_txtfld.getText();
          String jnrDevPfNum=JnrDevPlatformNm_txtfld.getText();
          if(jnrDeveloper.isEmpty()||jnrAppointDate.isEmpty()||jnrTermination.isEmpty()||jnrSpecialization.isEmpty()||jnrDevPfNum.isEmpty()){
               JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Enter value in all the fields!!!","Alert",JOptionPane.WARNING_MESSAGE);
          }
          else{
               try{
                  int jnrDevPlatformNum=((Integer.parseInt(jnrDevPfNum))-1);
                  if(jnrDevPlatformNum>=0 && jnrDevPlatformNum<list.size()){
                      if(list.get(jnrDevPlatformNum) instanceof JuniorDeveloper){
                      JuniorDeveloper jnrDev=(JuniorDeveloper)list.get(jnrDevPlatformNum);
                      jnrDev.hireJuniorDeveloper(jnrDeveloper, jnrAppointDate, jnrTermination, jnrSpecialization);
                      clearButton.doClick();
                      JOptionPane.showMessageDialog(rigoTech_Frame,"Congratulation!!, A Junior developer has been appointed.");
                      }
                      else{
                          JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Use Junior Developer's Platform Number!!!","Alert",JOptionPane.WARNING_MESSAGE);
                      }
                  }
                  else{
                      JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Enter valid Platform Number! i.e.Starting From 1\nor\nAdd Junior Developer First!","Alert",JOptionPane.WARNING_MESSAGE);
                  }
               }
               catch(Exception e){
                   JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Use Numeric value!!!","Alert",JOptionPane.WARNING_MESSAGE);
               }
          }
        }
        if(btn.getSource()==displayButton){
            if(list.isEmpty()){
                JOptionPane.showMessageDialog(rigoTech_Frame,"Please, Enter Data First!!","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                for (Developer dev: list){
                    if(dev instanceof SeniorDeveloper){
                        SeniorDeveloper obj=(SeniorDeveloper)dev;
                        obj.display();
                    }
                    if(dev instanceof JuniorDeveloper){
                        JuniorDeveloper obj1=(JuniorDeveloper)dev;
                        obj1.display();
                    }
            }
            }
        }
        if (btn.getSource()==clearButton){
            senDevPlatform_txtFld.setText("");
            senDevInterviewer_txtFld.setText("");
            senDevWorkingHrs_txtFld.setText("");
            senDevSalary_txtFld.setText("");
            senDevContractPeriod_txtfld.setText("");
            senDevPlatformNm_txtfld.setText("");
            senDevName_txtfld.setText("");
            senDevJoiningDate_txtfld.setText("");
            senDevAdvSalary_txtfld.setText("");
            senDevStaffRoom_txtfld.setText("");
            jnrDevPlatform_txtFld.setText("");
            jnrDevInterviewer_txtfld.setText("");
            jnrDevWorkingHrs_txtfld.setText("");
            jnrDevSalary_txtfld.setText("");
            jnrDevAppointBy_txtfld.setText("");
            jnrDevTerminationDt_txtfld.setText("");
            JnrDevPlatformNm_txtfld.setText("");
            jnrDevName_txtfld.setText("");
            jnrDevAppointDate_txtfld.setText("");
            jnrDevTerminationDate_txtfld.setText("");
            jnrDevSpecializtion_txtfld.setText("");
         }
   }
}





