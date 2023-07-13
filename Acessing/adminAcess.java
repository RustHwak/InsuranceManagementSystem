package Acessing;
import java.util.Scanner;

import amdinImpl.AdminImpls;

public class adminAcess {

    public static void main(String[] args){
        AdminImpls admin = new AdminImpls();

        System.out.println("Enter a chose 1)Categories 2)Subcategories 3)Policy 4)control 5)Exit");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice)
{
    case 1: admin.Categories(); break;
    case 2: admin.Subcategory(); break;
    case 3: admin.Policy();break;
    case 4: admin.control(); break;
    case 5: System.exit(0);
    default: System.out.println("Enter from chooses");


}

in.close();
    }
    
}
