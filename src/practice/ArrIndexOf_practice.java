package practice;

public class ArrIndexOf_practice {
    public static void main(String[] args) {


        int [] number = {22,11, 10, 50};

        System.out.println(ArrIndexOf_pract(number, 22));


    }


    public static int ArrIndexOf_pract(int [] arr, int num) {
        int index = -1;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                index = i;
                break;
            }

        }

        return index;

    }
}
