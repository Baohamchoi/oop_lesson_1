import java.util.Scanner;

// Review by dvhoang v3
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một đoạn hoặc một bài thơ lục bát : ");
        String[] line = new String[10];
        for (int i = 0; i < 4; i++)
        {
            line[i] = scanner.nextLine();
        }
        formatPoem(line);
//        String poem = poemBuilder.toString();
//        String formattedPoem = formatPoem(poem);
        // gán những dòng code đã nối lại trong biến poemBuilder vào poem và thêm toString() để chuỗi chạy như chuỗi bth.
        System.out.println("Bài thơ đã được chỉnh sửa."+"\n");
//        System.out.println(formattedPoem);
        for (int i = 0; i < 4; i++)
        {
            System.out.println(line[i]);
        }
    }

    public static void formatPoem(String[] line)
    {
        int max_kitu = 0;
        for (int i = 0; i < 4; i++)
        {
            if (line[i].length() > max_kitu)
            {
                max_kitu = line[i].length();
            }
        }

        for (int i = 0; i < 4; i++)
        {
            String new_line = "";
            int centerAlign = (max_kitu - line[i].length()) / 2;
            for (int j = 0; j < centerAlign; j++)
            {
                new_line += " ";
            }
            line[i] = new_line + line[i];
        }
    }
}


// poem : bài thơ.
// padding : câu thơ.
