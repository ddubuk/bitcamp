package step22.ex9;

import java.io.Serializable;

public class Score implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // 인스턴스 변수의 구분
    // => name, kor, eng, math는 사용자가 입력한 값을 저장하는 변수이다.
    String name;
    int kor;
    int eng;
    int math;
    
    // => sum, aver는 위의 변수를 계산해서 그 결과를 저장하는 변수이다.
    // 이렇게 다른 인스턴스 변수의 값을 가지고 계산한 결과를 저장하는 변수인 경우
    // serialize 대상에서 제외해야 한다.
    // 왜? 값의 왜곡을 막기 위함이다.
    // => sum과 aver는 어떻게 처리해야 하는가?
    //    serialize 데이터를 읽는 쪽에서 데이터를 다 읽은 후 계산을 수행해서 값을 처리해야 한다.
    transient int sum;
    transient float aver;
    
    public Score() {
        System.out.println("Score()");
    }
    
    public void coumpute() {
        this.sum = this.kor + this.eng + this.math ;
        this.aver = this.sum / 3f; 
    }

    @Override
    public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", aver="
                + aver + "]";
    }
    
    
}
