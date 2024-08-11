public class Code3 {
    public static void main (String[] args){

     boolean bollVal = false;
        System.out.println("bollVal = " + bollVal);
        System.out.println(!bollVal);


        //var = bool exp ? rez adevarat : rez neg ;

        int a = !(3 < 5) ? 4 : 5;

        String name = "Sam";

        int age = name.equals("Sam") ? 30: 40;
        System.out.println("Sam has " + age + "years");

        int valA = 3;
        int valB = 3;

        if(valA < valB) {
            System.out.println("First number is less then second one");
            valB++;
        }else if (valB < valA)
            System.out.println("Second number is less than first one");
        else
            System.out.println("Numbers are equals!");
    }
}
