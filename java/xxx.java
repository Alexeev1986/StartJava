 System.out.println("\nЗадание №9 - Определение, является ли число счастливым");
        srcNum = 212411;
        int srcNum1 = srcNum;
        int num = 100000;
        int sumTopHalf = 0;
        int sumLowerHalf = 0;
        while (srcNum > 1000) {
            int digitLast = srcNum % 10;
            int digitFirst = (srcNum1 / num) % 10;
            sumLowerHalf += digitLast;
            sumTopHalf += digitFirst;
            srcNum /= 10;
            num /= 10;
        }
        System.out.println("sum of half lower digit = " + sumLowerHalf + "\nsum of half top digit = " + sumTopHalf);
        if (sumTopHalf == sumLowerHalf) {
            System.out.println(srcNum + " - is happy");
        } else {
            System.out.println(srcNum + " - is unhappy");
}