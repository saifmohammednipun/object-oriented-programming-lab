public class AssignmentProblem2 {
        public static void main(String[] args) {
            int population =167288486;
            int minInYear=365*24*60;

            for(int j=2022;j<=2026;j++) {
                for(int i=1;i<=minInYear;i++) {
                    population =population+1;
                    if(i%2==0){
                        population =population-1;
                    }
                    if(i%8==0){
                        population = population - 1;
                    }
                }

                System.out.println("Population in year "+ j +": "+ population);

            }
        }

    }
