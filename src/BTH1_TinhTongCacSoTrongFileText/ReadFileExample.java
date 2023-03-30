package BTH1_TinhTongCacSoTrongFileText;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) throws IOException {
        try {
            //Đọc File Theo Hướng Dẫn
            File file = new File(filePath);

            //Kiểm tra xem nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            //Đọc từng dong của file và tiến hành cộng ổng lại 4
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            //Hiện Thị Ra Màn Hình Tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            // TH File không tồn tại  hooavj nổi dung file báo lỗi thì sẽ khong hiện thị thông báo lỗi
            System.err.println("File Không tồn tại or nội dung không có lỗi!");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
