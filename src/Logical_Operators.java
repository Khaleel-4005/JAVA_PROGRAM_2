public class Logical_Operators {

    public static void main(String[] args){

        int age = 25;
        boolean isCitizen = true;

        System.out.println("eligible to vote: " +(age >=18 && isCitizen));
        System.out.println("Not a citizen or too young: " + (!isCitizen || age <18));
    }
}
