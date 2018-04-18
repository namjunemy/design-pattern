package com.nj.library;

public abstract class AbstGameConnectionHelper {
  protected abstract String doSecurity(String string);

  protected abstract boolean authentication(String id, String password);

  protected abstract int authorization(String userName);

  protected abstract String connection(String info);

  public String requestConnection(String encodedInfo) {
    String decodedInfo = doSecurity(encodedInfo);

    String id = "aaa";
    String password = "bbb";
    if (!authentication(id, password)) {
      throw new Error("아이디 암호 불일치");
    }

    String userName = "userName";
    int i = authorization(userName);

    switch (i) {
      case -1:
        System.out.println("셧다운 유저");
        break;
      case 0:
        System.out.println("게임 매니저");
        break;
      case 1:
        System.out.println("유료 회원");
        break;
      case 2:
        System.out.println("무료 회원");
        break;
      case 3:
        System.out.println("권한 없음");
        break;
      default:
        System.out.println("기타 경우");
        break;

    }
    return connection(decodedInfo);
  }
}
