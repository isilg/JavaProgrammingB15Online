package taskChannel;

public class employee {
    public static void main(String[] args) {

//        //DECEMBER 18
//        //TASK 1. Print all job titles - hint ( substring, indexOf)
//
//        //TASK 2: Print all FirstName-lastName jobTitle
//        //for example :
//        // Philipa-Salthouse Electrical Engineer
//        // Ulrika-Goolding Nuclear Power Engineer
//
//        //TASK 3. Look for those 2 people in the array and assert below data
//        /*
//        Tracy Bartle should be Geological Engineer
//        Skipper Abrahamsson should be Financial Advisor
//        if true{
//            Print "PASS: Verification successful. Tracy Bartle's job is Geological Engineer
//        }else{
//            Print "FAIL: Verification error:  Tracy Bartle's job is NOT Geological Engineer
//        }
//
//        //Task 4:  //Print Initials -> Job Title for everyone
//        /*
//        TB -> Geological Engineer
//         */
//
//        String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
//        //"Analiese Van der Brugge [Web Developer II] avanderbrugge6@yelp.com";
//        //"Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
//        // print job title from this String :  Electrical Engineer
//
//        // logic : title is in between [ and ]  so we need to find index of [ and ]
//
//            // logic 2 :  get the full name directly using subString
//            //            replace all the space in full name with -
//            //            then concatenate with the title
//            String fullName = employee.substring(0, employee.indexOf(" ["));
//            System.out.println("fullName = " + fullName);
//            //  Philipa-Salthouse Electrical Engineer
//            String fullNameWithDash = fullName.replace(" ", "-");
//            System.out.println("fullNameWithDash = " + fullNameWithDash);
//
//             System.out.println(fullNameWithDash + " " + title);
//
//        /*
//        * //TASK 3. Look for those 2 people in the array and assert below data
//        /*
//        Tracy Bartle should be Geological Engineer
//        Skipper Abrahamsson should be Financial Advisor
//        if true{
//            Print "PASS: Verification successful. Tracy Bartle's job is Geological Engineer
//        }else{
//            Print "FAIL: Verification error:  Tracy Bartle's job is NOT Geological Engineer
//        }
//        * */
//            /*  Given Expected Title for Philipa Salthouse is Electrical Engineer
//             *  Write a if statement to test if it's correct or not
//             * */
//            if (title.equals("Electrical Engineer")) {
//                System.out.println("PASS: Verification successful");
//            } else {
//                System.out.println("FAIL: Verification fail : " + title);
//            }
//
//        /*Task 4:  //Print Initials -> Job Title for everyone
//         *
//         PS -> Electrical Engineer*/
//
//            // logic :   get the first word and last word of your full name and get first characters of both
//            ///          a full name might contains more than 2 words but we only want 2 characters for initials
//            // I already have variable fullname that contains fullname
//            // Bruce D Wayne  -->> BW
//            // get first character using charAt(0) ,
//            // get lastname first character using charAt( lastIndexOfSpace +1    )
//            System.out.println(fullName.charAt(0) + ""
//                    + fullName.charAt(fullName.lastIndexOf(" ") + 1)
//                    + " -> " + title);
//



        }
}
