import java.util.Scanner;
import java.util.Stack;

public class z_1 {

    public static void main(String args[]){
        Stack<Integer> player1=new Stack<>();
        Stack<Integer> player2=new Stack<>();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++){
            player1.push(in.nextInt());
        }
        for(int i=0;i<5;i++){
            player2.push(in.nextInt());
        }
        System.out.println(game(player1,player2));
    }

    private static String game(Stack<Integer> player1, Stack<Integer> player2) {
        int hod=0;
        while(!(player1.empty() || player2.empty())){
            if(hod==107){
                break;
            }
            else {
                hod++;
                if ((player1.get(player1.size() - 1) > player2.get(player2.size() - 1)) && !(player1.get(player1.size() - 1)==9 && player2.get(player2.size() - 1)==0)) {
                    player1.add(0, player1.pop());
                    player1.add(0, player2.pop());
                } else {
                    player2.add(0, player1.pop());
                    player2.add(0, player2.pop());
                }
            }
        }
        if(player1.empty()){
            return "second "+hod;
        }
        else if(player2.empty()){
            return "first "+hod;
        }
        else return "botva";
    }
}
