public class exp6 {
    public static void main (String[] args){
        double SoldMonthly = 13025.233;
        double RentMonthly = 5123.018;
        double CostOfProduction = 9001.729;
        double SoldYear = SoldMonthly * 12;
        double RentYear = RentMonthly * 12;
        double CostOfProductionYear = CostOfProduction * 12;
        double ProfitYear = SoldYear - (RentYear + CostOfProductionYear);
        if(ProfitYear > 0){
            System.out.println("Прибыль за год: +" + ProfitYear);
        }else{
            System.out.println("Прибыль за год: " + ProfitYear);
        }
    }
}