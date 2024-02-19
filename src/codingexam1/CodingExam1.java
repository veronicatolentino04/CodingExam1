package codingexam1;
import java.util.*;

public class CodingExam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String q1 = 
            "You went to a party last night and when you arriverd to school the next day, " + "\r\n"
                + "everybody is talking about something you didn't do. What will you do?";
        String q2 = "What quality you excel the most?";
        String q3 = "You are walking down the street when you see an old lady trying to cross, " + "\r\n"
                + "what will you do?";
        String q4 = "You had a very difficult day at school, you will maintain ___ attitude";
        String q5 = "You are at a party and a friend of yours comes over and offers you drink, " + "\r\n"
                + "what do you do?";
        String q6 = "You just started in a new school, you will...";
        String q7 = "In a trypical Friday, you would like to...";
        String q8 = "Your relationship with your parents is...";
        
        String r1 = "Empathy. You are empathetic. You see yourself in someone else's situation "
                + "\r\n" + "before doing rash decisions. You tend to listen to other's voices.";
        String r2 = "Self-Awareness. You are concious of your own character, feelings, motives "
                + "\r\n" + "and desires. The process can be painful but it leads to greater "
                + "\r\n" + "self-awareness.";
        String r3 = "Self-Management. You manage yourself well. You take responsibility for your "
                + "\r\n" + "own behavior and well being.";
        
        String[] myQuestions = {q1, q2, q3, q4, q5, q6, q7, q8};
        
        Collections.shuffle(Arrays.asList(myQuestions));
        
        String[] answers = new String[myQuestions.length];
        
        for (int i = 0; i < myQuestions.length; i++) {
            String question = myQuestions[i];
            System.out.println(question);
            
            if (question.equals(q1)) {
                System.out.println("a. Avoid everything and go with your friends.");
                System.out.println("b. Go and talk with the person that started the rumor.");
                System.out.println("c. Go and talk with the teacher.");
            } else if (question.equals(q2)) {
                System.out.println("a. Empathy");
                System.out.println("b. Curiosity");
                System.out.println("c. Perseverance");
            } else if (question.equals(q3)) {
                System.out.println("a. Go and help her.");
                System.out.println("b. Go for a policeman and ask him to help.");
                System.out.println("c. Keep walking ahead.");
            } else if (question.equals(q4)) {
                System.out.println("a. Depends on the situation.");
                System.out.println("b. Positive");
                System.out.println("c. Negative");
            } else if (question.equals(q5)) {
                System.out.println("a. Say no thanks.");
                System.out.println("b. Drink it until it is finished.");
                System.out.println("c. Ignore him and get angry at him.");
            } else if (question.equals(q6)) {
                System.out.println("a. Go and talk with the person next to you.");
                System.out.println("b. Wait until someone comes over you.");
                System.out.println("c. Not talk to anyone.");
            } else if (question.equals(q7)) {
                System.out.println("a. Go out with your close friends to eat.");
                System.out.println("b. Go to a social club and meet more people.");
                System.out.println("c. Invite one of your friends to your house.");
            } else if (question.equals(q8)) {
                System.out.println("a. I like both equally.");
                System.out.println("b. I like both equally.");
                System.out.println("c. I like my Mom the most.");
            } 

            System.out.print("\u001B[32m" + "Answer: ");
            String answer = sc.nextLine();
            while (!answer.matches("[abc]")) {
                System.out.print("\u001B[31m");
                System.out.println("Please enter a valid answer.");
                System.out.print("\u001B[32m" + "Answer: ");
                answer = sc.nextLine();
            }            
            answers[i] = answer;
        }
        
        int countA = 0;
        for (String value : answers) {
            if (value.equals("a")) {
                countA++;
            }
        }
        
        int countB = 0;
        for (String value : answers) {
            if (value.equals("b")) {
                countB++;
            }
        }
        
        int countC = 0;
        for (String value : answers) {
            if (value.equals("c")) {
                countC++;
            }
        }
        
        int[] numbers = {countA, countB, countC};

        int maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        
        System.out.println("\u001B[32m" + "Result: ");
        if ((maxNumber == countA && maxNumber != countB && maxNumber != countC) || 
                (maxNumber == countA && maxNumber != countB && maxNumber == countC)) {
            System.out.println(r1);
        } else if ((maxNumber != countA && maxNumber == countB && maxNumber != countC) || 
                (maxNumber == countA && maxNumber == countB && maxNumber != countC)) {
            System.out.println(r2);
        } else if ((maxNumber != countA && maxNumber != countB && maxNumber == countC) || 
                (maxNumber != countA && maxNumber == countB && maxNumber == countC)) {
            System.out.println(r3);
        }
    }    
}
