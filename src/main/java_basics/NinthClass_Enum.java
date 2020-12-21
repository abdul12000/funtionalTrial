package java_basics;

public class NinthClass_Enum {
    enum PhoneType{
        IPHONE,
        SAMSUNG,
        HTC,
        NOKIA;
    }

    public static void main(String[] args) {
        System.out.println((PhoneType.IPHONE));
        PhoneType phoneType = PhoneType.NOKIA;
        switch (phoneType){
            case IPHONE:
                System.out.println("This is an IPHONE");
                break;
            case HTC:
                System.out.println("This is HTC");
                break;
            case NOKIA:
                System.out.println("This is NOKIA");
                break;
            case SAMSUNG:
                System.out.println("This is an SAMSUNG");
                break;
            default:
                System.out.println("not in list");
        }


    }
}
