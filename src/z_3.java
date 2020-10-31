import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;

public class z_3 {
    public static void main(String args[]){
        Deque<Integer> player1=new LinkedList<>();
        Deque<Integer> player2=new LinkedList<>();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++){
            player1.offer(in.nextInt());
        }
        for(int i=0;i<5;i++){
            player2.offer(in.nextInt());
        }
        System.out.println(game(player1,player2));
    }

    private static String game(Deque<Integer> player1, Deque<Integer> player2) {
        int hod=0;
        int card1, card2;
        while(!(player1.isEmpty() || player2.isEmpty())){
            if(hod==107){
                break;
            }
            else {
                hod++;
                card1=player1.poll();
                card2=player2.poll();
                if ((card1 > card2) && !(card1==9 && card2==0)) {
                    player1.offer(card1);
                    player1.offer(card2);
                } else {
                    player2.offer(card1);
                    player2.offer(card2);
                }
            }
        }
        if(player1.isEmpty()){
            return "second "+hod;
        }
        else if(player2.isEmpty()){
            return "first "+hod;
        }
        else return "botva";
    }
}