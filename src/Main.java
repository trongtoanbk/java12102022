public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 1. Kiểu dữ liệu
        // Kiểu dữ liệu nguyên thủy (Primitive)
        // EX: char, int, long, float, double, boolean
        // Kiểu dữ liệu đối tượng (Object)
        //EX: String, Interger, Long, Fload, Double,Boolean

        // 2. Khai báo biến
//        char word = 'a';
//        int number1 =-1;
//        float number2 = 1.1f;
//        boolean isOnline = true;
//
//        String name = " Đỗ Trọng Toàn";
//        int tuoi = 31;
//        String soThich =" Thich hoc lap trinh";
//        double chieuCao = 1.78;
//        System.out.println(name);
//        System.out.println(tuoi);
//        System.out.println(soThich);
//        System.out.println(chieuCao);

        //3. Toán tử
        //3.1 phep chia lay phan nguyen và lay phan du
//        int a =10;
//        int b=3;
//        int result = a /b ; // lay gia tri nguyen
//        int soDu = a %b ; // chia lay phan du
//        System.out.println(result);
//        System.out.println(soDu);

        //3.2 toan tu ++/--
        // Th1: a++
        // 1: Gán giá trị vào cho a
        //2: Tăng giá trị a lên 1 đơn vị
        // TH2: ++a
        //1: Tăng giá trị a lên 1 đơn vị
        //2: gán giá trị vào cho a
//        int a=10;
//        int b= a++;
//        int c= ++a;
//        System.out.println(b);
//        System.out.println(a);
//        System.out.println(c);

        int a= 5;
        int b=5;
        int result = a++ - --b + b-- +a-- - a++ + b++ - b--;
        System.out.println(result);



    }


}