package ex3.controller;

import ex3.Ex3Application;
import ex3.dto.ResponseDto;
import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    public static ResponseDto<Map<String, Object>> homeController(String selectMenu) {
    ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
    try {
        if ("1".equals(selectMenu)) {
            RouterPath.current = Routes.ACCOUNT.name();

        } else if ("2".equals(selectMenu)) {
            RouterPath.current = Routes.DEPOSIT.name();

        } else if ("3".equals(selectMenu)) {
            RouterPath.current = Routes.WITHDRAWAL.name();

        } else if ("4".equals(selectMenu)) {
            RouterPath.current = Routes.MONEY.name();

        } else if ("5".equals(selectMenu)) {
            RouterPath.current = Routes.LIST.name();

        } else if ("6".equals(selectMenu)) {
            RouterPath.current = Routes.HISTORY.name();

        } else if ("q".equals(selectMenu)) {
            Ex3Application.running = false;
        } else {
            System.out.println("다시 입력해주세요.");
        }
    } catch (RuntimeException e) {
        Map<String, Object> errorMap = Map.of("message", e.getMessage());
        responseDto = new ResponseDto<>(400, errorMap);
    } return responseDto;


    }
}
