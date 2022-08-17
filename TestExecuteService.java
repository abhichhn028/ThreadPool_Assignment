import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecuteService {

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);

        Runnable task1=()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
            }
        };

        executorService.submit(task1);
        executorService.shutdown();
    }
    
}
