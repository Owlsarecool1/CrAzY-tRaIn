//Dennis Livshyts
//018129928
//Cecs 274 - section:5
//Program 5 - cRaZyTrAiN
//due:11/21/2019



import java.util.Scanner;
public class cRazytRain {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);

        while(true) {
            Queue A_trai= new Queue();
            Queue orig_A_trai=new Queue();
            Queue B_trai=new Queue();
            Queue act=new Queue();
            Stack contain=new Stack();
            System.out.println("Welcome to CrAzY tRaIn");
            System.out.println("\tEnter the number of wagons: ");
            int cars = Integer.parseInt(in.nextLine());
            if (cars == 0) {
                System.out.println("bye");
                break;
            }
            System.out.print("\tEnter the order of the original train A:");
            String Atrai = in.nextLine();
            System.out.println("\tEnter the desired order of train B:");
            String Btrai = in.nextLine();
            String[] trainQueueA = Atrai.split(" ", cars);
            String[] trainQueueB = Btrai.split(" ", cars);

            for (int i = 0; i < trainQueueA.length; i++) {
                A_trai.enque(Integer.parseInt(trainQueueA[i]));
                orig_A_trai.enque(Integer.parseInt(trainQueueA[i]));
            }
            for (int i = 0; i < trainQueueB.length; i++) {
                B_trai.enque(Integer.parseInt(trainQueueB[i]));
            }
            int count = 0;
            while (true) {
                if (A_trai.isEmpty() == false && contain.isEmpty() == true) {
                    contain.push(A_trai.deque());
                }
                if (A_trai.isEmpty() == true && contain.isEmpty() == true) {
                    System.out.println("Congratulations, reconfigure successful.");
                    break;
                }
                if (contain.top() != Integer.parseInt(trainQueueB[count]) && A_trai.isEmpty() == true) {
                    System.out.println("Sorry, unable to rearrange. Reconfiguration is not possible.");
                    break;
                }
                if (contain.top() != Integer.parseInt(trainQueueB[count])) {
                    contain.push(A_trai.deque());
                }
                if (contain.top() == Integer.parseInt(trainQueueB[count])) {
                    act.enque(contain.pop());
                    count++;
                }
            }
            System.out.print("original-train A:");
            orig_A_trai.display();
            System.out.print("desired- train B:");
            B_trai.display();
            System.out.print("current:");
            act.display();
            System.out.println();
        }

    }
}
