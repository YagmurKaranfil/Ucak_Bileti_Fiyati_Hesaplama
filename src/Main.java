import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //distance=mesafe perDistance=kilometre başı amount=tutar
        //age=yaş travelType=seyahat türü
        // ageDiscound = indirim
        // discounted amount=indirimli tutar
        //doubleDirection =gidiş dönüş bilet indirimi
        //totalAmount=toplam tutar


        double distance , perDistance=0.10 , amount=0 , ageDiscound = 0, discountedAmount = 0, doubleDirection = 0, totalAmount;
        int age , travelType;

        Scanner input= new Scanner(System.in);

        System.out.print("Mesafeyi giriniz : ");
        distance=input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age=input.nextInt();

        System.out.println("Seyahat türünü seçiniz\n1-Tek Yön\n2-Gidiş Dönüş ");
        travelType=input.nextInt();

        if(age > 0 && distance > 0 && travelType == 1 || travelType == 2) {

                amount = distance * perDistance;

                if (age < 12) {
                    ageDiscound = amount * 0.50;
                } else if (age >= 12 && age <= 24) {
                    ageDiscound = amount * 0.10;
                } else if (age > 65) {
                    ageDiscound = amount * 0.30;
                }

                discountedAmount = (amount - ageDiscound);
                totalAmount = (amount - ageDiscound);

                if (travelType == 2) {
                    doubleDirection = discountedAmount * 0.20;
                    totalAmount = (discountedAmount - doubleDirection) * 2;
                }


                System.out.println("Toplam Tutar : " + totalAmount);
            } else {
                System.out.println("Hatalı veri girdiniz!!");
            }

    }
}