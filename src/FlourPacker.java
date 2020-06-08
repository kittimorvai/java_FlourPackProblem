public class FlourPacker {

    //bigPack represents a flour pack of 5 kilos, smallPack represents a flour pack of 1 kilo
    //goal is the amount we need to achieve by using up sufficient amount of flour packs
    //Only full bags can be used, they cannot be divided


    public static void main(String[] args) {
        System.out.println(canPack(2,10,18));
    }

    public static boolean canPack (int bigPack, int smallPack, int goal) {
        if (bigPack < 0 || smallPack < 0 || goal < 0) {
            return false;
        }

        int sum = bigPack * 5 + smallPack;

        if (sum < goal) {
            return false;
        }
        if (goal % 5 <= smallPack) {
            goal -= goal % 5;
            if (bigPack * 5 + smallPack >= goal) {
                return true;
            }
        }
        return false;
    }
}
