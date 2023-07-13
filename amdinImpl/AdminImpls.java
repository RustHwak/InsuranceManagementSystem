package amdinImpl;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import java.util.ArrayList;
import java.util.List;

import DAO.adminDAO;

import model.userInfo;


public class AdminImpls implements adminDAO {
    List<userInfo> addCategory = new ArrayList<>() ;
	Scanner in = new Scanner(System.in);

	@Override
	public void Categories() {
        while (true) {
            System.out.println("Choose \n1) Add Category " + "\n" + "2) View Category " + "\n" + "3) Update Category " + "\n" + "4) Delete Category " + "\n" + "5) Exit");
            System.out.println("Enter choice: ");
            int choose = in.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Add Category");
                    System.out.println("Enter User Id: ");
                    int uid = in.nextInt();
                    System.out.println("Enter User firstName:");
                    String fname = in.next();
                    System.out.println("Enter User LastName:");
                    String lname = in.next();
                    System.out.println("Enter User Email:");
                    String email = in.next();
                    System.out.println("Enter User Password");
                    String password = in.next();
                    System.out.println("Enter Your Insurance Policy");
                    String insurancePolicy = in.next();
                    userInfo user = new userInfo(uid, fname, lname, email, password, insurancePolicy);
                    addCategory.add(user);
                    System.out.println("User Added Successfully !");
                    break;
                case 2:
                if (addCategory.isEmpty()) {
                    System.out.println("No user information available.");
                } else {
                    System.out.println("User Infos: ");
                    for (userInfo i : addCategory) {
                        System.out.println("UserId: " + i.getUserId());
                        System.out.println("FirstName: " + i.getFirstName());
                        System.out.println("LastName: " + i.getLastName());
                        System.out.println("Email: " + i.getEmail());
                        System.out.println("Password: " + i.getPassWord());
                        System.out.println("Policy: " + i.getPolicy());
                    }
                }
                break;
                case 3:
                    System.out.print("Enter UserId to Update: ");
                    int id = in.nextInt();
                    boolean userFound = false;
                    for (userInfo i : addCategory) {
                        if (id == i.getUserId()) {
                            System.out.println("Enter new FirstName:");
                            String updatedFirstName = in.next();
                            System.out.println("Enter new LastName:");
                            String updatedLastName = in.next();
                            System.out.println("Enter new Email:");
                            String updatedEmail = in.next();
                            System.out.println("Enter new Password");
                            String updatedPassword = in.next();
                            System.out.println("Enter new Policy");
                            String updatedPolicy = in.next();
                            i.setFirstName(updatedFirstName);
                            i.setLastName(updatedLastName);
                            i.setEmail(updatedEmail);
                            i.setPassWord(updatedPassword);
                            i.setPolicy(updatedPolicy);
                            System.out.println("User information updated successfully!");
                            userFound = true;
                            break;
                        }
                    }
                    if (!userFound) {
                        System.out.println("User not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter UserID to Delete: ");
                    int Uid = in.nextInt();
                    boolean userDeleted = false;
                    for (userInfo i : addCategory) {
                        if (Uid == i.getUserId()) {
                            addCategory.remove(i);
                            userDeleted = true;
                            break;
                        }
                    }
                    if (userDeleted) {
                        System.out.println("User deleted successfully!");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please Try Again.");
            }
       
        }
        }
    
    @Override
	public void Subcategory() {
        List<userInfo>sub = new ArrayList<>();
       
        List<userInfo> addCategory = new ArrayList<>();
       while (true) {
            System.out.println("choose\n 1) addSubcategory \n2) view SubCategory \n3)Update \n4)Delete");

           
            System.out.println("Enter choice: ");
           int choose = in.nextInt();
           switch (choose) {
                case 1:
                    System.out.println("Add SubCategory");
                    System.out.println("Enter User Id: ");
                    int uid = in.nextInt();
                    System.out.println("Enter User Email:");
                    String email = in.next();
                   
                    System.out.println("Enter Your Insurance Policy");
                    String insurancePolicy = in.next();
                    userInfo user = new userInfo(uid,   email,  insurancePolicy);
                    sub.add(user);
                    System.out.println("User Added Successfully !");
                    break;
                case 2:
                if (sub.isEmpty()) {
                    System.out.println("No user information available.");
                } else {
                    System.out.println("User Infos: ");
                    for (userInfo i : sub) {
                        System.out.println("UserId: " + i.getUserId());
                        System.out.println("Email: " + i.getEmail());
                        System.out.println("Policy: " + i.getPolicy());
                    }
                }
                break;
                case 3:
                    System.out.print("Enter UserId to Update: ");
                    int id = in.nextInt();
                    boolean userFound = false;
                    for (userInfo i : addCategory) {
                        if (id == i.getUserId()) {
                            
                            System.out.println("Enter new Email:");
                            String updatedEmail = in.next();
                           
                            System.out.println("Enter new Policy");
                            String updatedPolicy = in.next();
                            
                            i.setEmail(updatedEmail);
                            i.setPolicy(updatedPolicy);
                            System.out.println("User information updated successfully!");
                            userFound = true;
                            break;
                        }
                    }
                    if (!userFound) {
                        System.out.println("User not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter UserID to Delete: ");
                    int Uid = in.nextInt();
                    boolean userDeleted = false;
                    for (userInfo i : sub) {
                        if (Uid == i.getUserId()) {
                            addCategory.remove(i);
                            userDeleted = true;
                            break;
                        }
                    }
                    if (userDeleted) {
                        System.out.println("User deleted successfully!");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please Try Again.");
            }
       
        }
        }
    @Override
    public void Policy() {
       int k = 1;
        while(k == 1){
        System.out.println("Enter 1) addPolicy 2)view policy 3)updatePolicy 4)remove Policy");
        int choice = in.nextInt();
       switch (choice) {
            case 1: 
            System.out.println("Add Category");
                    System.out.println("Enter User Id: ");
                    int uid = in.nextInt();
                    System.out.println("Enter User firstName:");
                    String fname = in.next();
                    System.out.println("Enter User LastName:");
                    String lname = in.next();
                    System.out.println("Enter User Email:");
                    String email = in.next();
                    System.out.println("Enter User Password");
                    String password = in.next();
                    System.out.println("Enter Your Insurance Policy");
                    String insurancePolicy = in.next();
                    userInfo user = new userInfo(uid, fname, lname, email, password, insurancePolicy);
                    addCategory.add(user);
                    System.out.println("User Added Successfully !");
                    break;
            case 2:
            
                System.out.println("Enter User Id to view Customer policy:");
                int id = in.nextInt();
                for (userInfo i : addCategory) {
                    if(id == i.getUserId()){
                        System.out.println("User Id: "+i.getUserId());
                        System.out.println("User Policy: "+i.getPolicy());
                    }}
                    break;
            case 3:
            System.out.println("Enter User Id to view update policy:");
            int id1 = in.nextInt();
            for (userInfo i : addCategory) {
                if(id1 == i.getUserId()){
                    System.out.println("Enter Policy: ");
                    String policy = in.next();
                    i.setPolicy(policy);
            }}
            break;

            case 4:
            System.out.println("Enter User Id to remove policy:");
            int userid = in.nextInt();
            for (userInfo i : addCategory) {
                if(userid == i.getUserId()){
                    addCategory.remove(i);}}break;
                }
            }
    }
    

    @Override
    public void control() {
        System.out.println("Choose 1)View 2)Activate 3)Cancel 4)exit");
        int choice = in.nextInt();
        switch (choice) {
            case 1: if (addCategory.isEmpty()) {
                    System.out.println("No user information available.");
                } else {
                    System.out.println("User Infos: ");
                    for (userInfo i : addCategory) {
                        System.out.println("UserId: " + i.getUserId());
                        System.out.println("FirstName: " + i.getFirstName());
                        System.out.println("LastName: " + i.getLastName());
                        System.out.println("Email: " + i.getEmail());
                        System.out.println("Password: " + i.getPassWord());
                        System.out.println("Policy: " + i.getPolicy());
                    }
                }
                break;
            case 2: 
            System.out.println("Condition 1: age above 18 2: Health check ");
            System.out.println("Enter User Id to Check if you can activate:");
            boolean Status = false;
            int id2 = in.nextInt();
            
           
           
            for (userInfo i : addCategory) {
                if(id2 == i.getUserId()){
                System.out.println("Hello "+ i.getFirstName() + " " + i.getLastName());
                System.out.println("how Old are you: ");
                int age = in.nextInt();

                if(age > 18){
                    System.out.println("Did you pass Health check up");
                    String answer =in.next();
                    if(answer.equalsIgnoreCase("yes")){
                        Status = true;
                        }} }
            
            if(Status){
                System.out.println("Congrats Your Insurance is Active! ");
                i.setStatus("Active");
            }
            else{
                System.out.println("Sorry Your Insurance Can't actived due to non Qualification");
                i.setStatus("NOT Active");
            }
            }break;
            case 3: System.out.println("Would you like to cancle the Insurance enter Y or y ");
            String answer =in.next();
            System.out.println("Enter UserID to Cancle");
            int id=in.nextInt();
            for(userInfo i:addCategory){
            if(id == i.getUserId() ){
                if(answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("Y")){
                
                
                    i.setStatus("Cancelld");}
                }
                }
                    break;
                
              
            case 4: System.exit(0);break;
            default: System.out.println("Invalid Input");

            }

        }


	
	
	


}
