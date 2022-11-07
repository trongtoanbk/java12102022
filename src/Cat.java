public class Cat extends Animal{
    private  String color;
    public Cat(String name, String height, String weight, String color) {
        super(name, height, weight); // kế thừa phương thức của lớp cha
        this.color = color;   // thêm thuộc tính mới cho lớp mới
    }

    @Override
    public void showinfor() {

        super.showinfor();
        System.out.println("Color:"+color);
    }
}
