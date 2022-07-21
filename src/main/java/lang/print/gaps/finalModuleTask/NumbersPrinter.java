package lang.print.gaps.finalModuleTask;

public class NumbersPrinter { //3
    public void printIsPositive(int number) {
        boolean b = number > 0 && number <= 99;
        System.out.println(b);

    }

    public static void main(String[] args) {
        NumbersPrinter numbersPrinter = new NumbersPrinter();
        numbersPrinter.printIsPositive(100);
    }
}
