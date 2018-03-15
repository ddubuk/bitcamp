// 레퍼런스 배열과 반복문 결합
package step03;

public class Exam02_3 {
    public static void main(String[] args) {
        //여러개의 인스턴스 주소를 저장하려면?
        //- 레퍼런스 배열을 이용하면 된다.
        class Score {       //쟁반
            String name;    //밥
            int kor;        //반찬
            int eng;
            int math;
            int sum;
            float avg;
        } 

        //Score 레퍼런스를 여러개 준비한다.
        //=>배열 사용
        Score[] arr = new Score[3];

        //인스턴스를 만들어 레퍼런스 배열의 각 방에 그 주소를 저장한다.
        arr[0] = new Score();
        arr[1] = new Score();
        arr[2] = new Score();
         
        //값을 저장할 때는 일일이 값을 지정해야한다.
        arr[0].name = "홍길동";
        arr[1].name = "임꺽정";
        arr[2].name = "유관순";
        
        //반복문을 사용하면 배열의 인스턴스 값을 꺼내기 쉽다.
        for (int i = 0; i < arr.length; i++) {

            System.out.printf("이름 : %s\n", arr[i].name);
            
            

        }
         
    }
}

//결론!
// - 배열은 반복문과 함께 쓸 때 특히 유용하다.