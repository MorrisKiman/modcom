package weekOne;

import java.util.Scanner;

//8th May 2019
public class lesson3 {

    public static void main(String [] args){
        //switch statements
        String  text = "WElcome to VBANNK\n" +
                "1. Products\n" +
                "2. Services" +
                "\n 3.Help\n" +
                "REPLY: ";
        Scanner scan1 = new Scanner(System.in);
        System.out.println(text);
//user should reply with an in t either 1,2 3
        int reply = scan1.nextInt();

        switch(reply){
            case 1:
                String  text1 = "WElcome to PRODUCTS\n" +
                        "1. Cookers\n" +
                        "2. TVs" +
                        "\n 3.Help\n" +
                        "REPLY: ";
                System.out.println(text1);
                int products = scan1.nextInt();

                //nested switch
                switch(products){
                    case 1:
                        String text1a = "Welcome to cookers!\n They are all top quality LG, Hiense, Hotpoint and Mika cookers!\n" +
                                "Prices range from KSH30,000 to 100,000!\n Hurry While stocks last!";
                        System.out.println(text1a);
                        break;

                    case 2:
                        String text1b="We have lg screens";
                        System.out.println((text1b));
                        break;

                    case 3:
                        String text1c= "Reach our head offices at \n\b 0722435667!";

                        default:
                            System.out.println("Invalid Selection. Try again");
                }
                break;//Stops further execution once a case matches
            case 2:
                String  text2 = "WElcome to SERVICES\n" +
                        "1. Training\n" +
                        "2. Laundry" +
                        "\n 3.Helpn" +
                        "REPLY: ";
                System.out.println(text2);
                int services = scan1.nextInt();
                //nested switch

                switch(services){
                    case 1:
                        String text2a= "We offer training in the following areas:\n 1. CyberSecurity" +
                                "\n2. ICDL" +
                                "\n3. Human Resource management" +
                                "\n4. Data Mining";
                        System.out.println(text2a);
                        break;

                    case 2:
                        String text2b = "We wash clothes in the second floor of hazina towers";
                        System.out.println(text2b);
                        break;

                    case 3:
                        String text2c = "For enquiries call: 0722435667";
                        System.out.println(text2c);
                        break;

                    default:
                        System.out.println("Invalid entry!\n Please try again.");
                }
                break;//Stops further execution once a case matches
            case 3:
                String  text3 = "Helpline is 0722435667\n";
                System.out.println(text3);
                break;

                default:
                    System.out.println("Invalid selection!\nTry again");
        }//end switch
    }//end main
}//end class

//Switches do not work on dome datatypes eg: boolean, float, double,

/*  Switch basic syntax
            switch (myVariable){
               case ...:
                   <staements to execute>
                   break;
                case ....:
                   <staements to execute>
                      break;
                case.....:
                   <staements to execute>
                   break;
                case...n..:
                   <staements to execute>
                  break;
                 default:
                    <staements to execute>
                    break;
            }
*/