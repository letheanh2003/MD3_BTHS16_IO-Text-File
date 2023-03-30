package BTH2_TimGiaTriLonNhatVaGhiRaFile;

import java.io.IOException;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "E:\\code_md3\\SS16_BTH_ IO Text File\\src\\BTH2_TimGiaTriLonNhatVaGhiRaFile\\numbers.txt";
        String PATH_RESULT = "E:\\code_md3\\SS16_BTH_ IO Text File\\src\\BTH2_TimGiaTriLonNhatVaGhiRaFile\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT, maxValue);
    }
}
