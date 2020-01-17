package office_hour;

public class Practice_12_16 {
    public static void main(String[] args) {

        String [] names = {"John", "Kevin", "Scott"};
        for (String name: names){
            System.out.println( name );
        }

        //lets say we need to store some table
        //where we have rows and columns

        String[][] students = { {"1", "John", "35", "USA" }, {"2", "Kevin","40" ,"Brazil"}, { "3" , "Scott", "20","Canada"}};

        //loop through inner arrays
        for ( String[] arr : students){
            //loop through values in every inner array
            for (String value: arr){
                System.out.print(value+ " ");
            }
            System.out.println();
        }

        System.out.println();
        //FIND OLDEST STUDENT AND PRINT HIS NAME


//        //first just print age
//        String oldestPersonName = students[0][1];
//
//        for (String[] row : students ){
//            //go through every row and get value only from 3rd column | number -1 = index
//            //because 3rd columns hold the ages. In tables columns are organize
//            //so age column is specific, name column is specific ext
//            System.out.println(row[2]);     //3rd row represents age
//            //I need to convert into integer to be able to compare
//            int age = Integer.parseInt(row[2]);//convert string --> into int
//
//            }
//        }

    }
}
