import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        prvocisla();

    }

    public static void prvocisla (){
        Scanner scn = new Scanner(System.in);
        System.out.print("Zadejte počet požadovaných prvočísel: ");
        int maximalnipocet = scn.nextInt();
        int[] pole = new int[maximalnipocet];

        for (int i =0;i<maximalnipocet;i++){

            if(i==3||i==5||i==7){
                System.out.println(i);

            }
            else if (((i%2==0)||(i%3==0)||(i%4==0)||(i%6==0)||(i%5==0)||(i%7==0)||(i%8==0)||(i%9==0))){
                maximalnipocet++;

            }else if(i==1){
                maximalnipocet++;

            }else{
                System.out.println(i);
            }
        }



    }
}
