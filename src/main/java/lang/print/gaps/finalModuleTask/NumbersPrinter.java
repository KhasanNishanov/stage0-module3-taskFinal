package lang.print.gaps.finalModuleTask;

public class NumbersPrinter { //3
    public void printIsPositive(int number) {
        boolean check;
         if(number>0 && number<=99){
             check = true;
             System.out.println(check);
         }
         else if(number<=0){
             check = false;
             System.out.println(check);
         }
         else {
             check = false;
             System.out.println(check);
         }


    }

    public static void main(String[] args) {
        NumbersPrinter numbersPrinter = new NumbersPrinter();
        numbersPrinter.printIsPositive(0);
    }
}
