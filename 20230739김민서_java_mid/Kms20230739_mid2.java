package proj;
import java.util.Scanner;
public class Kms20230739_mid2 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        // 사용자에게 첫 번째 선택 받기
		        System.out.println("가위바위보 하나 빼기 게임을 시작합니다.");
		        System.out.println("첫 번째 선택을 입력하세요: 가위, 바위, 보");
		        String firstChoice = getUserInput(scanner);
		        
		        // 사용자에게 두 번째 선택 받기
		        System.out.println("두 번째 선택을 입력하세요: 가위, 바위, 보");
		        String secondChoice = getUserInput(scanner);

		        // 사용자가 선택한 값이 올바른지 확인
		        while (!isValidChoice(firstChoice) || !isValidChoice(secondChoice)) {
		            System.out.println("잘못된 입력입니다. 다시 입력하세요: 가위, 바위, 보");
		            System.out.println("첫 번째 선택을 입력하세요: 가위, 바위, 보");
		            firstChoice = getUserInput(scanner);
		            System.out.println("두 번째 선택을 입력하세요: 가위, 바위, 보");
		            secondChoice = getUserInput(scanner);
		        }

		        // 하나의 선택 제거
		        System.out.println("제거할 선택을 입력하세요: " + firstChoice + " 또는 " + secondChoice);
		        String removeChoice = getUserInput(scanner);

		        // 제거할 선택이 올바른지 확인
		        while (!isValidChoice(removeChoice) || !removeChoice.equals(firstChoice) && !removeChoice.equals(secondChoice)) {
		            System.out.println("잘못된 입력입니다. 다시 입력하세요: " + firstChoice + " 또는 " + secondChoice);
		            removeChoice = getUserInput(scanner);
		        }

		        String finalChoice = removeChoice.equals(firstChoice) ? secondChoice : firstChoice;

		        // 상대방의 선택 (랜덤하게 선택 변경)
		        String[] opponentChoices = {"가위", "바위", "보"};
		        int randomIndex = (int) (Math.random() * opponentChoices.length);
		        String opponentFinalChoice = opponentChoices[randomIndex];

		        // 결과 결정
		        String result = determineWinner(finalChoice, opponentFinalChoice);
		        System.out.println("당신의 선택: " + finalChoice);
		        System.out.println("상대방의 선택: " + opponentFinalChoice);
		        System.out.println("결과: " + result);

		        scanner.close();
		    }

		    // 사용자 입력 받기
		    public static String getUserInput(Scanner scanner) {
		        return scanner.next();
		    }

		    // 선택 값 유효성 검사
		    public static boolean isValidChoice(String choice) {
		        return choice.equals("가위") || choice.equals("바위") || choice.equals("보");
		    }

		    // 승자 결정 
		    public static String determineWinner(String playerChoice, String opponentChoice) {
		        if (playerChoice.equals(opponentChoice)) {
		            return "무승부입니다!";
		        } else if ((playerChoice.equals("가위") && opponentChoice.equals("보")) ||
		                (playerChoice.equals("바위") && opponentChoice.equals("가위")) ||
		                (playerChoice.equals("보") && opponentChoice.equals("바위"))) {
		            return "당신이 이겼습니다!";
		        } else {
		            return "상대방이 이겼습니다!";
		        }
		    }

	}

