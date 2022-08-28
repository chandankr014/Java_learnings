import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;


class file {
    //fetching current date-time
    static String getDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    //GST-innvoice generator
    static String getAlphaNumericString(int n){
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index
				= (int)(AlphaNumericString.length()
						* Math.random());
                        sb.append(AlphaNumericString
						.charAt(index));
		}
		return sb.toString();
	}

    static void customerDetails(){
        Scanner scan = new Scanner(System.in);  

        System.out.print("Enter Customer Name: ");  
        String customer_name = scan.nextLine();  
        System.out.print("Enter Customer Phone No: ");  
        String customer_number = scan.nextLine();
        System.out.println("Customer's details:-");
        System.out.println("| Name: " +customer_name);
        System.out.println("| Contact: " +customer_number);
    }


    static void showBill(int i, int[] p_id_arr, String[] p_name_arr, int[] price_arr, int[] quantity_arr, int[] totalprice_arr)
    {
        System.out.println("____________________________________________");
        System.out.println("        Supermarfket Billing System         ");
        System.out.println("____________________________________________");
        System.out.println("ABC SuperMarket");
        System.out.println("S.P.Sukhobrishti, Newtown, Kolkata - 700135");
        System.out.println("");
        int n = 15;
        int net_amount = 0;
        String GSTIN = file.getAlphaNumericString(n);
        Set<String> contacts = new HashSet<String>();
        contacts.add("7070957221");
        contacts.add("9473059054");
        System.out.println("GSTIN: "+GSTIN + "\t\t" + "Contacts: "+ contacts);
        String date_time = getDateTime();
        System.out.println(date_time);

        System.out.println("\nProduct details:-");
        System.out.println("P.ID \tName\t\tPrice \tQuantity \tTotal Price");  
        for(int p=0; p<i; p++){
            System.out.println(p_id_arr[p] + "\t" + p_name_arr[p] + "\t\t" + price_arr[p] + "\t" + quantity_arr[p] + "\t\t" + totalprice_arr[p]);
            net_amount += totalprice_arr[p];
        }
        System.out.println("Net Amount : "+net_amount);
    }

    //main function
    public static void main(String args[])
    {   
        Scanner scan = new Scanner(System.in);  
        
        //product information
        int i=0;
        int p_id_arr[] = new int[10];
        String p_name_arr[] = new String[20];
        int price_arr[] = new int[10];
        int quantity_arr[] = new int[10];
        int totalprice_arr[] = new int[10];
        do{
            System.out.print("PRODUCT "+ i+1 +"\n");
            System.out.print("ID: ");
            int p_id = scan.nextInt();
            if(p_id==0){break;} //to break the loop
            System.out.print("Name: ");
            String p_name = scan.next();
            System.out.print("Price: ");
            int price = scan.nextInt();
            System.out.print("Quantity: ");
            int quantity = scan.nextInt();

            p_id_arr[i] = p_id;
            p_name_arr[i] = p_name;
            price_arr[i] = price;
            quantity_arr[i] = quantity;
            totalprice_arr[i] = price * quantity;
            i++;

        }while(true);

        //getting bill details
        customerDetails();

        showBill(i, p_id_arr , p_name_arr , price_arr , quantity_arr, totalprice_arr);
    }
}

