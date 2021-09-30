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
출처: https://dogcowking.tistory.com/417 [dogcowking]
