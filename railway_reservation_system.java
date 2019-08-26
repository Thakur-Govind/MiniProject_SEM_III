import java.util.*;
class railway_reservation_system
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        System.out.println("                                                                                                    INDIAN RAIL RESERVATION");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        int no_p=0;  
        String q;
        int trno=0;
        int tot_bill=0;
        int[] tr_no={933261,966556,987546,129546,255648,984564,556847,445689,888756,956485};
        String[] tr_nm={"Rajdhani Express     ","Chennai Express     ","Punjab Mail         ","Ambala Express      ","Agaskranti Express  ","Toronto Express     ","Mahanagri Express   ","Tapovan Express     ","Devagri Express     ","Konkan Kanya Express"};
        String[] sr={"MUMBAI     ","CHENNAI    ","PUNJAB     ","AGRA       ","DELHI      ","HYDERABAD  ","PUNE       ","NASHIK     ","SECUNDERABAD","CHURCHGATE  "};
        String[] ds={"HARYANA    ","KOLKATA    ","NOIDA      ","AMBALA     ","KOLKATA    ","DELHI      ","VARANASI   ","COIMBATORE ","ASSAM      ","BORIVALI    "};
        int[] fare={500,700,600,800,1400,2200,2800,4200,650,42};
        String[] cl={"UNRESERVED GENERAL","CHAIR CAR         ","AC CHAIR CAR      ","3 TIER SLEEPER    ","AC 3 TIER         ","AC 2 TIER         ","FIRST  CLASS       ","FIRST AC          ","MILITARY CLASS    ","        SUBURBAN  "};//SPACES PUT FOR PROPER PRESENTATION
        do{
          System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION                FARE(per person)         CLASS");
           for(int i=0;i<10;i++)
            
            System.out.println(tr_no[i]+"\t     "+tr_nm[i]+"\t     "+sr[i]+"\t     "+ds[i]+"\t   Rs"+fare[i]+"\t             "+cl[i]);
            System.out.println(); 
            System.out.println();
            System.out.println("Please enter the train number(Enter 0 to EXIT)");
            trno=sc.nextInt();
            System.out.println();
            switch(trno)
            {
                case 933261:do{
                                System.out.println("You Selected:Rajdhani Express");
                                System.out.println("From :"+sr[0]+" To :"+ds[0]);
                                System.out.println("Fare: Rupees "+fare[0]+" per head");
                                System.out.println("Class :"+cl[0]);
                                System.out.println("How many passengers are travelling?");
                                no_p=sc.nextInt();
                              if(no_p>0)
                                 {
                                 System.out.println();System.out.println();
                                 tot_bill=fare[0]*no_p;
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                 
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION            FARE(per head in rupees)         CLASS               NO. OF PASSENGERS           TOTAL AMOUNT(in rupees)");
                                 System.out.println(tr_no[0]+"\t     "+tr_nm[0]+"\t     "+sr[0]+"\t     "+ds[0]+"\t     "+fare[0]+"\t                "+cl[0]+"\t                  "+no_p+"\t                      "+tot_bill);
                                 System.out.println();
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println();
                                 System.out.println();
                                 System.out.println("Please see again if you want to book for any other train, the list is given below");
                                 for(int i=1;i<15;i++)//FOR SPACING
                                 System.out.println();
                                }
                                
                                  else
                               { System.out.println("Sorry, You have entered wrong number of pasengers(number of passengers should be greater than 0). Please try again");
                                for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                            }while(no_p<=0);
                            break;
                case 966556:
                              do{
                                System.out.println("You Selected:Chennai Express");
                                System.out.println("From :"+sr[1]+" To :"+ds[1]);
                                System.out.println("Fare: Rupees "+fare[1]+" per head");
                                System.out.println("Class :"+cl[1]);
                                System.out.println("How many passengers are travelling?");
                                no_p=sc.nextInt();
                              if(no_p>0)
                                 {
                                 System.out.println();System.out.println();
                                 tot_bill=fare[1]*no_p;
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                 
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION            FARE(per head in rupees)         CLASS               NO. OF PASSENGERS           TOTAL AMOUNT(in rupees)");
                                 System.out.println(tr_no[1]+"\t     "+tr_nm[1]+"\t     "+sr[1]+"\t     "+ds[1]+"\t     "+fare[1]+"\t                "+cl[1]+"\t                  "+no_p+"\t                      "+tot_bill);
                                 System.out.println();
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println();
                                 System.out.println();
                                 System.out.println("Please see again if you want to book for any other train, the list is given below");
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                                
                                  else
                               { System.out.println("Sorry, You have entered wrong number of pasengers(number of passengers should be greater than 0). Please try again");
                                for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                            }while(no_p<=0);
                            break;
                case 987546: do{
                                System.out.println("You Selected:Punjab Mail");
                            System.out.println("From :"+sr[2]+" To :"+ds[2]);
                                System.out.println("Fare: Rupees "+fare[2]+" per head");
                                System.out.println("Class :"+cl[2]);
                                System.out.println("How many passengers are travelling?");
                                no_p=sc.nextInt();
                              if(no_p>0)
                                 {
                                 System.out.println();System.out.println();
                                 tot_bill=fare[2]*no_p;
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                 
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION            FARE(per head in rupees)         CLASS               NO. OF PASSENGERS           TOTAL AMOUNT(in rupees)");
                                 System.out.println(tr_no[2]+"\t     "+tr_nm[2]+"\t     "+sr[2]+"\t     "+ds[2]+"\t     "+fare[2]+"\t                "+cl[2]+"\t                  "+no_p+"\t                      "+tot_bill);
                                 System.out.println();
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println();
                                 System.out.println();
                                 System.out.println("Please see again if you want to book for any other train, the list is given below");
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                                
                                  else
                               { System.out.println("Sorry, You have entered wrong number of pasengers(number of passengers should be greater than 0). Please try again");
                                for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                            }while(no_p<=0);
                            break;
                case 129546:do{
                                System.out.println("You Selected:Ambala Express");
                               System.out.println("From :"+sr[3]+" To :"+ds[3]);
                                System.out.println("Fare: Rupees "+fare[3]+" per head");
                                System.out.println("Class :"+cl[3]);
                                System.out.println("How many passengers are travelling?");
                                no_p=sc.nextInt();
                              if(no_p>0)
                                 {
                                 System.out.println();System.out.println();
                                 tot_bill=fare[3]*no_p;
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                 
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION            FARE(per head in rupees)         CLASS               NO. OF PASSENGERS           TOTAL AMOUNT(in rupees)");
                                 System.out.println(tr_no[3]+"\t     "+tr_nm[3]+"\t     "+sr[3]+"\t     "+ds[3]+"\t     "+fare[3]+"\t                "+cl[3]+"\t                  "+no_p+"\t                      "+tot_bill);
                                 System.out.println();
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println();
                                 System.out.println();
                                 System.out.println("Please see again if you want to book for any other train, the list is given below");
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                                
                                  else
                               { System.out.println("Sorry, You have entered wrong number of pasengers(number of passengers should be greater than 0). Please try again");
                                for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                            }while(no_p<=0);
                            break;
                case 255648:do{
                                System.out.println("You Selected:Agaskranti Express");
                                System.out.println("From :"+sr[4]+" To :"+ds[4]);
                                System.out.println("Fare: Rupees "+fare[4]+" per head");
                                System.out.println("Class :"+cl[4]);
                                System.out.println("How many passengers are travelling?");
                                no_p=sc.nextInt();
                              if(no_p>0)
                                 {
                                 System.out.println();System.out.println();
                                 tot_bill=fare[4]*no_p;
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                 
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION            FARE(per head in rupees)         CLASS               NO. OF PASSENGERS           TOTAL AMOUNT(in rupees)");
                                 System.out.println(tr_no[4]+"\t     "+tr_nm[4]+"\t     "+sr[4]+"\t     "+ds[4]+"\t     "+fare[4]+"\t                "+cl[4]+"\t                  "+no_p+"\t                      "+tot_bill);
                                 System.out.println();
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println();
                                 System.out.println();
                                 System.out.println("Please see again if you want to book for any other train, the list is given below");
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                                
                                  else
                               { System.out.println("Sorry, You have entered wrong number of pasengers(number of passengers should be greater than 0). Please try again");
                                for(int i=1;i<15;i++)//FOR SPACING
                                 System.out.println();
                                }
                            }while(no_p<=0);
                            break;
                case 984564:do{
                                System.out.println("You Selected:Toronto Express");
                               System.out.println("From :"+sr[5]+" To :"+ds[5]);
                                System.out.println("Fare: Rupees "+fare[5]+" per head");
                                System.out.println("Class :"+cl[5]);
                                System.out.println("How many passengers are travelling?");
                                no_p=sc.nextInt();
                              if(no_p>0)
                                 {
                                 System.out.println();System.out.println();
                                 tot_bill=fare[5]*no_p;
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                 
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION            FARE(per head in rupees)         CLASS               NO. OF PASSENGERS           TOTAL AMOUNT(in rupees)");
                                 System.out.println(tr_no[5]+"\t     "+tr_nm[5]+"\t     "+sr[5]+"\t     "+ds[5]+"\t     "+fare[5]+"\t                "+cl[5]+"\t                  "+no_p+"\t                      "+tot_bill);
                                 System.out.println();
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println();
                                 System.out.println();
                                 System.out.println("Please see again if you want to book for any other train, the list is given below");
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                                
                                  else
                               { System.out.println("Sorry, You have entered wrong number of pasengers(number of passengers should be greater than 0). Please try again");
                                for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                            }while(no_p<=0);
                            break;
                case 556847:do{
                                System.out.println("You Selected:Mahanagri Express");
                               System.out.println("From :"+sr[6]+" To :"+ds[6]);
                                System.out.println("Fare: Rupees "+fare[6]+" per head");
                                System.out.println("Class :"+cl[7]);
                                System.out.println("How many passengers are travelling?");
                                no_p=sc.nextInt();
                              if(no_p>0)
                                 {
                                 System.out.println();System.out.println();
                                 tot_bill=fare[6]*no_p;
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                 
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION            FARE(per head in rupees)         CLASS               NO. OF PASSENGERS           TOTAL AMOUNT(in rupees)");
                                 System.out.println(tr_no[6]+"\t     "+tr_nm[6]+"\t     "+sr[6]+"\t     "+ds[6]+"\t     "+fare[6]+"\t                "+cl[6]+"\t                  "+no_p+"\t                      "+tot_bill);
                                 System.out.println();
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println();
                                 System.out.println();
                                 System.out.println("Please see again if you want to book for any other train, the list is given below");
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                                
                                  else
                               { System.out.println("Sorry, You have entered wrong number of pasengers(number of passengers should be greater than 0). Please try again");
                                for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                            }while(no_p<=0);
                            break;
                case 445689:do{
                                System.out.println("You Selected:Tapovan Express");
                               System.out.println("From :"+sr[7]+" To :"+ds[7]);
                                System.out.println("Fare: Rupees "+fare[7]+" per head");
                                System.out.println("Class :"+cl[7]);
                                System.out.println("How many passengers are travelling?");
                                no_p=sc.nextInt();
                              if(no_p>0)
                                 {
                                 System.out.println();System.out.println();
                                 tot_bill=fare[7]*no_p;
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                 
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION            FARE(per head in rupees)         CLASS               NO. OF PASSENGERS           TOTAL AMOUNT(in rupees)");
                                 System.out.println(tr_no[7]+"\t     "+tr_nm[7]+"\t     "+sr[7]+"\t     "+ds[7]+"\t     "+fare[7]+"\t                "+cl[7]+"\t                  "+no_p+"\t                      "+tot_bill);
                                 System.out.println();
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println();
                                 System.out.println();
                                 System.out.println("Please see again if you want to book for any other train, the list is given below");
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                                
                                  else
                               { System.out.println("Sorry, You have entered wrong number of pasengers(number of passengers should be greater than 0). Please try again");
                                for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                            }while(no_p<=0);
                            break;
                case 888756:do{
                                System.out.println("You Selected:Devagri Express");
                                System.out.println("From :"+sr[8]+" To :"+ds[8]);
                                System.out.println("Fare: Rupees "+fare[8]+" per head");
                                System.out.println("Class :"+cl[8]);
                                System.out.println("How many passengers are travelling?");
                                no_p=sc.nextInt();
                              if(no_p>0)
                                 {
                                 System.out.println();System.out.println();
                                 tot_bill=fare[8]*no_p;
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                 
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION            FARE(per head in rupees)         CLASS               NO. OF PASSENGERS           TOTAL AMOUNT(in rupees)");
                                 System.out.println(tr_no[8]+"\t     "+tr_nm[8]+"\t     "+sr[8]+"\t     "+ds[8]+"\t     "+fare[8]+"\t                "+cl[8]+"\t                  "+no_p+"\t                      "+tot_bill);
                                 System.out.println();
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println();
                                 System.out.println();
                                 System.out.println("Please see again if you want to book for any other train, the list is given below");
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                                
                                  else
                               { System.out.println("Sorry, You have entered wrong number of pasengers(number of passengers should be greater than 0). Please try again");
                                for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                            }while(no_p<=0);
                            break;
                case 956485:do{
                                System.out.println("You Selected:Konkan Kanya Express");
                                System.out.println("From :"+sr[9]+" To :"+ds[9]);
                                System.out.println("Fare: Rupees "+fare[9]+" per head");
                                System.out.println("Class :"+cl[9].trim());
                                System.out.println("How many passengers are travelling?");
                                no_p=sc.nextInt();
                              if(no_p>0)
                                 {
                                 System.out.println();System.out.println();
                                 tot_bill=fare[9]*no_p;
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                 
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println("TRAIN NO.    TRAIN NAME                      SOURCE               DESTINATION            FARE(per head in rupees)         CLASS               NO. OF PASSENGERS           TOTAL AMOUNT(in rupees)");
                                 System.out.println(tr_no[9]+"\t     "+tr_nm[9]+"\t     "+sr[9]+"\t     "+ds[9]+"\t     "+fare[9]+"\t                "+cl[9]+"\t                  "+no_p+"\t                      "+tot_bill);
                                 System.out.println();
                                 System.out.println("**********************************************************************************************TICKET********************************************************************************************************************");
                                 System.out.println();
                                 System.out.println();
                                 System.out.println("Please see again if you want to book for any other train, the list is given below");
                                 for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                                
                                  else
                               { System.out.println("Sorry, You have entered wrong number of pasengers(number of passengers should be greater than 0). Please try again");
                                for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                }
                            }while(no_p<=0);
                            break;
                            case 0:System.out.println("THANK YOU FOR USING THE RESERVATION SERVICE"+"\n"+"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            break;
                        default:System.out.println("Sorry, the train was not found. Please  try again");
                                for(int i=1;i<5;i++)//FOR SPACING
                                 System.out.println();
                                
                            }
           
                                
                        }
                        while(trno>0||trno<0);
                    }
                }
                            
                            
