import java.util.Scanner;

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

//        int a= 5;
//        int b=5;
//        int result = a++ - --b + b-- +a-- - a++ + b++ - b--;
//        System.out.println(result);

        //4. Câu điều kiện if
        // Ví dụ: Kiểm tra xem có phải năm nhuận không, nếu là năm nhuận thì hiện ra thông báo
//        int year;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhập vào năm bạn cần kiểm tra:");
//        year = scan.nextInt();
//        scan.close();
//        boolean isLeap = false;
//        if(year % 4 == 0)//chia hết cho 4 là năm nhuận
//        {
//            if( year % 100 == 0)
//            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
//            {
//                if ( year % 400 == 0)//chia hết cho 400 là năm nhuận
//                    isLeap = true;
//                else
//                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
//            }
//            else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
//                isLeap = true;
//        }
//        else {
//            isLeap = false;
//        }
//        if(isLeap==true)
//            System.out.println(year + " là năm nhuận.");
//        else
//            System.out.println(year + " không phải là năm nhuận.");
//
//        }


//        int year1;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào năm");
//        year1= scanner.nextInt();
//        scanner.close();
//        boolean isLeap =false;
//        // cách 1
//        if (year1 % 4 ==0)
//        {
//            if (year1 % 100==0)
//            // Nếu vừa chia hết cho 4 và chia hết cho 100 thì không phải năm nhuận
//            {
//            if (year1 % 400 ==0)
//            // nhưng chia hết cho 400 là năm nhuận
//
//                isLeap =true;
//            else
//                isLeap = false;
//
//            }
//
//            else isLeap= true; //chia hết cho 4 và không chia hết cho 100 là năm nhuận
//
//
//        }
//        else isLeap=false; // không chia hết cho 4 không là năm nhuận
//        System.out.println(isLeap+"");
//
//        if (isLeap==true)
//        { System.out.println(year1+ " Là năm nhuận");}
//
//        else {System.out.println(year1 + " không phải là năm nhuận");}
//
//
//        // Cách 2:
//
//        //1. Năm nhuận là năm chia hết cho 400.
//        //2. Năm nhuận là năm chia hết cho 4 nhưng không chia hết cho 100.
//        if ((year1 % 4 ==0 && year1%4 !=0)||year1 %400 ==0)
//            System.out.println(year1 +" cach 2 la nam nhuận");
//        else System.out.println( year1+" cach 2 khong la nam nhuan");

        //. Điều kiện if
        // Bài toán: tính chỉ số BMI và đưa ra kết luận cơ thể
        // công thức bmi = cân năng (kg)/chiều cao (m)*chieu cao (m)
//        float canNang;
//        float chieuCao;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Nhập vào chiều cao (m):");
//        chieuCao = scanner.nextFloat();
//        System.out.println(" Nhập vào cân nặng (kg):");
//        canNang= scanner.nextFloat();
//        scanner.close();
//        Float BMI = canNang/(chieuCao*chieuCao);
//        String message = "";
//        if (BMI<18.5) {
//            message = " Gầy + Thấp";
//        } else if (18.5 <= BMI && BMI <=24.9) {
//            message =" Bingf thường";
//        }  else if (25 <= BMI && BMI <=29.9) {
//            message = "Hơi béo";
//        }
//        else if (30 <= BMI && BMI <=34.9) {
//            message = "Béo cấp độ 1";
//        }
//        else if (35 <= BMI && BMI <=39.9) {
//            message = "Béo cấp độ 2";
//        }else if (40 <= BMI) {
//            message = "Béo cấp độ 3";
//        }
//
//        System.out.println(" Chỉ số BMI của bạn đang ở mức" + message);

//        //5. Câu điều kiện Switch case
//        int month =5;
//        Scanner scanner= new Scanner(System.in);
//        System.out.println(" Nhập vào tháng:");
//        month = scanner.nextInt();
//        scanner.close();
//        switch (month)
//        {
//            case 1:
//                System.out.println(" Quý 1");
//                break;
//            case 2:
//                System.out.println(" Quý 1");
//                break;
//            case 3:
//                System.out.println(" Quý 1");
//                break;
//            case 4:
//                System.out.println(" Quý 2");
//                break;
//            case 5:
//                System.out.println(" Quý 2");
//                break;
//            case 6:
//                System.out.println(" Quý 2");
//                break;
//                // break: thoát khỏi switch case và vòng lặp.
//                // nếu không có break thì chương trình sẽ mặc định những phần phía sau đúng hết
//            case 7:
//                System.out.println(" Quý 3");
//                break;
//            case 8:
//                System.out.println(" Quý 3");
//                break;
//            case 9:
//                System.out.println(" Quý 3");
//                break;
//            default:
//                System.out.println(" Quý 4");
//        }

        // 6. Vòng lặp for => Duyệt dữ liệu
//        for (int i=1; i<10; i++)
//        {
//            System.out.println(i);
//        }
        // Ví dụ: cho vòng lặp chạy từ 1-> 100, chỉ in ra số chẵn
//        for (int i=1; i<=100; i++)
//        {
//            if (i%2==0)
//            System.out.println(i);
//           // else break;
//        }

        // Ví dụ 2: cho vòng lặp từ 100 ->1, in ra số chia hết cho 3
//        for (int i=100; i>=1; i--)
//        {
//            if (i%3==0)
//                System.out.println(i);
//        }
        // Ví dụ 3: Cho 1 số ngẫu nhiên, kiểm tra xem có phải số nguyên tố hay không
        // Cách 1:
//        int a ;
//        int soNguyento =0;
//        Scanner scanner= new Scanner(System.in);
//        System.out.println(" Nhập vào số tự nhiên  a:");
//        a = scanner.nextInt();
//        for (int i=2; i<a; i++)
//        {
//            if (a%i==0)
//                soNguyento ++;
//        }
//        if (a<=2)
//        System.out.println(a + " không phải số nguyên tố");
//
//        else {
//            if (soNguyento ==0)
//            System.out.println(a + " là số nguyên tố");
//            else System.out.println(a +" không phải số nguyên tố");
//        }
        // Cách 2:
//        int a ;
//        Scanner scanner= new Scanner(System.in);
//        System.out.println(" Nhập vào số tự nhiên  a:");
//        a = scanner.nextInt();
//        scanner.close();
//        if (a <=2) {
//            System.out.println(a + "không phải số nguyên tố ");
//        }
//        else {
//            for (int i =2; i <a; i++) {
//                if (a % i == 0)
//                { System.out.println(a + " không phải số nguyên tố");
//                return;
//                }
//            }
//            System.out.println(a + " Là số nguyên tố");
//
//        }

         //7. Vòng lặp while
         long randomNumber = Math.round(Math.random()*100+1);
         while (randomNumber >=1)
         {
             System.out.println(randomNumber);
             randomNumber --;
         }
        }

        }













