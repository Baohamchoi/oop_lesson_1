import java.util.Scanner;

// Review by dvhoang v4
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một đoạn hoặc một bài thơ lục bát (Nhập '.' để kết thúc việc ghi thơ): ");
        StringBuilder poemBuilder = new StringBuilder();
        String line;
        while (true)
        {
            line = scanner.nextLine();

            if (line.equals("."))
            {
                break;
            }
            // equals("...") : hàm so sánh độ dài của chuỗi, ở trên là dòng nào chứa mỗi dấu "." thì sẽ thoát vòng lặp.
            poemBuilder.append(line).append("\n");
            // dòng 20 sẽ nối các ( line + "\n" ) lại với nhau.
        }
        String poem = poemBuilder.toString();
        String formattedPoem = formatPoem(poem);
        // gán những dòng code đã nối lại trong biến poemBuilder vào poem và thêm toString() để chuỗi chạy như chuỗi bth.
        System.out.println("Bài thơ đã được chỉnh sửa."+"\n");
        System.out.println(formattedPoem);
    }

    public static String formatPoem(String poem)
    {
        String[] lines = poem.split("\n");
        int maxLineLength = 0;
        for (String line : lines)
        {
            if (line.length() > maxLineLength)
            {
                maxLineLength = line.length();
            }
        }
        // dùng for chạy từng dòng để đo số kí tự mỗi dòng và tìm ra dòng dài nhất.
        StringBuilder formattedPoemBuilder = new StringBuilder();

        for (String line : lines) {
            int padding = (maxLineLength - line.length()) / 2;
            // trừ số kí tự của dòng dài nhất với số kí tự của dòng hiện tại sau đó /2 để tiến hành căn giữa cho câu.
            String paddedLine = " ".repeat(padding) + line;
            // repeat(int count) : hàm lặp lại kí tự or chuỗi với số lần đc thiết lập trong ngoặc.
            formattedPoemBuilder.append(paddedLine).append("\n");
        }
        return formattedPoemBuilder.toString();
    }
}


// poem : bài thơ.
// padding : câu thơ.
