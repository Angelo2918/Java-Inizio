public class Code {
    public static void main(String[] args){
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD =1;


        int rez1 = valA - valB / valC;
        System.out.println("Rez1 = " + rez1);

        int rez2 = (valA - valB) / valC;
        System.out.println("Rez2 = " + rez2);

        int rez3 = valA / valC *valD +valB;
        System.out.println("rez3 = " + rez3);

        int rez4 = valA / (valC * (valD+valB));
        System.out.println("rez4 = " + rez4);



    }
}
