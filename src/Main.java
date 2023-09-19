public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int w = 35000;
        System.out.println("Значение переменной w с типом int равно " + w);
        byte b = 15;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short k = 225;
        System.out.println("Значение переменной k с типом short равно " + k);
        long j = 2500000L;
        System.out.println("Значение переменной j с типом long равно " + j);
        float s = 2.25f;
        System.out.println("Значение переменной s с типом float равно " + s);
        double t = 7.55555555555555555;
        System.out.println("Значение переменной t с типом double равно " + t);

        System.out.println("Задача №2");
        float q = 27.12f;
        System.out.println("Значение переменной q с типом float равно " + q);
        long e = 987678965549L;
        System.out.println("Значение переменной e с типом long равно " + e);
        float y = 2.786f;
        System.out.println("Значение переменной y с типом float равно " + y);
        short u = 569;
        System.out.println("Значение переменной u с типом short равно " + u);
        short i = -159;
        System.out.println("Значение переменной i с типом short равно " + i);
        short o = 27897;
        System.out.println("Значение переменной o с типом short равно " + o);
        byte p = 67;
        System.out.println("Значение переменной p с типом byte равно " + p);

        System.out.println("Задача №3");
        short paper = 480;
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        int result  = paper / (classLP + classAS + classEA);
        System.out.println("На каждого ученика расчитано " + result + " листов бумаги");

        System.out.println("Задача №4");
        byte twoMinutes = 16;
        int oneMinute = twoMinutes / 2;
        int twentyMinutes = oneMinute * 20;
        System.out.println(" За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        int oneDay = oneMinute * 60 * 24;
        System.out.println(" За один день машина произвела " + oneDay + " штук бутылок");
        int threeDays = oneDay * 3;
        System.out.println(" За три дня машина произвела " + threeDays + " штук бутылок");
        int oneMonth = threeDays * 10;
        System.out.println(" За один месяц машина произвела " + oneMonth + " штук бутылок");

        System.out.println("Задача №5");
        byte classes = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int numberOfClasses = classes / (whiteColor + brownColor);
        int numberOfWhiteColor = numberOfClasses * whiteColor;
        int numberOfBrownColor = numberOfClasses * brownColor;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfWhiteColor + " банок белой краски и " + numberOfBrownColor + " банок коричневой краски");

        System.out.println("Задача №6");
        byte weightBanana = 80;
        byte weightMilk = 105;
        byte weightIcecream = 100;
        byte weightEgg = 70;
        float resultGram = weightBanana * 5 + weightMilk * 2 + weightIcecream * 2 + weightEgg * 4;
        float resultKilogram = resultGram / 1000;
        System.out.println("Вес спортзавтрака составляет " + resultGram + "г или " + resultKilogram + "кг");

        System.out.println("Задача №7");
        byte weightKilogram = 7;
        int weightGram = weightKilogram * 1000;
        int result250 = weightGram / 250;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм то похудеет за  " + result250 + " дней");
        int result500 = weightGram / 500;
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм то похудеет за  " + result500 + " дней");
        int avg = (result250 + result500) / 2;
        System.out.println("В среднем требуется дней для похудения - " + avg);

        System.out.println("Задача №8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        int newSalaryMasha = salaryMasha + (salaryMasha * 10 / 100);
        int yearMasha = (newSalaryMasha - salaryMasha) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearMasha + " рублей");
        int newSalaryDenis = salaryDenis + (salaryDenis * 10 / 100);
        int yearDenis = (newSalaryDenis - salaryDenis) *12;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearDenis + " рублей");
        int newSalaryChristina = salaryChristina + (salaryChristina * 10 / 100);
        int yearChristina = (newSalaryChristina - salaryChristina) *12;
        System.out.println("Кристина теперь получает " + newSalaryChristina + " рублей. Годовой доход вырос на " + yearChristina + " рублей");










    }
}