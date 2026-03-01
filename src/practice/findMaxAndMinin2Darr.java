package practice;

public class findMaxAndMinin2Darr {

    public static void main(String[] args) {

        int [][] num = {{22, 33, 55},
                        {32, 51, 11, 10},
                        {8, 1, 100}

                        };

        int min = num [0][0];
        int max = num [0][0];


        for (int i = 0; i < num.length ; i++) {

            for (int j = 0; j < num[i].length ; j++) {

                int current = num [i][j];

               if (current < min) {
                   min = current;
               }
               if (current > max) {
                    max = current;
                }

            }


        }
        System.out.println(max);
        System.out.println(min);

    }
}
