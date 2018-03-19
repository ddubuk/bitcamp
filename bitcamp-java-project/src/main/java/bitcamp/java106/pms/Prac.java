package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        Team[] teams = new Team[1000];
        int teamIndex = 0;

        Member[] members = new Member[1000];
        int memberIndex = 0;

        while(true) {
        System.out.println("명령> ");
        String[] arr = keyScan.nextLine().toLowerCase().split(" ");
        String menu = arr[0];
        String option = null;
        if (arr.length == 2) {
            option = arr[1];
        }

            if(menu.equals("quit")) {
                System.out.println("안녕히 가세요!");
                break;
            } else if (menu.equals("help")) {
                System.out.println("[도움말]");
                System.out.println("팀 등록 명령: team/add");
                System.out.println("팀 조회 명령: team/list");
                System.out.println("팀 상세조회 명령: team/view");
                System.out.println("회원 등록 명령: member/add");
                System.out.println("회원 조회 명령: member/list");
                System.out.println("회원 상세조회 명령: member/view");
                System.out.println("quit");
                System.out.println();
            } else if (menu.equals("team/add")) {
                Team team = new Team();

                System.out.println("[팀 정보 입력]");
                System.out.println("팀명? ");
                team.name = keyScan.nextLine();
                System.out.println("설명? ");
                team.description = keyScan.nextLine();
                System.out.println("최대인원? ");
                team.maxQty = keyScan.nextInt();
                keyScan.nextLine();
                System.out.println("시작일? ");
                team.startDate = keyScan.nextLine();
                System.out.println("종료일? ");
                team.endDate = keyScan.nextLine();

                teams[teamIndex++] = team;

            } else if (menu.equals("team/list")) {
                System.out.println("[팀 목록]");
                for (int i = 0; i < teamIndex; i++) {
                System.out.printf("%s, %d, %s ~ %s",
                 teams[i].name, teams[i].maxQty, teams[i].startDate, teams[i].endDate);
                }
                System.out.println();
            } else if (menu.equals("team/view")) {
                System.out.println("[팀 정보 조회]");
                if (option == null) {
                    System.out.println("팀명을 입력하시기 바랍니다.");
                    continue;
                }
                Team team = null;
                for (int i = 0; i < teamIndex; i++) {
                    if (option.equals(teams[i].name)) {
                        team = teams[i];
                        break;
                    }
                }
                if (team == null) {
                    System.out.println("해당 이름의 팀이 없습니다.");
                } else {
                    System.out.printf("팀명: %s\n", team.name);
                    System.out.printf("설명: %s\n", team.description);
                    System.out.printf("최대인원: %d\n",team.maxQty);
                    System.out.printf("기간: %s ~ %s\n", team.startDate, team.endDate);
                }
            } else if (menu.equals("member/add")) {
                Member member = new Member();

                System.out.println("[회원 정보 입력]");
                System.out.println("아이디? ");
                member.id = keyScan.nextLine();
                System.out.println("이메일? ");
                member.email = keyScan.nextLine();
                System.out.println("암호? ");
                member.password = keyScan.nextLine();
                

                members[memberIndex++] = member;

            }
        }
    }
}