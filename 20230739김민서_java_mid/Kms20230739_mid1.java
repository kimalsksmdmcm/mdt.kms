package proj;
import java.util.Scanner;
import java.util.Random;
public class Kms20230739_mid1 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        String[] options = {"가위", "바위", "보"};

		        System.out.println("가위바위보 게임을 시작합니다.");
		        System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
		        System.out.print("당신의 선택: ");
		        String userChoice = scanner.next();

		        int computerIndex = random.nextInt(3);
		        String computerChoice = options[computerIndex];

		        System.out.println("상대방의 선택: " + computerChoice);

		        // 사용자와 컴퓨터의 선택이 같으면 무승부
		        if (userChoice.equals(computerChoice)) {
		            System.out.println("무승부입니다!");
		        }
		        // 사용자가 이기는 경우
		        else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
		                 (userChoice.equals("바위") && computerChoice.equals("가위")) ||
		                 (userChoice.equals("보") && computerChoice.equals("바위"))) {
		            System.out.println("당신이 이겼습니다!");
		        }
		        // 컴퓨터가 이기는 경우
		        else {
		            System.out.println("상대방이 이겼습니다!");
		        }

		        scanner.close();
		    }
		

	}
