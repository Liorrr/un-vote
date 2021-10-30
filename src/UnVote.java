import java.util.Scanner;

public class UnVote {
    public static void main(String[] args) {
        String country = "";
        int vFor = 0, vAgainst = 0, vAbstain = 0, vVeto = 0, vote = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("We're about to start the vote... each country should write down it's name followed by a vote code." +
                "\n The vote code are as followed:\n1 - For\n2 - Against\n3 - Abstain\n4- Veto\n\nNone valid vote will be counted as abstained vote");

        for (int i = 1; i < 11; i++) {
            System.out.println(".\n.\nVote #" + i + " is ready, please enter country name followed by vote code");
            country = scanner.next();
            vote = scanner.nextInt();
            if (vote == 4) {
                vVeto++;
                break;
            } else if (vote == 1) {
                vFor++;
                continue;
            } else if (vote == 2) {
                vAgainst++;
                continue;
            } else {
                vAbstain++;
            }
        }
        if (vVeto > 0) {
            System.out.println("Vote have stopped due to veto use by " + country);
        } else if (vFor > vAgainst) {
            System.out.println("Vote successfully passed with the following votes:\nFor - " + vFor + "\nAgainst - " + vAgainst + "\nAbstain - " + vAbstain + "\nVeto - " + vVeto);
        } else {
            System.out.println("Vote did not passed with the following votes:\nFor - " + vFor + "\nAgainst - " + vAgainst + "\nAbstain - " + vAbstain + "\nVeto - " + vVeto);
        }
    }
}
