import java.util.ArrayList;
import java.util.List;

// ������ �÷������ε� �޸� leak�� �߻��� ��
/*
GC_Leak �ν��Ͻ��� �����ϰ�, addToMyList �޼��带 ���� list�� 100�� ���� ���ڿ��� 
�߰��մϴ�. �̶�, list ������ �ν��Ͻ� ������ ����Ǿ� �ֱ� ������,  GC_Leak�ν��Ͻ��� 
�Ҹ�� ������ �޸𸮿� ��� �����ֽ��ϴ�. ����, ������ �÷������ε� �ش� �޸𸮸� 
������ �� ���� ������, �޸� ������ �߻��մϴ�.
 */
public class GC_Leak {
    private List<String> list = new ArrayList<>();
    
    public void addToMyList(String str) {
        list.add(str);        
    }
    
    public static void main(String[] args) {
        GC_Leak gc = new GC_Leak();
        for (int i = 0; i < 1000000; i++) {
            gc.addToMyList("string" + i);
        }
    }
    
}