package Acessing;
import java.util.Scanner;



import amdinImpl.CustomerImpl;
import model.userInfo;

public class CustomerPage {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        CustomerImpl customer = new CustomerImpl();
        userInfo category = new userInfo( userId,firstName,lastName,email,passWord,policy,status) ;

        System.out.println("Enter from chooses 1) viewCategory 2) viewSubCatergory 3)ApplyPolicy 4)ViewPolicy");
        int choice = in.nextInt();



        switch (choice){
            case 1:customer.viewCatagory(category);break;
            case 2: customer.viewSubCatagory(category);break;
            case 3: customer.applyPolicy(category);break;
            case 4: customer.viewPolicyHeHolds(category);break;
            case 5: System.exit(0);
            default : System.out.println("Chooese from Option:");

        }
        in.close();
    }
}
