package step24.ex5;

public class Account {
    String accountId;
    long balance;
    
    public Account(String accountId, long balance) {
        this.accountId = accountId;
        this.balance = balance;
    }
    
        // 한 번에 한 스레드만 접근할 수 있도록 제한하고 싶다면 메서드 전체를 동기화 블록으로 선언하라!
        // 메서드 앞에 synchronized를 붙인다.
        // 이 메서드처럼 여러 메서드가 접근했을 때 발생하는 '크리티컬 섹션'이 아니면
        // 싱크로나이즈드 사용을 자제하라
        // 왜? 성능이 떨어진다. 
        synchronized public long withdraw(long money) {
        long b = this.balance;
        
        for (int i = 0; i < 1000; i++) Math.asin(45.765); // CPU를 뺏길 기회를 제공
        b -= money;
        
        for (int i = 0; i < 1000; i++) Math.asin(45.765); // CPU를 뺏길 기회를 제공
        if (b < 0)
            return 0;
        
        for (int i = 0; i < 1000; i++) Math.asin(45.765); // CPU를 뺏길 기회를 제공
        this.balance = b;
        
        for (int i = 0; i < 1000; i++) Math.asin(45.765); // CPU를 뺏길 기회를 제공
        return money;
    }
}