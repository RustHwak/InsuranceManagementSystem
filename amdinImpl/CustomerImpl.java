package amdinImpl;
import model.userInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.CustomerDAO;

public class CustomerImpl implements CustomerDAO {
    Scanner in = new Scanner(System.in);

    @Override
    public void viewCatagory(userInfo addCategory) {
        List<userInfo> cus = new ArrayList<>();
        cus.add(addCategory);
        for (userInfo i: cus){
            int id = i.getUserId();
            String fname  = i.getFirstName();
            String lname = i.getLastName();
            String email = i.getEmail();
            String passWord = i.getPassWord();
            String Policy = i.getPolicy();
            
}       for(userInfo m: cus){
        System.out.println("First Name: " + m.getFirstName());
        System.out.println("LastName: " + m.getLastName());
        System.out.println("Email: " + m.getEmail());
        System.out.println("PassWord: " + m.getPassWord());
        System.out.println("Policy: " + m.getPolicy());}
}



    

    @Override
    public void viewSubCatagory(userInfo subCategory) {
        
         List<userInfo> cus = new ArrayList<>();
         
        cus.add(subCategory);
        for (userInfo i: cus){

            
            int Uid = i.getUserId();
            String email = i.getEmail();
            
            String Policy = i.getPolicy();}
        System.out.println("Enter UserID to view ");
        int id = in.nextInt();
        
       for(userInfo m: cus){
        if(id == m.getUserId()){
        System.out.println("First Name: " + m.getFirstName());
        System.out.println("LastName: " + m.getLastName());
        System.out.println("Email: " + m.getEmail());
        System.out.println("PassWord: " + m.getPassWord());
        System.out.println("Policy: " + m.getPolicy());}
       else System.out.println("ID not found");
    }
    }
    @Override
    public void applyPolicy(userInfo addCategory) {
        List<userInfo>cusinfo = new ArrayList<>();
        cusinfo.add(addCategory);
        System.out.println("Enter User Id to view update policy:");
            int id1 = in.nextInt();
            for (userInfo i : cusinfo) {
                if(id1 == i.getUserId()){
                    System.out.println("Enter Policy: ");
                    String policy = in.next();
                    i.setPolicy(policy);
            }}
        
    }

    @Override
    public void viewPolicyHeHolds(userInfo addCategory) {
        
        List<userInfo>check = new ArrayList<>();
        check.add(addCategory);
        
            boolean Status = false;
           
            System.out.println("Condition 1: age above 18 2: Health check ");
           System.out.println("Enter UserId");
           int id2 = in.nextInt();

            for (userInfo i : check) {
                if(id2 == i.getUserId()){
                System.out.println("Hello "+ i.getFirstName() + " " + i.getLastName());
                System.out.println("how Old are you: ");
                int age = in.nextInt();

                if(age > 18){
                    System.out.println("Did you pass Health check up Enter Y or y");
                    String answer =in.next() ;
                    if(answer.equals("y")||answer.equals("Y"))
                        Status = true;
                        
                    } }
            
            if(Status){
                System.out.println("Congrats Your Insurance is Active! ");
                i.setStatus("Active");
            }
            else{
                System.out.println("Sorry Your Insurance Can't actived due to non Qualification");
                i.setStatus("NOT Active");
    }}
            }
        }
        
    
   













