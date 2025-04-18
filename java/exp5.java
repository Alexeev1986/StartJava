public class exp5 {
    public static void main (String[] args){
        float PrFinalScore1 = 59;
        float PrFinalScore2 = 92;
        short Score1 = 0;
        short Score2 = 0;
        if(PrFinalScore1 <= 60){
            Score1 = 2;
        }else if(PrFinalScore1 > 60 & PrFinalScore1 <= 73){ 
            Score1 = 3;
        }else if(PrFinalScore1 > 73 & PrFinalScore1 <= 91){
            Score1 = 4;
        }else if(PrFinalScore1 > 91){
            Score1 = 5;
        }
        if(PrFinalScore2 <= 60){
            Score2 = 2;
        }else if(PrFinalScore2 > 60 & PrFinalScore2 <= 73){ 
            Score2 = 3;
        }else if(PrFinalScore2 > 73 & PrFinalScore2 <= 91){
            Score2 = 4;
        }else if(PrFinalScore2 > 91){
            Score2 = 5;
        }
        System.out.println("История(" + PrFinalScore1 + ") оценка - " + Score1);
        System.out.println("Программирование(" + PrFinalScore2 + ") оценка - " + Score2);
        float AvarageScore = (Score1 + Score2) / 2;
        System.out.println("Средний балл по предметам = " + Math.round(AvarageScore));
        float AvaregePr = (PrFinalScore1 + PrFinalScore2) /2;
        System.out.println("Средний процент по предметам = " + AvaregePr + "%");
    }
}