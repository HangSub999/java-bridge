package bridge.view;

import bridge.model.Bridge;
import bridge.model.BridgeGame;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    public static void printgameStart() {
        System.out.println("다리 건너기 게임을 시작합니다\n");
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printMap(StringBuilder upline, StringBuilder downline) {
        System.out.println(upline + "\n" + downline);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printResult(BridgeGame bridgeGame, String success, int count) {
        System.out.println("\n최종 게임 결과");
        printMap(bridgeGame.upline(), bridgeGame.downline());
        System.out.println("\n게임 성공 여부: " + success);
        System.out.println("총 시도한 횟수: " + count);

    }
}
