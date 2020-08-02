
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] arg = input.split(" ");
            int numOfLiquid = Integer.valueOf(arg[1]);
            
            if (arg[0].equals("add")) {
              first.add(numOfLiquid);
            } else if (arg[0].equals("move")) {
              int auxiliar = first.contains();
              int contAuxiliar = 0;
              int auxiliarTwo = first.contains();
              for (int i = first.contains() - 1; i >= 0; i--) {
               if (first.contains() > 0) {
                auxiliarTwo--;
                contAuxiliar++;
              }

            if (i == (auxiliar - numOfLiquid)) {
              break;
            }
          }

            first.setContains(auxiliarTwo);

            int auxOfSecond = second.contains();
            for (int i = 1; i <= 100; i++) {
              if (auxOfSecond < 100) {
                auxOfSecond++;
              }
              if (i == contAuxiliar) {
                break;
              }
            }
            second.setContains(auxOfSecond);
            } else if (arg[0].equals("remove")) {
            second.remove(numOfLiquid);
          }
          System.out.println();
        }
    }

}
