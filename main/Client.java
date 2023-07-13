package main;

import java.util.Scanner;
import Acessing.CustomerPage;


import Acessing.adminAcess;


public class Client {
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
       

        System.out.println("Enter 1)AdminPage   \n2)CustomerPage ");
        int choice = in.nextInt();
        switch (choice){
            case 1: adminAcess.main(args);break;
            case 2:CustomerPage.main(args);break;
            case 3: System.exit(0);
            default: System.out.println("Enter from chooses");
            


}

in.close();
    } 
    



    
}
