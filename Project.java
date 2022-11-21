import java.util.Locale;
import java.util.Scanner;

public class Project {

    static Scanner scaninput = new Scanner(System.in).useLocale(Locale.US);


    public static void G() {

        System.out.println("Welcome to my Holiday Planning program!");
        System.out.print("Your name is: ");

        String NameandSurname = scaninput.nextLine();

        System.out.print("Pleased to meet you " + NameandSurname + ", where you  want to travel? ");

        String TravelPlase = scaninput.nextLine();

        System.out.println("OK! " + "Good luck in your trip to " + TravelPlase + ".");

    }


    public static void TTaB() {

        System.out.print("How many days will you spend traveling? ");

        int NumberofDays = scaninput.nextInt();

        System.out.print("How much money, in USD, are will you spend on this trip: ");

        int MoneyinUSD = scaninput.nextInt();

        System.out.print("What currency will you use when travel destination? ");

        String UsingCurrrency = scaninput.next();

        System.out.print("How many " + UsingCurrrency + " are there in 1 USD? ");

        double CurrencyCoef = scaninput.nextDouble();

        System.out.println();


        double UsingUSDperDay = (MoneyinUSD / NumberofDays) * 10;
        UsingUSDperDay = (int) UsingUSDperDay;
        UsingUSDperDay = UsingUSDperDay / 10;


        double UsingConvertedMoneyPerDay = ((MoneyinUSD * CurrencyCoef) / NumberofDays) * 100;
        UsingConvertedMoneyPerDay = (int) UsingConvertedMoneyPerDay;
        UsingConvertedMoneyPerDay /= 100;


        double UsinginCurrencyMoney = MoneyinUSD * CurrencyCoef;


        System.out.println("If you want traveling for " + NumberofDays + " days that is same as " + NumberofDays * 24 + " hours or " + NumberofDays * 24 * 60 + " minutes or " + NumberofDays * 24 * 60 * 60 + " seconds.");

        System.out.println("If you are going to spend $" + MoneyinUSD + " USD that means per day you can spend up to $" + UsingUSDperDay + " USD");

        System.out.println("Your total budget in " + UsingCurrrency + " is " + UsinginCurrencyMoney + " " + UsingCurrrency + ", which per day is " + UsingConvertedMoneyPerDay + " " + UsingCurrrency);

    }


    public static void TD() {

        System.out.print("Time difference, in hours, between your home and your destination is: ");

        int TimeDiff = scaninput.nextInt();
        int TimeDiffNoon = TimeDiff + 12;

        if (TimeDiff < 0) TimeDiff += 24;

        if (TimeDiff >= 24) TimeDiff = TimeDiff % 24;
        if (TimeDiffNoon >= 24) TimeDiffNoon = TimeDiffNoon % 24;

        System.out.print("That means that when it is midnight at home it will be " + TimeDiff + ":00 in your travel destination and when it's noon at home it will be " + TimeDiffNoon + ":00");

    }


    public static void CA() {

        System.out.print("What is square area of your destination country in km^2? ");

        double Squarekm2 = scaninput.nextDouble();
        double Squaremiles2 = Squarekm2 * 0.38610215854245;

        int temp = (int) (Squaremiles2 * 100);
        String tempu = String.valueOf(temp);
        int len = tempu.length();
        String rounded = tempu.substring(0, (len - 2)) + "." + tempu.substring(len - 2);

        System.out.println("In miles^2 that is " + rounded);

    }


    public static void ND() {

        System.out.print("How many places you traveled to : ");

        int NumerofPlaces = scaninput.nextInt();

        String[] TraveledCounries = new String[NumerofPlaces];

        for (int i = 0; i < TraveledCounries.length; i++) {
            System.out.print("Enter the name: ");
            TraveledCounries[i] = scaninput.next();
        }

        System.out.println("Next place you want to travel to : ");
        String[] WantesCountries = {"South Korea", "USA", "Japan", "Turkey", "UK", "China"};
        for (int i = 0; i < WantesCountries.length; i++) {
            System.out.println(i + ": " + WantesCountries[i]);
        }

        System.out.print("Your input should be -> ");
        int NextPlace = scaninput.nextInt();
        System.out.println("Thank you, Your next location is: " + WantesCountries[NextPlace]);
    }


    public static void main(String[] args) {
        G();
        TTaB();
        TD();
        CA();
        ND();
    }

}
