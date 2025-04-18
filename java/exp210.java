public class exp210 {
    public static void main (String[] args){
        System.out.println("\t\t\t\tТАБЛИЦА     ПИВАГОРА   ");
        
        for (int i = 1; i < 10; i ++) {

            //System.out.printf("%12d", i);
            
            for(int j = 1; j < 10; j++) {

                if (j == 1 & i != 1){
                    System.out.printf("%9d", i * j);
                    System.out.printf("|");
                } else if ( i == 1 & j ==1) {
                    System.out.printf("%9s", " ");
                    System.out.printf("|");
                } else {
                    System.out.printf("%9d", i * j);
                }
                 if (i == 1 & j == 9) {
                    System.out.printf("%n\t");
                    for (int k = 1; k < 77; k++) System.out.printf("_");
                }
               
            }
                System.out.printf("%n");
        }
            
    }
}
