// Autor: Henrique Brendon
// Data: 29/01/2023
import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        Calculater cal = new Calculater();
        int R;
        char S;

        do{

        
            System.out.println(" ---Calculater HB-Computing---");
            System.out.println();
            System.out.println("Press one of the options: ");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Multiplication tables");
            System.out.println("[5] Division");
            System.out.println("[6] Power");
            System.out.println("[7] Rooting");
            
           

            int E = sc.nextInt();
            if(E == 1 || E == 2 || E == 3 || E == 4 || E == 5 || E == 6 || E == 7){
                switch(E){
                    case 1:
                        System.out.println("Enter a number: ");
                        cal.setNum1(sc.nextInt());
                        System.out.println("Enter another number: ");
                        cal.setNum2(sc.nextInt());
                        R = cal.getNum1() + cal.getNum2();
                        System.out.println("The result of " + cal.getNum1() + " + " + cal.getNum2() + " = " + R);
                        break;
                    case 2:
                        System.out.println("Enter a number: ");
                        cal.setNum1(sc.nextInt());
                        System.out.println("Enter another number: ");
                        cal.setNum2(sc.nextInt());
                        R = cal.getNum1() - cal.getNum2();
                        System.out.println("The result of " + cal.getNum1() + " - " + cal.getNum2() + " = " + R);
                        break;
                    case 3:
                        System.out.println("Enter a number: ");
                        cal.setNum1(sc.nextInt());
                        System.out.println("Enter another number: ");
                        cal.setNum2(sc.nextInt());
                        R = cal.getNum1() * cal.getNum2();
                        System.out.println("The result of " + cal.getNum1() + " X " + cal.getNum2() + " = " + R);
                        break;
                    case 4:
                        System.out.println("Enter the table value: ");
                        cal.setNum1(sc.nextInt());
                        for(int i = 0; i<11; i++){
                            System.out.println(cal.getNum1() + " X " + i + " = "  + (cal.getNum1() * i));
                        }
                        break;
                    case 5:
                        System.out.println("Enter a number: ");
                        cal.setNum1(sc.nextInt());
                        System.out.println("Enter another number: ");
                        cal.setNum2(sc.nextInt());
                        R = cal.getNum1() / cal.getNum2();
                        System.out.println("The result of " + cal.getNum1() + " ÷ " + cal.getNum2() + " = " + R);
                        break;
                    case 6:
                        System.out.println("Enter the power value: ");
                        cal.setNum1(sc.nextInt());
                        System.out.println("Enter the exponent value: ");
                        cal.setNum2(sc.nextInt());
                        cal.setNum1((int)Math.pow(cal.getNum1(), cal.getNum2()));
                        System.out.println(cal.getNum1());
                        break;
                    case 7:
                        System.out.println("Digite the index : ");
                        cal.setNum1(sc.nextInt());
                        cal.setNum2((int)Math.sqrt(cal.getNum1()));
                        System.out.println("The square root of: " + cal.getNum1() + " = " + cal.getNum2());
                    default:
                }
            } else{
                System.out.println("Compilation error");
            }
            System.out.println("Deseja continuar? [S/N]");
            S = sc.next().charAt(0);
           
        }while(S == 's');
        System.out.println("Closin program...");
    sc.close();
    }
}
