public class Task {
    public static void main(String[] args) {
    //write me a program that initilizes a variable as a float for  "kg" and "lb" . Next i Want you to convert LB to kg using this formula "multiply the number of pounds by 0.45359237".
        // Next I want you to write an if else statement saying if the kg is over 40 but less than 60 then say "You are too skinny" ,
        // and if you are over 60 but under 80 then say " you are perfect weight" , and i f you are over 80 but under 120 kg then say "you are fat". Anything ELSE  say "You are beyond control"
    double lb = 154;
    double con = 0.45369237;
    double kg = con * lb;

    if (kg > 40 && kg < 60){
        System.out.println("You are too Skinny " + "You weigh " + kg);
    }
    else if (kg > 60 && kg < 80){
        System.out.println("You are perfect weight " + "You weigh " + kg);
    }
    else if (kg > 80 && kg < 120){
        System.out.println("You are Fat " + "You weigh " + kg);
    }
    else System.out.print("You are beyond Control " + "You weigh " + kg);

        }
    }
