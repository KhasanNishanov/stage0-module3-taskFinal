package lang.print.gaps.finalModuleTask;



public class NumberReverter { //4
    public void revert(int number) {
        int a;
        int b;
        while (number != 0) {
            a = (number % 10) * 100;
            number /= 10;
            b = (number % 10) * 10;
            number /= 10;
            System.out.println(a + b + number);
            break;

        }

    }


}
