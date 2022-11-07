public class Animal {

    //1: Thuộc tính (Properties - Props)
    // thuộc tính: Xử lý thông tin cho đối tượng
    private String name;
   private String height;
    private String weight;



    // 2: Phương thức khởi tạo
    public Animal(String name, String height, String weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    //3: Getter, Setter => Phím tắt ALT + Insert

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    public void showinfor(){
        String textName= "name:" + name;
        String textHeight= "Height:" + height;
        String textWeight= "Weight:" + weight;
        System.out.println("Animal:\n "+ textName+"\n"+textHeight+"\n"+textWeight);

    }


}
