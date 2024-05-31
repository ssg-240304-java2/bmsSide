package com.side.bms.view;

import com.side.bms.controller.InventoryController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainView {
    Scanner sc = new Scanner(System.in);
    private InventoryController inventoryController = new InventoryController();

    /***
     * 메인 메뉴 뷰
     */
    public void mainView() {
        while (true) {
            int menuNum = 0;
            System.out.println("""
                    ========================
                    메 인 메 뉴
                    ========================
                    1. 로그인
                    2. 회원가입
                    9. 프로그램 종료
                    """);
            try {
                System.out.print("메뉴번호를 입력하세요 : ");
                menuNum = sc.nextInt();

                if (menuNum < 0) {
                    System.out.println("정수를 입력해주세요.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("정수를 입력해주세요.");
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("입력 오류가 발생했습니다.");
            }
            switch (menuNum) {
                case 1:
                    adminView();
                    break;
                case 2:
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴 번호를 잘못입력하셨습니다.");
                    break;
            }
        }

    }

    // 재고 관리 관리자 뷰
    private void adminView() {
        while (true) {
            int menuNum = 0;
            System.out.println("""
                    ========================
                    관 리 자 메 뉴
                    ========================
                    1. 재고 조회
                    2. 재고 입고
                    3. 재고 출고
                    4. 재고 이동
                    9. 로그아웃
                    """);
            try {
                System.out.print("메뉴번호를 입력하세요 : ");
                menuNum = sc.nextInt();

                if (menuNum < 0) {
                    System.out.println("정수를 입력해주세요.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("정수를 입력해주세요.");
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("입력 오류가 발생했습니다.");
            }
            switch (menuNum) {
                case 1:
                    searchInventoryView();
                    break;
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 9:
                    System.out.println("로그아웃 합니다.");
                    return;
                default:
                    System.out.println("메뉴 번호를 잘못입력하셨습니다.");
                    break;
            }
        }
    }

    // 재고 조회 뷰
    private void searchInventoryView() {
        while (true) {
            int menuNum = 0;

            System.out.println("""
                    ========================
                    재 고 조 회 메 뉴
                    ========================
                    1. 도서별 재고조회
                    2. 창고별 재고 조회
                    3. 도서 전체조회
                    9. 이전메뉴
                    """);
            try {
                System.out.print("메뉴번호를 입력하세요 : ");
                menuNum = sc.nextInt();

                if (menuNum < 0) {
                    System.out.println("정수를 입력해주세요.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("정수를 입력해주세요.");
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("입력 오류가 발생했습니다.");
            }
            switch (menuNum) {
                case 1:
                    inventoryController.selectBookQuantity();
                    break;
                case 2:
                    System.out.println("""
                            =========================
                            창 고 별 재 고 조 회
                            =========================
                            """);
                    System.out.println("[창고1 | 창고2 | 창고3]");
                    System.out.print("조회하실 창고이름을 입력하세요 : ");
                    sc.nextLine();
                    inventoryController.selectLocationQuantity(inputLocation());

                    break;
                case 9:
                    System.out.println("이전메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("메뉴 번호를 잘못입력하셨습니다.");
            }
        }
    }


    private String inputLocation() {
        String locationName = sc.nextLine();
        return locationName;
    }

}