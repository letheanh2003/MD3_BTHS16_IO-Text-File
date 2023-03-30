package BTH2_TimGiaTriLonNhatVaGhiRaFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<Integer>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File khong ton tai hoac co noi dung loi");

        }
        return numbers;
    }

    public static void writeFile(String filePath, int max) throws IOException {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Gia tri lon nhat la: " + max);
            bufferedWriter.close();
        }catch (IOException e) {
                e.printStackTrace();
        }
    }
}
