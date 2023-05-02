package Pack01;

public class test01 {
    public static void main(String[] args){
        
    }
}

/*
    ex01

    //boolean byte short char int long float double
    //    1     1    2    2    4    8    4     8
    System.out.println(123);
    byte test;
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Short.MIN_VALUE);
    System.out.println(Character.MIN_VALUE);
    Short.apple = new apple();
 */
/*
    ex02

    변수작명법 - 알아서
 */
/*
    ex03

    //type 변수 대입연산자 리터럴
    int apple = 100;
    //산술연산자 (+ = * / %)
    //어차피 나머지가 [0~122] 이 유효범위로 나옴
    System.out.println( 123333%123);
 */
/*
    ex04

    // +
    // 숫자 + 숫자 : 숫자
    // 숫자 + 문자열 : 문자열
    // 문자열 + 숫자 : 문자열
    // 문자열 + 문자열 : 문자열
    System.out.println(3+5);
    System.out.println(3+"호랑이");
    System.out.println("호랑이" + 5);
    System.out.println("호랑이" + "독수리");
    //8호랑이
    System.out.println(3+5+"호랑이");
    //호랑이35
    System.out.println("호랑이"+3+5);
 */
/*
    ex05

    int a = 0; //4
    short b = 20; //2

    a = b; //a=(int)b; 와 같음
    b = (short)a; //타입캐스팅

    short c = 66;
    char d = 'A'; //산술연산으로 사용X, 문자로 사용
    System.out.println(d); //아스키코드
    System.out.println((int)d); //A
    System.out.println((char)c); //66 (문자)

    for(int i=0; i<26; i++){
        //코드의 가독성이 떨어짐
        System.out.println((char)(65+i));
        //가독성 개선
        System.out.println((char)('A'+i));
    }

    char e = '한';
    System.out.println((int)e); //한의 유니코드
    System.out.println((char)(e+1)); //한 다음의 유니코드 확인 (핝)
 */
/*
    ex06

    int a = 10, b = 20;
    System.out.println(a+" "+b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println(a+" "+b);
 */
/*
    ex07

    // > < >= <= == !=
    System.out.println(3!=3);
 */
/*
    ex08

    //2진수 10진수 16진수 상호변환
    System.out.println(10); //10진수
    System.out.println(0x10); //16진수
    System.out.println(010); //8진수

    //0x13ac
    //2진수로 얼마인가?
 */
/*
    ex09

    //2^8 = 256
    //2^10 = 1024
    //2^16 = 6xxxx (대충 6만)
    //2^32 = 40억 정도
    //2^64 = ?
 */
/*
    ex10

    float a = 6.25f;
    double b = 6.25;

    //부동 소숫점 float가 이진수로 저장된 결과값은?
    //확인해보시기 바랍니다~
 */
/*
    ex11

    // && || !
    System.out.println(false || false);
    System.out.println(false || true);
    System.out.println(true || false);
    System.out.println(true || true);

    System.out.println(true || true || false);

    System.out.println(true && true && false);

    //우선순위 명시적으로 나타냄 (가독성)
    System.out.println((true || true) && false);
    System.out.println(true || (true && false));
 */
/*
    ex12

    // for, while, if, switch
    // for, while 반복문 쓰는 기준
    // 반복 횟수를 알고 프로그램을 작성할 때는 for
    for(int i=0; i<10; i++){
        System.out.println(100);
    }
    // 반복 횟수를 모르고 프로그램을 작성할 때는 while
    // 우박수 알고리즘
    int n=52;
    while(true){
        if(n%2==0){
            n = n / 2;
        }else{
            n = n * 3 + 1;
        }

        if(n==1){
            System.out.println("탈출");
            break;
        }
    }
 */