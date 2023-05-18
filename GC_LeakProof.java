import java.util.ArrayList;
import java.util.List;

// list ������ ���� ������ �����Ͽ� �޸� ������ ����
/*
list ������ ���� ������ �����ϰ�, addToMyList �޼��忡�� �̸� ���ڷ� �����մϴ�.
�̷��� �ϸ�, �ش� �޼��尡 ȣ��� ������ ���ο� list ��ü�� �����ǹǷ�,
MyClass �ν��Ͻ��� �Ҹ�� �� �ش� ��ü�� �Բ� �޸𸮿��� �����˴ϴ�.
 */

public class GC_LeakProof {
    
    public void addToMyList(List<String> list, String str) {
        list.add(str);
    }
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        GC_LeakProof gc = new GC_LeakProof();
        for (int i = 0; i < 1000000; i++) {
            gc.addToMyList(list, "string" + i);
        }
    }
}