package demo;

public class DataTypesApp {
    public static void main(String[] args) {

        var aBoolean = false;
        var aCharacter = 'd';
        var aByte = 126;
        var aShortInteger = 1568;
        var anInteger = 1256456;
        var aLongInteger = 45631341L;
        var aDecimalNumber = 1256.32F;
        var aBigDecimalNumber = 12.365987451236;
        final double PI = 3.14;
        //PI = 3.15; is not allowed its final!!!


        System.out.println(aBoolean);
        System.out.println(aCharacter);
        System.out.println(aByte);
        System.out.println(aShortInteger);
        System.out.println(anInteger);
        System.out.println(aLongInteger);
        System.out.println(aDecimalNumber);
        System.out.println(aBigDecimalNumber);


        anInteger = 0342;
        System.out.println(anInteger);

        anInteger = 0x56_31;
        System.out.println(anInteger);

        anInteger = 0b0101_1100;
        System.out.println(anInteger);




    }
}
