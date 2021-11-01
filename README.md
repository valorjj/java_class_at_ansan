# java_ezen

## 2021.09.29


### stack 영역과 heap 영역


>Class Area == Method Area


  Method area, Class area, Code area, Static Area
  클래스 정보, 변수 정보, 메소드 정보, static 변수, Constant Pool
  JVM 이 동작해서 클래스가 로딩될 때 생성
  
>Heap Area


  ```new``` 키워드로 생성된 객체와 배열이 저장되는 영역
  Method Area에 로드된 클래스만 생성이 가능하다.
  GC의 주요 대상이 된다.(Stack, Class Area도 대상이 된다.)
  효율적인 GC를 위해 메모리 영역이 분리되어 있다.(Eden, Survivor1,2, Old)
  런타임시 할당된다

>Stack Area

  역변수, 파라미터, 리턴값, 연산에 사용되는 임시값 등이 생성되는 영역
  method 를 호출할 때마다 개별적으로 스택이 생성되며 종료시 영역에서 해제된다
  compile 시 할당된다


## 09.30

[stack 과 heep 메모리 자세한 설명 링크] (https://yaboong.github.io/java/2018/05/26/java-memory-management/)

[![text](https://i.imgur.com/Ycf4Zdm.png)]

```
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listArgument = new ArrayList<>();
        listArgument.add("yaboong");
        listArgument.add("github");

        print(listArgument);
    }

    private static void print(List<String> listParam) {
        String value = listParam.get(0);
        listParam.add("io");
        System.out.println(value);
    }
}
```

```Primitive``` 타입을 제외하고 자주 쓰는 Set, List 는 ```Heap``` 영역에 저장된다. 

[![text](https://i.imgur.com/3POGNfa.png)]

지금까지의 내용을 살펴보면 다음의 코드의 결과는 20으로 예측된다.
```
public class Main {
    public static void main(String[] args) {
        Integer a = 10;
        System.out.println("Before: " + a);
        changeInteger(a);
        System.out.println("After: " + a);
    }

    public static void changeInteger(Integer param) {
        param += 10;
    }
}
```

* 하지만 결과는 10 그대로이다! ``` Integer a = 10;``` 에서 10 은 ```Heap``` 영역에 할당되고, 10을 가리키는 reference var ```a``` 가 ```Stack``` 에 할당된다. 
* 함수에 인자를 넘겨줄 때, parameter 는 copied value 를 넘겨받는다. 
* ```changeInteger(a)``` 에 의해서, ```param``` 이라는 레퍼런스 변수가 스택에 할당되고, ```param``` 은 ```main()``` 에서 ```a``` 를 가리키던 곳을 똑같이 가리키고 있다. 


하지만 Java 에서 ```Wrapper Class``` 에 해당하는 ```Integer``` ```Character``` ```Byte``` ```Boolean``` ```Long``` ```Double``` ```Float``` ```Short``` 클래스는 모드 *Immutable* 이다. 그래서 ```Heap``` 에 있는 같은 Object 를 레퍼런스 하고 있는 경우라도, 새로운 연산이 적용되는 순간 새로운 오브젝트가 ```Heap``` 에 _새롭게 할당된다._


[[GIHUB 문제 해결 완전판](https://dogcowking.tistory.com/417)]

* 상황 1 : commit 충돌로 인한 오류
1. 다른 User 가 (remote)origin/master 에 수정 commit
2. 이 commit 을 pull 하기 전에 내가 같은 브랜치에 수정
3. pull 하지 않은 상태 에서 commit 하면 오류 발생함. (rejected non-fast-forward)

* 상황 2 : 하지만 상대방의 commit이 내 commit 과 충돌한다면? 
내 commit#1 
상대 commit#2 & push (#1 과 conflict 되는... )
내 commit #3 #2과 conflict 되는...)

(이전에는 #2와 #3 이 conflict 되지 않는 상황이었음 )

=> Result Conflicting 메시지 발생함..
pull 하면 
Cannot pull into a repository with state: MERGING 

메시지 보이며 오류 남.

- https://soye0n.tistory.com/128
merge 하라고 하지만
우클릭>Team 들어갔으나 Merge 는 disabled 되어있음.
=> 하지만 충돌 표시(빨간색 양방향화살표) 되어있는 파일 개별로는 우클릭>merge Tool 사용 가능함.

Synchronize 화면에서도 Merge tool 메뉴 표시됨.
파일 내용 비교하며 수정 한 후 해당 파일 > 우클릭 > Add to index 하고
merge 에 대한 commit 가능함. 

Commit 메시지는 자동으로 생성

Merge branch 'master' of http://192.168.0.120:7070/user04/gittest.git

Conflicts:
src/Test1.java

Merge branch 'master' of http://192.168.0.120:7070/user04/gittest.git Conflicts: src/Test1.java 

- 이 후 commit & push 하면 기존 충돌했던 commit 까지 모두 해결됨



출처: https://dogcowking.tistory.com/417 [dogcowking]

## 2021.10.06 

### Class VS Object

> 클래스는 ```설계도```, 객체는 설계도로 구현한 모든 대상 



### Object vs Instance

> 클래스 타입으로 선언됐을 때 ```객체``` 라고 부르고, 그 객체가 메모리에 할당되어 실제 사용될 떄 ```인스턴스``` 라고 부른다.

### Instance 란 무엇인가 

- 설계도를 바탕으로 소프트웨어 세계게 구현된 구체적인 실체
  - 실체화된 인스턴스는 메모리에 할당된다. 
- 특징
  - 인스턴스는 객체에 포함된다고 볼 수 있다. 
  - oop 관점에서 객체가 메모리에 할당되어 실제 사용될 때, ```인스턴스``` 라고 ㅂ른다.
  - 추상적인 개념과 구체적인 객체 사이의 관계에 초점을 맞출 경우에 사용한다.
    * 객체는 클래스의 인스턴스이다. 
    * 객체간의 링크는 클래스간의 연관 관계의 인스턴스이다.
    * 실행 프로세스는 프로그램의 인스턴스이다.
  - 즉, 인스턴스라는 용어는 반드시 클래스, 객체 사이의 관계로 한정지어서 생각할 필요는 없다.
  - 인스턴스는 어떤 원본(추상적인 개념)으로부터 ```생성된 복제본```을 의미한다. 


```
/* 클래스 */
public class Animal {
  ...
}
/* 객체와 인스턴스 */
public class Main {
  public static void main(String[] args) {
    Animal cat, dog; // '객체'

    // 인스턴스화
    cat = new Animal(); // cat은 Animal 클래스의 '인스턴스'(객체를 메모리에 할당)
    dog = new Animal(); // dog은 Animal 클래스의 '인스턴스'(객체를 메모리에 할당)
  }
}
https://gmlwjd9405.github.io/2018/09/17/class-object-instance.html

```

### Process 란 무엇일까?

> 프로그램은 생명이 없다. 보조기억장치에 실행되기를 기다리는 명령어와 정적인 데이터 묶음이다. 

명령어와 정적 데이터가 메모리에 적재되야 비로소 프로세스라고 부른다. 즉 프로세스란 `실행중인 프로그램`

`프로세스` 는 프로세스 제어블록(PCB, Process Control Block) 또는 프로세스 기술자(Process Descriptor) 라고 부르는 자료구조에 저장된다. 대부분 `PCB` 라고 부른다.

* PID 
> 운영체제가 각 프로세스를 식별하기 위해 부여된 프로세스 식별번호(Process Identification) 

* 프로세스의 상태
> CPU 는 프로세스를 빠르게 교체하면서 실행하기 때문에 실행중인 프로세스, 대기중인 프로세스 등의 상태를 저장

* 프로그램 카운터
> CPU 가 다음으로 실행할 명령어. CPU 는 기계어를 한 단위씩 읽어서 처리하는데, 프로세스를 실행하기 위해서 `다음으로 실행할 기계어가 저장된 메모리 주소`를 가리키는 값

* 스케줄링 우선순위
> 운영체제는 여러개의 `프로세스`를 동시에 실행하는 환상을 제공한다. 운영체제가 여러개의 프로세스 중에서 cpu 에서 실행되는 순서를 결정한다. 

* 권한
> 프로세스가 접근할 수 있는 자원을 결정하는 정보. 프로세스마다 어디까지 접근할 수 있는지에 대한 권한을 설정할 수 있다. 

* 프로세스의 부모 / 자식 프로세스 
> 최초로 생성되는 init 프로세스를 제외하고, 모든 프로세스는 부모 프로세스를 복제해서 생성되고 이 계층관계를 `트리` 를 형성합니다. 각 프로세스는 자식 프로세스, 부모 프로세스에 대한 정보를 가지고 있습니다. 

* 프로세스의 데이터, 명령어가 있는 메모리 위치를 가리키는 포인터
> 프로세스는 실행중인 프로그램이다. 따라서 프로그램에 대한 정보를 가지고 있어야한다. 프로그램에 대한 정보는 프로세스가 메모리에 가지는 자신만의 주소 공간에 저장된다. 이 공간에 대한 포인터 값을 가지고 있다. 

* 실행문맥
> 프로세스가 실행상태에서 마지막으로 실행한 프로세서의 레지스터 내용을 담고 있다. cpu 에 의해 실행되는 프로세스는 운영체제에 의해 계촉 교체되는데, 교체되었따가 다시 자신의 차례가 되어서 실행될 때 연속적으로 실행된 것 처럼 하기 위해서 이 레지스터 정보를 가지고 있다. 

[(about process) https://bowbowbow.tistory.com/16]

##### 인터페이스는 왜 사용하는가

* 서로 다른 클래스들의 동일한 기능을 수행 목적
* 상수 : static, final
* 추상메소드 : 선언 O, 구현 X
* 디폴트메소드 : 

#### JAVA 메모리 구조 

- Class Area = Method Area
- Stack Area
- Heap Area
- Native Method Stack Area
- PC Register

메소드 영억 : 클래스 파일의 `바이트 코드`가 로드되는 곳 
메소드 영역에 저장되는 바이트코드는 프로그램의 흐름을 구성하는 바이트 코드
