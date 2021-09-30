# java_ezen

## 2021.09.29


stack 영역과 heap 영역


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


  
