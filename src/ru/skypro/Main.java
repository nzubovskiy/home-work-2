package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача №1
        var a = 555;
        byte b = 84;
        short c = 758;
        int d = 7_864;
        long e = 483L;
        float f = 5.6f;
        double g = 76.567;
        char h = 256;
        boolean i = a > 300;

        // Задача №2
        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        float totalWeight = boxer1Weight + boxer2Weight;
        float weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Общий вес двух бойцов: " + totalWeight + " кг");
        System.out.println("Разница между весами бойцов: " + weightDifference + " кг");

        // Задача №3
        int bananaWeight = 80;
        int bananas = 5;
        int milkWeight = 105;
        int milk = 200 / 100;
        int iceCreamWeight = 100;
        int iceCream = 2;
        int eggWeight = 70;
        int eggs = 4;
        int totalBreakfastWeight = bananaWeight * bananas + milkWeight * milk + iceCreamWeight * iceCream + eggWeight * eggs;
        int grPerKg = 1000;
        double breakfastWeightKg = totalBreakfastWeight / (double)grPerKg;
        System.out.println("Вес спорт-завтрака: " + breakfastWeightKg + " кг");

        // Задача №4
        int gramsPerKilogram = 1000;
        int needToLose = 7 * gramsPerKilogram;
        int weightLossOpt1 = 250;
        int weightLossOpt2 = 500;
        int numOfDurationOptions = 2;
        int durationOpt1 = needToLose / weightLossOpt1;
        int durationOpt2 = needToLose / weightLossOpt2;
        float averageDuration = (durationOpt1 + durationOpt2) / (float)numOfDurationOptions;
        System.out.println("На сброс 7 кг при потере 250 грамм в день уйдёт " + durationOpt1 + " дней");
        System.out.println("На сброс 7 кг при потере 500 грамм в день уйдёт " + durationOpt2 + " дней");
        System.out.println("На сброс 7 кг потребуется в среднем " + averageDuration + " дней");

        // Задача №5
        float salaryIncrease = 10f / 100;
        int currentSalaryMasha = 67_760;
        int currentSalaryDenis = 83_690;
        int currentSalaryKristina = 76_230;
        float newSalaryMasha = currentSalaryMasha * (1 + salaryIncrease);
        float newSalaryDenis = currentSalaryDenis * (1 + salaryIncrease);
        float newSalaryKristina = currentSalaryKristina * (1 + salaryIncrease);
        float annualSalaryIncreaseMasha = salaryIncrease * currentSalaryMasha * 12;
        float annualSalaryIncreaseDenis = salaryIncrease * currentSalaryDenis * 12;
        float annualSalaryIncreaseKristina = salaryIncrease * currentSalaryKristina * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + annualSalaryIncreaseMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + annualSalaryIncreaseDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + annualSalaryIncreaseKristina + " рублей.");


    }
}
