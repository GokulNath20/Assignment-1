import java.util.Scanner;//import Scanner class
public class Main{

     public static void main(String[]args){
     
     Scanner gk = new Scanner(System.in);//declare Scanner object
     
     String lol;
     int choose,choice,rating_choose,size_choose,location_choose,service_choose;
     
     bestchoice bc = new bestchoice();
     rating r = new rating();
     size s = new size();
     location lc = new location();
     serviceLevel sl = new serviceLevel();//objects created for classes
     
     System.out.println("General facilities will be provided by Hotel:");
     System.out.println();
     r.wifi(); //identifier of class rating can be used to access the wifi method in hotel class since using inheritance by keyword extends
     s.parking();
     lc.roomService();
     //sl.roomService();   /*serviceLevel class is not used because it cannot access the method in hotel class
                           //since no inheritance by keyword extends is used */
     System.out.println();
     
     do{
     System.out.println("1.Rating\n2.Size\n3.Location\n4.Service level");
     System.out.print("Please select any of these hotel types: ");
     choose = gk.nextInt();
     
     if(choose==1){
     
     System.out.println("1.One star\n2.Two star\n3.Three star\n4.Four star\n5.Five star\n");
     System.out.print("Please select the hotel rating: ");
     rating_choose = gk.nextInt();
     
         if(rating_choose==1)
         r.OneStar();
         else if(rating_choose==2)
         r.TwoStar();
         else if(rating_choose==3)
         r.ThreeStar();
         else if(rating_choose==4)
         r.FourStar();
         else if(rating_choose==5)
         r.FiveStar();
         else
         System.out.println("Incorrect type");
    }
    
    else if(choose==2){
    System.out.println("1.Small Hotel\n2.Medium Hotel\n3.Large Hotel\n4.Major/Very large Hotel\n");
    System.out.print("Please select the hotel size: ");
    size_choose = gk.nextInt();
         
         if(size_choose==1)
         s.smallHotel();
         else if(size_choose==2)
         s.mediumHotel();
         else if(size_choose==3)
         s.largeHotel();
         else if(size_choose==4)
         s.majorORverylargeHotel();
         else
         System.out.println("Incorrect type");
    }
    
    else if(choose==3){
    System.out.println("1.Downtown\n2.Airport\n3.Resort\n4.Motel\n");
    System.out.print("Please select the hotel location: ");
    location_choose = gk.nextInt();
    
         if(location_choose==1)
         lc.downtown();
         else if(location_choose==2)
         lc.airport();
         else if(location_choose==3)
         lc.resort();
         else if(location_choose==4)
         lc.motel();
         else
         System.out.println("Incorrect type");
    }
    
    else if(choose==4){
    System.out.println("1.Upmarket/Luxury\n2.Mid-Market\n3.Budget\n");
    System.out.print("Please select the hotel service level: ");
    service_choose = gk.nextInt();
    
         if(service_choose==1)
         sl.upmarketORluxury();
         else if(service_choose==2)
         sl.midMarket();
         else if(service_choose==3)
         sl.Budget();
         else
         System.out.println("Incorrect type");
    }
    
    else{
    
    System.out.println("Incorrect type\n");
    
    }
    System.out.println();
    System.out.print("Do you want to continue searching?[1.Yes 2.No]");
    choice = gk.nextInt();
    
    }while(choice==1);
   
  
  System.out.println("1.Rating\n2.Size\n3.Location\n4.Service level");
  System.out.print("What hotel type do you prefer most to select the hotel you want?: ");
  int feedback = gk.nextInt();
  
  bc.setChoice(feedback);
  if(feedback==1)
  lol="Rating";
  else if(feedback==2)
  lol="Size";
  else if(feedback==3)
  lol="Location";
  else
  lol="Service level";
  
  System.out.println("You chose "+ lol);
  System.out.println("Thanks for your feedback..:)");
  }  
  
}  