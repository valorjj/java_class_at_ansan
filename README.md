# java_ezen

## 2021.09.29

stack 영역과 heap 영역

<a href="https://imgur.com/XEiiO2t"><img src="https://i.imgur.com/XEiiO2t.png" title="source: imgur.com" /></a>
<a href="https://imgur.com/iInUiMo"><img src="https://i.imgur.com/iInUiMo.png" title="source: imgur.com" /></a>

<a href="https://imgur.com/Mzw0RIS"><img src="https://i.imgur.com/Mzw0RIS.jpg" title="source: imgur.com" /></a>

<a href="https://imgur.com/qpRR9cG"><img src="https://i.imgur.com/qpRR9cG.jpg" title="source: imgur.com" /></a>

<ul>Class Area == Method Area</ul>
  <li>Method area, Class area, Code area, Static Area</li>
  <li>클래스 정보, 변수 정보, 메소드 정보, static 변수, Constant Pool</li>
  <li>JVM 이 동작해서 클래스가 로딩될 때 생성</li>
<ul>Heap Area</ul>
  <li> <code>new</code> 키워드로 생성된 객체와 배열이 저장되는 영역</li>
  <li>Method Area에 로드된 클래스만 생성이 가능하다.</li>
  <li>GC의 주요 대상이 된다.(Stack, Class Area도 대상이 된다.)
  </li>
  <li>효율적인 GC를 위해 메모리 영역이 분리되어 있다.(Eden, Survivor1,2, Old)
  </li>
  <li>런타임시 할당된다</li>
