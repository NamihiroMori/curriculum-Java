package check;

import constants.Constants;

public class Check {
    // 課題①　フィールド変数の宣言
    private static String firstName = "Mori";
    private static String lastName = "Namihiro";

    public static void main(String[] args) {
        // 名前の出力
        printName(firstName, lastName);

        // 課題③ ペット情報表示
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        pet.introduce();

        // 課題③ ロボット情報表示
        RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        robotPet.introduce();
    }

    // 課題②　printNameメソッドの作成
    private static void printName(String firstName, String LastName) {
        System.out.println("printNameメソッド → " + firstName + LastName);
    }
}
