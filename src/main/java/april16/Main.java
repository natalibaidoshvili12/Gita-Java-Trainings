package april16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class Main {

    private static final int NUM_THREADS = 10;

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        String filePath = "threads.txt";
        List<String> lines = Files.readAllLines(Path.of(filePath));
        int totalLines = lines.size();
        int chunkSize = (int) Math.ceil((double) totalLines / NUM_THREADS);

        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
        List<Future<Map<String, Integer>>> futures = new ArrayList<>();

        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, totalLines);
            if (start >= end) break;
            List<String> chunks = lines.subList(start, end);
            futures.add(executorService.submit(() -> countWords(chunks)));
        }
        Map<String, Integer> wordCount = new ConcurrentHashMap<>();
        for (Future<Map<String, Integer>> future : futures) {
            mergeWordCounts(wordCount, future.get());
        }
        executorService.shutdown();
        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));

    }

    private static Map<String, Integer> countWords(List<String> lines) {
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                wordsCount.merge(word, 1, Integer::sum);
            }
        }
        return wordsCount;
    }

    private static void mergeWordCounts(Map<String, Integer> mainMap, Map<String, Integer> partialMap) {
        partialMap.forEach((k, v) -> mainMap.merge(k, v, Integer::sum));
    }

}
