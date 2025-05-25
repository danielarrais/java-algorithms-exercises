package src.main.algoritms.utils;

public class TimerUtil {
    public static void measureExecutionTime(Runnable task) {
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();

        double durationMs = (end - start) / 1_000_000.0;
        System.out.printf("Tempo de execução: %.3f ms%n", durationMs);
    }
}