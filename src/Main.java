import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat, kosul = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Sicaklii giriniz : ");
        heat = sc.nextInt();
/*
        if (heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if (heat<=25){
            if (heat<=15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat>=10){
                System.out.println("Piknige gidebilirsiniz. ");
            }
        }else {
            System.out.println("Yuzmeye gidebilirsiniz. ");
        }
  */
            //Switch case
        if (heat < 5) {
            kosul = 0;
        }
        if (heat >= 5 && heat < 15) {
            kosul = 1;
        }
        if (heat >= 10 && heat < 25) {
            kosul = 2;
        }
        if (heat >= 25) {
            kosul = 3;
        }

        switch (kosul) {
            case 0:
                System.out.println("Kayak yapabilirsiniz. ");
                break;
            case 1:
                String sKosulu = (heat>=5 && heat <15) ? "Sinemaya gidebilirsiniz . " : " Piknige gidebilirsiniz. ";
                System.out.println(sKosulu);
                break;
            case 2:
                String pkosulu = (heat >= 15 && heat<25) ? "Piknige gidebilirsiniz . " : "Sinemaya gidebilirsiniz.";
                System.out.println(pkosulu);
                break;
            case 3:
                System.out.println("Yuzmeye gidebilirsiniz. ");
                break;
            default:
        }
        System.out.println("-----------------------");

                         //Ternarny operator
        boolean kosul1=heat<5,kosul2=(heat>=5 && heat<15),kosul3=(heat>=15 && heat<25);
        String oneri;
        oneri=kosul1?"Kayak yapabilirsiniz .":kosul2?"Sinemaya gidebilirsiniz .":kosul3?"Piknige gidebilirsiniz .":"Yuzmeye gidebilirsiniz .";
        System.out.println("Ternarny Operator Onerisi : " +oneri);
    }
}
