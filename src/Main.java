public class Main {
    public static void main(String[] args) {

        System.out.println("задание 1");
        int numberOfOranges = 35000;
        System.out.println("значение переменной numberOfOranges с типом int равно" + numberOfOranges);
        byte numberOfApples = 10;
        System.out.println("значение переменной numberOfApples с типом byte равно" + numberOfApples);
        short dogsCount = 7;
        System.out.println("значение переменной dogsCount с типом short равно " + dogsCount);
        long landArea = 134740000L;
        System.out.println("значение переменной landArea с типом long равно " + landArea);
        float pi = 3.14f;
        System.out.println("значение переменной pi с типом float равно " + pi);
        double a = 6.4;
        System.out.println("значение переменной a с типом double равно " + a);

        System.out.println("задание 2");
        float variable1 = 27.12f;
        System.out.println(variable1);
        long variable2 = 987678965549L;
        System.out.println(variable2);
        double variable3 = 2.786;
        System.out.println(variable3);
        boolean variable4 = false;
        System.out.println(variable4);
        char variable5 = 569;
        System.out.println(variable5);
        short variable6 = -159;
        System.out.println(variable6);
        int variable7 = 27897;
        System.out.println(variable7);
        byte variable8 = 67;
        System.out.println(variable8);

        System.out.println("задание 3");
        int educator1 = 23;
        int educator2 = 27;
        int educator3 = 30;
        int papersCount = 480;
        int papersPepPupil = papersCount / (educator1 + educator2 + educator3);
        System.out.println("на каждого ученика расчитано " + papersPepPupil+ " листов бумаги");

        System.out.println("задание 4");
        int bottles = 16;
        int minutes = 2;
        int outputPerMinute = bottles / minutes;
        int firstTimeInMinutes = 20;
        System.out.println("за "  + firstTimeInMinutes + " минут машина произвела бутылок " + outputPerMinute *  firstTimeInMinutes + " штук");
        int minutesInDay = 24*60;
        System.out.println("за " +minutesInDay + " минут машина произвела бутылок " +outputPerMinute * minutesInDay + " штук");
        int minutesInTreeDays = minutesInDay *3;
        System.out.println("за " + minutesInTreeDays + " минут машина произвела бутыло к"  + outputPerMinute *  minutesInTreeDays + " штук");
        int minutesInMonth = minutesInTreeDays *10;
        System.out.println("за " + minutesInMonth + " минут машина произвела бутылок " + outputPerMinute * minutesInMonth + " штук");


        System.out.println("задание 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * 2;
        int totalBrownCans = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses +   " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски ");

        System.out.println("задание 6");
        int bananaWeight = 80;
        int weightOfFiveBananas = bananaWeight * 5;
        int milk100ml = 105;
        int milk200ml = milk100ml *2;
        int iceCreamOneBriquette = 100;
        int iceCreamTwoBriquettes = iceCreamOneBriquette * 2;
        int oneEgg = 70;
        int fourEggs = oneEgg * 4;
        float totalBreakfastWeight = ( weightOfFiveBananas + milk200ml + iceCreamTwoBriquettes + fourEggs)/ 1_000f;
        System.out.println("общий вес спорт завтрака равен " + totalBreakfastWeight + " кг");

        System.out.println("задание 7");
        int kgPerGr = 1000;
        int resetTotal = 7 * kgPerGr;
        int weightLossOption1 = 250;
        int weightLossOption2 = 500;
        int daysOfVariant1 = resetTotal / weightLossOption1;
        System.out.println("если спортсмен будет терять по 250 гр в день, то ему потребуется " + daysOfVariant1 + " дней");
        int daysOfVariant2 = resetTotal / weightLossOption2;
        System.out.println("если спортсмен будет терять по 500 гр в день, то ему потребуется " + daysOfVariant2 + " дней ");
        int averageValue = (daysOfVariant1 + daysOfVariant2) /2;
        System.out.println("в среднем, чтобы добиться результата похудения может потребоваться " + averageValue + " день ");

        System.out.println(" задание 8");
        int masha = 67760;
        int annualSalaryBeforePromotion = masha * 12; // старая годовая зп
        int salaryIncrease = (masha * 10) / 100; //процент повышения
        int nowTheSalary = masha + salaryIncrease; //новая зп
        int annualSalary = nowTheSalary * 12; // новая зп за год
        int annualIncomeDifference = annualSalary - annualSalaryBeforePromotion;
        System.out.println(" Маша теперь получает " + nowTheSalary+ " рублей. Годовой доход вырос на " + annualIncomeDifference + " рублей ");

        int denis = 83690;
        int annualSalaryBeforePromotion1  = denis * 12; // старая зп годовая
        int salaryIncrease1 = (denis *10) / 100; //процент повышения
        int nowTheSalary1 = denis + salaryIncrease1; //новая зп
        int annualSalary1 = nowTheSalary1 * 12; // новая зп за год
        int annualIncomeDifference1 = annualSalary1 - annualSalaryBeforePromotion1;
        System.out.println("денис теперь получает " + nowTheSalary1 + " рублей. Годовой доход вырос на " + annualIncomeDifference1 + " рублей ");

        int kristina = 76230;
        int annualSalaryBeforePromotion2 = kristina * 12;
        int salaryIncrease2 = (kristina *10) / 100;
        int nowTheSalary2 = kristina + salaryIncrease2;
        int annualSalary2 = nowTheSalary2 * 12;
        int annualIncomeDifference2 = annualSalary2 - annualSalaryBeforePromotion2;
        System.out.println("кристина теперь получает " + nowTheSalary2 + " рублей. Годовой доход вырос на " + annualIncomeDifference2 + " рублей ");












    }
}