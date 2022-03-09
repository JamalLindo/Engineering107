package com.spartaglobal.Animal;

public class Grade {

    public static void main(String[] args) {
        // com.spartaglobal.week1.Grade Variable.
        int Grade = 70;

        if (Grade <= 10 ){
            System.out.println("com.spartaglobal.week1.Grade too low"); // less than or equal to 10
        } else if (Grade > 10 && Grade <= 50){
            System.out.println("Average com.spartaglobal.week1.Grade"); // more than 10 and less than or equal to 50
        } else if (Grade > 50 && Grade <= 70){
            System.out.println("Above Average com.spartaglobal.week1.Grade"); // more than 50 and less than or equal to 70
        } else {
            System.out.println("Excellent com.spartaglobal.week1.Grade has been achieved."); // above 70
        }
    }
}
