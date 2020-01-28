package day35;

public class parseInt_Practice {
    public static void main(String[] args) {

    // Use this number IPR2012-00001 and store the year(2012) into an int variable
    // This case number always start with 3 character either IPR, PGR, CBM, DER
    // followed by year, followed by dash and 5 digit number
    String caseNumber = "IPR2012-00001";
    int year = Integer.parseInt(caseNumber.substring(3,7));
        System.out.println(year);

    // ***AS LONG AS YOU GET THE ANSWER IT DOESNT MATTER TO USE
    // INTEGER.PARSEINT() OR INTEGER.VALUEOF()

    //BUNU METHOD HALINDE YAZ
        System.out.println( getYearOutOfCaseNumber("DER2019-00034") );
        System.out.println( getYearOutOfCaseNumber("IPR2009-01042") );
        System.out.println( getYearOutOfCaseNumber("CBM2001-10133") );
}

    public static int getYearOutOfCaseNumber(String caseNumber){

        return Integer.parseInt( caseNumber.substring(3,7) );
    }
}
