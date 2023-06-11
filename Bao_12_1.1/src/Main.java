import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String fullName = scanner.nextLine();
        // nextLine() : Hàm đọc dữ liệu đầu vào cho đến cuối dòng.
        System.out.println("Tên của bạn là: " + fullName);
        String capitalizedFullName = capitalizeFullName(fullName);
        System.out.println("Tên của bạn sau khi viết hoa :" + capitalizedFullName);
    }
    public static String capitalizeFullName(String fullName)
    {
        String[] words = fullName.split("\\s");
        // "\\s" : đại diện cho khoảng trắng.
        // split(...) : hàm cắt chuỗi với điều kiện tự quy định.
        StringBuilder capitalizeFullName = new StringBuilder();
        // StringBuilder : một lớp trong Java được sử dụng để xây dựng và chỉnh sửa các chuỗi. Nó cung cấp các phương thức để thêm, xóa, thay thế và sắp xếp các phần tử trong chuỗi.
        for (String word : words) // lặp từng từ trong một chuỗi words ( nhiều từ trong một chuỗi )
        {
            String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            // Character : một lớp giúp thao tác các kí tự trong chuỗi.
            // toUpperCase : hàm chuyển đổi chữ thường thành chữ hoa.
            // charAt(...) : lấy kí tự ở vị trí bất kì trong chuỗi.
            // substring(...) : hàm nối chuỗi với vị trí nối tiếp bất kì.
            capitalizeFullName.append(capitalizedWord).append(" ");
            //append(...) : hàm thêm chuỗi, kí tự bất kì vào chuỗi.
        }

    return capitalizeFullName.toString().trim();
        // toString() : hàm chuyển đổi chuỗi đã đc chỉnh sửa thành một chuỗi thông thường.
        // trim() : hàm loại bỏ các khoảng trắng (khoảng cách, tab, hoặc dấu cách) ở đầu và cuối chuỗi. Phương thức này trả về một chuỗi mới, không bao gồm các khoảng trắng dư thừa.
    }
}
// mấy bữa đầu bài tập em note hơi nhiều kk. =='

// capitalized (adj) : chuyển đổi.