package check;

import constants.Constants;

public class Check {

    // フィールド
    private String firstName;
    private String lastName;

    //コンストラクタ
    public Check() {
        firstName = "優香";
        lastName = "椿";
    }

    // メソッド
    public void printName() {
        System.out.println("printNameメソッド→" + lastName + firstName);
    }

    public static void main(String[] args) {
        Check ck = new Check();
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
        RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);

        ck.printName();
        pet.introduce();
        rp.introduce();
    }

}

