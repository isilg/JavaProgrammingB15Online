package day27;
public class Find_The_Longest_And_Shortest_Name_In_2D_Array {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalystsTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalystsTeam};

        //FIND THE LONGEST NAME;S LENGTH
        int maxLength = scrumTeam[0][0].length();

        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) { //eachElement is retrieved from each1DArray
                if (maxLength < eachElement.length()) {
                    maxLength = eachElement.length();
                }
            }
        }
        System.out.println(maxLength);

        //FIND THE LONGEST NAME
        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) { //eachElement is retrieved from each1DArray
                if (maxLength == eachElement.length()) {
                    System.out.println(eachElement);
                }
            }
        }

        //FIND THE SHORTEST STRING OF THE ARRAY
        int minLength = scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];
        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {     //scrumTeam[i] is an array  j < 'an array' doesn't make sense.
                                                                // scrumTeam[i].length is a number so we can compare j and length
                if ( minLength > scrumTeam[i][j].length() ) {     //as greater than or less than

                        minLength = scrumTeam[i][j].length();
                        shortestString = scrumTeam[i][j];
                }
            }
        }
        System.out.print(minLength);
        System.out.println("\t");
        System.out.println(shortestString);
    }
}
