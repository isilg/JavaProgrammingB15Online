package day36;

import java.util.ArrayList;

public class Finding_Unique_Elements_ArrayList {
    public static void main(String[] args) {
        // TASK: ADD NUMS ARRAY'S ELEMENTS IN THE ARRAYLIST WITHOUT REPETITION
        int[] nums = {11, 33, 44, 11, 33, 44, 22, 22, 55, 44, 33};

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for(int each : nums){
            //IF UNIQUELIST DOESNT CONTAIN THAT ELEMENT(EACH) THEN ADD IT TO THE UNIQUELIST
            if(! uniqueList.contains(each)){
                uniqueList.add(each);
            }
        }
        System.out.println(uniqueList);
    }
}
