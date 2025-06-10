package practice;

public class SwitchExample {
    public static void main(String[] args) {

//TODO remember  info += parts
        int num = 5;
        String info = "";

        switch (num) {
            case 1:
                info = "Before artithmatic operation: " + num;

                num += num;
                info += "\nAfter artithmatic operation:" + num;
                break;
            case 5:
                info = "Before artithmatic operation: " + num;

                num *= num;
                info += "\nAfter artithmatic operation:" + num;
                break;

        }
        System.out.println(info);
    }
}
