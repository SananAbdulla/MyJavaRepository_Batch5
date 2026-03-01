package practice;

public class ArrIndexOf_pract {

    public static void main(String[] args) {


        String str = "Azerbaijan";
        System.out.println(str.indexOf('A'));

        int [] nums = {22, 44, 55, 15};
        String [] words = {"Fuck", "You", "fukOff"};



        System.out.println(ArrIndexOf(nums, 55));
        System.out.println("-----------");
        System.out.println(ArrIndexOf(words, "fukOff"));
        System.out.println("---------");

        System.out.println(ArrIndexOf2(nums, 44));

    }

    public static int ArrIndexOf (int [] arr, int num) {
        int index =-1;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == num) {
                index = i;
                break;
            }

        }

        return index;
    }

    public static int ArrIndexOf (String [] arr, String str) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(str)) {
                index = i;
                break;
            }

        }


        return index;
    }



    public static int ArrIndexOf2 (int [] arr, int num) {

        int index = -1;
        int currentIndex = 0;


        for   (int each  : arr) {

                 if (each == num) {
                     index = currentIndex;
                     break;
                 }
                 currentIndex++;
        }


        return index;
    }


    }
