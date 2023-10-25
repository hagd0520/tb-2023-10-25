package com.ll;

class Main {
    public static void main(String[] args) {
        System.out.println("== 청둥오리객체 생성시작 ==");
        new 청둥오리();
        System.out.println("== 청둥오리객체 생성끝 ==");
		/* 출력
		== 청둥오리객체 생성시작 ==
		생물이 생성되었습니다.
		동물이 생성되었습니다.
		오리가 생성되었습니다.
		청둥오리 생성되었습니다.
		== 청둥오리객체 생성끝 ==
		*/
    }
}

class 생물 {
    String name;
    생물() {
        name = "생물";
        System.out.println(name + "이 생성되었습니다.");
    }
}
class 동물 extends 생물 {
    동물() {
        super();
        System.out.println("동물이 생성되었습니다.");
    }
}
class 오리 extends 동물 {
    오리() {
        super();
        System.out.println("오리가 생성되었습니다.");
    }
}
class 청둥오리 extends 오리 {
    청둥오리() {
        super();
        System.out.println("청둥오리가 생성되었습니다.");
    }
}