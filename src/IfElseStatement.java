import java.sql.Statement;

public class IfElseStatement {
    public static void testIf(){
        int num = 10;
        if(num < 0){
            System.out.println("Negative Num");
        }
        System.out.println("Statement outline if block");
        System.out.println("---------------------------");
    }
    public static void testIfElse(){
        String language = "Java";
        if(language == "Java"){
            System.out.println("Java Programming");
            System.out.println("---------------------------");
        }
    }

    public static void testIfElse2(){
        int num = 10;
        if(num > 0){// > = Positive
            System.out.println("Positive Num");
        }
        if(num < 0){// < = Negative
            System.out.println("Negative Num");
        }
    }
    public static void testIfElseifElse(){
        String day = "Monday";

        if(day == "Sunday"){
            System.out.println("Sunday");
        }
        else if(day == "Monday"){
            System.out.println("Monday");
        }
        else{
            System.out.print("ERROR Day");
        }
    }

    public static void nestedIfElse(){
        int age = 25;
        int weight = 48;

        if(age >= 18){
            if(weight >50 ){
                System.out.println("You are eligible to donate blood");
            }else{
                System.out.print("You are not eligible to donate blood");
            }
        }else{
            System.out.println("Age must be greater than 18");
        }
    }
}
