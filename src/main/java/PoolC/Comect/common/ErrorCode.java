package PoolC.Comect.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.function.Supplier;

@Getter
@AllArgsConstructor
public enum ErrorCode{

    MEMBER_NOT_FOUND(HttpStatus.BAD_REQUEST, "이메일이 존재하지 않음"),
    EMAIL_NOT_VALID(HttpStatus.BAD_REQUEST,"이메일 형식이 잘못됨"),
    PATH_NOT_VALID(HttpStatus.NOT_FOUND,"경로가 유효하지 않음"),

    //member
    COOKIE_ROTTEN(HttpStatus.UNAUTHORIZED,"쿠키가 유효하지 않음"),
    LOGIN_FAIL(HttpStatus.NOT_FOUND,"로그인 실패"),
    EMAIL_EXISTS(HttpStatus.FORBIDDEN,"이미 존재하는 이메일"),
    REQUEST_EXIST(HttpStatus.BAD_REQUEST,"이미 존재하는 요청"),
    REQUEST_NOT_FOUND(HttpStatus.NOT_FOUND,"요청을 찾을 수 없습니다"),
    NICKNAME_EXISTS(HttpStatus.FORBIDDEN,"이미 존재하는 닉네임");




    private final HttpStatus httpStatus;
    private final String detail;

}
