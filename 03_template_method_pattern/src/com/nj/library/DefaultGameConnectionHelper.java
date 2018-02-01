package com.nj.library;

public class DefaultGameConnectionHelper extends AbstGameConnectionHelper {
  @Override
  protected String doSecurity(String string) {
    System.out.println("강화된 알고리즘 적용");
    System.out.println("디코드");
    return string;
  }

  @Override
  protected boolean authentication(String id, String password) {
    System.out.println("아이디/암호 확인 과정");
    return true;
  }

  @Override
  protected int authorization(String userName) {
    System.out.println("유저의 나이, 현재 시간 확인 후 10시 이후면 접속 불가");
    return -1;
  }

  @Override
  protected String connection(String info) {
    System.out.println("마지막 접속 단계");
    return info;
  }

  @Override
  public String requestConnection(String encodedInfo) {
    return super.requestConnection(encodedInfo);
  }
}
