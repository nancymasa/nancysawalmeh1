package sources_code;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainapplication {
	
	static List <Order>order;
	static ArrayList <LoginSteps> userslogin;
	static ArrayList<Customersteps> mylist;
	static ArrayList<ProdectSteps> rugDetails;
	static List<Worker> workerlist;
	static  LoginSteps  log= new LoginSteps();
	static ProdectSteps pro=new ProdectSteps();
	
	static Order ord=new Order();
	static Worker W=new Worker();
	private static Scanner input;
	private static Scanner input1;
	public static Customersteps cus=new Customersteps();
	public static void main(String[] args) {
		
		pro.init();
		cus.recordinformationinit();
		W.informationworker();
		

		
		System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
		LoginSteps.inti();
		LoginSteps.Whos_the_user();
		int x=LoginSteps.x;
		
           log.setx(x);
		
		
		 
		if(log.getisLoginadmin()==true){

			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
	        System.out.println("welacome to admin: "+LoginSteps. userslogin.get(x).getName());
	        admin();
		}
		else if (log.getisLoginworker()==true) {
			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
			
			System.out.println("welacome to worker: "+LoginSteps. userslogin.get(x).getName());
            worker();

		}
		else {
			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
            System.out.println("welacome to customer: "+LoginSteps. userslogin.get(x).getName());
            customer();
		}
	}
	

	public static void admin() {
		
		
		//int x=LoginSteps.x;
        int flge1=1;
		input = new Scanner(System.in);

        while(flge1==1) {
        	System.out.println("| **************Menu**************|\n ");
			System.out.println("| 1. prodect                      |\n");
			System.out.println("| 2. customer                     |\n");
			System.out.println("| 3. worker                       |\n");
			System.out.println("| 4.reports_about_business        |\n");
			System.out.println("| 5.all order                     |\n");
			System.out.println("| 6.logout                        |\n");

			int number=Integer.parseInt(input.nextLine());
			switch(number) {
			case 1:{
				 int flge2=1;
		        input1 = new Scanner(System.in);
				while(flge2==1) {
					System.out.println("| **************Menu**************|\n ");
	    			System.out.println("| 1. show all prodect             |\n");
	    			System.out.println("| 2.Add new prodect               |\n");
	    			System.out.println("| 3. update prodect               |\n");
	    			System.out.println("| 4.delete prodect                |\n");
	    			System.out.println("| 5.close                        |\n");

	    			int number1=Integer.parseInt(input1.nextLine());
	    			switch(number1) {
	    			case 1:{
	    				int count=0;
	    				pro.carpetdetails();
	    				pro.coverdetails();
	    				
				        for (int i=0;i<ProdectSteps.rugDetails.size();i++) {
				        	count++;
				        }
    	    			System.out.println("\n");
    	    			System.out.println("number of prodect= "+count);

	    				break;
	    			}
	    			
                   case 2:{
	    				
	    				pro.Add_product();
	    				
	    				break;
	    			}
                   case 3:{
                	   pro.carpetdetails();
	    				   pro.coverdetails();
	    				   pro.updateProduct();
	    				
	    				
	    				
	    				break;
	    			}
	    			
                   case 4:{
                	   pro.carpetdetails();
	    				   pro.coverdetails();
                	   pro.deleteProduct();
	    				
	    				
	    				
	    				break;
	    			}	
	    			
                   case 5:{
                	 
       				 flge2=0;
       				 
       				break;}
	    				
	    				
                   default:
                       System.out.println("Default! ");
                       break;
	    			
	    			}}
	    			
				break;
			}
			
			
			
			case 2:{
				 int flge3=1;
 		        input1 = new Scanner(System.in);
 				while(flge3==1) {
 					System.out.println("| **************Menu**************|\n ");
 	    			System.out.println("| 1. show all customer             |\n");
 	    			System.out.println("| 2.Add new customer               |\n");
 	    			System.out.println("| 3. update customer               |\n");
 	    			System.out.println("| 4.delete customer               |\n");
 	    			System.out.println("| 5.close                        |\n");
 	    			int number1=Integer.parseInt(input1.nextLine());
 	    			switch(number1) {
 	    			case 1:{
 	    				for(int i=0;i<Customersteps.mylist.size();i++) {
 	    					Customersteps.mylist.get(i).showcustomer();
 	    				}
 	    				
 	    				break;
 	    			}
 	    			case 2:{
 	    				cus.saveinformationcustmer();
 	    				log.addnewlogin();
 	    			
 	    				break;
 	    			}
 	    			
 	    			case 3:{
 	    				
 	    				cus.updetecustomer();}
 	    			
             case 4:{
 	    	      cus.deletecustomer();}
 	    				
             case 5:{
	    	     flge3=0;
	    	     break;
	    	     }		
 	    			
 	    			
 	    			}//number
 				}//while loop
 				
 			break;	
			}//case2
			
			case 3:{
				for(Worker w:W.workerlist) {
				w.show_worker();}
				break;
			}
			case 4:{
				cus.report();
				break;
			}
			case 5:{
				cus.allorder();
				break;
			}
			case 6:{
  				 flge1=0;
                log.setisLoginadmin(false);
				break;
			}
			
			  default:
                  System.out.println("Default! ");
                  break;
			
			}
        }
        if( flge1==0) {
        	
        	System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
    		LoginSteps.inti();
    		LoginSteps.Whos_the_user();
    		int x1=LoginSteps.x;
    		System.out.println(x1);
               log.setx(x1);
    		 
    		if(log.getisLoginadmin()==true){

    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
    	        System.out.println("welacome to admin: "+LoginSteps. userslogin.get(x1).getName());
    	        admin();
    		}
    		else if (log.getisLoginworker()==true) {
    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
                System.out.println("welacome to worker: "+LoginSteps. userslogin.get(x1).getName());
                worker();
    		}
    		else {
    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
                System.out.println("welacome to customer: "+LoginSteps. userslogin.get(x1).getName());
                customer();
    		}
    		
        }
	}
	
	public static void customer() {
		
		
        int flge1=1;
		input = new Scanner(System.in);

        while(flge1==1) {
        	System.out.println("| ****************Menu***************|\n ");
        	System.out.println("| 1. Add prodect in shoppingcart     |\n");
			System.out.println("| 2.show all prodect in shoppingcart |\n");
			System.out.println("| 3. Remove prodect in shoppingcar   |\n");
			System.out.println("| 4.check out                        |\n");
			System.out.println("| 5.Messages                         |\n");
			System.out.println("| 6.logout                           |\n");

			int number=Integer.parseInt(input.nextLine());
			switch(number) {
			case 1:{
				cus.Addshopping();
				break;
			}//case1
			case 2:{
				cus.showshopping();
				break;
			}
			case 3:{
				cus.removeshopping();
			}
			case 4:{
				cus.ckeckout();
				
				break;
			}
			case 5:{
				cus.sendmessage();
				cus.sendnotification();
				break;
			}
			case 6:{
				flge1=0;
				log.setisLogincustomer(false);
				break;
			}
			
			}
       
       
    		
        }
        if( flge1==0)
        {LoginSteps  log= new LoginSteps();
       
        	System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
    		LoginSteps.inti();
    		LoginSteps.Whos_the_user();
    		int x1=LoginSteps.x;
    		log.setx(x1);
			if(log.getisLoginadmin()==true){

    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
    	        System.out.println("welacome to admin: "+LoginSteps. userslogin.get(x1).getName());
    	        admin();
    		}
    		else if (log.getisLoginworker()==true) {
    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
                System.out.println("welacome to worker: "+LoginSteps. userslogin.get(x1).getName());
                worker();
    		}
    		else {
    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
                System.out.println("welacome to customer: "+LoginSteps. userslogin.get(x1).getName());
                customer();
    		}
    		
        }
		
		
	}
	
	public static void worker() {
		 int flge1=1;
			input = new Scanner(System.in);

	        while(flge1==1) {
	        	System.out.println("| ****************Menu***************|\n ");
	        	System.out.println("| 1. show order                      |\n");
				System.out.println("| 2. select situation                |\n");
				System.out.println("| 3.logout                           |\n");

				int number=Integer.parseInt(input.nextLine());
				switch(number) {
				case 1:{
					cus.showorderw();
					break;
				}
				case 2:{
					cus.trackorder();
					break;
				}
				case 3:{
					flge1=0;
					log.setisLoginworker(false);
					break;
				}
				}
				 if( flge1==0)
			        {LoginSteps  log= new LoginSteps();
			       
			        	System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
			    		LoginSteps.inti();
			    		LoginSteps.Whos_the_user();
			    		int x1=LoginSteps.x;
			    		log.setx(x1);
						if(log.getisLoginadmin()==true){

			    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
			    	        System.out.println("welacome to admin: "+LoginSteps. userslogin.get(x1).getName());
			    	        admin();
			    		}
			    		else if (log.getisLoginworker()==true) {
			    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
			                System.out.println("welacome to worker: "+LoginSteps. userslogin.get(x1).getName());
			                worker();
			    		}
			    		else {
			    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
			                System.out.println("welacome to customer: "+LoginSteps. userslogin.get(x1).getName());
			                customer();
			    		}
			    		
			        }
	        
	        
	        }
	}
	
}
