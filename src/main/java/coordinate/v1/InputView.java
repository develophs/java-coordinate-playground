package coordinate.v1;

import java.util.Scanner;

public class InputView {

    public String input() {
        System.out.println("좌표를 입력하세요.");
        return new Scanner(System.in).nextLine();
    }
}
