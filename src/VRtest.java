package HW1;
public class VRtest {
    public static void main(String[] args) {
        VR vr1 = new VR(10, "Dice");
        VR vr2 = new VR(9, "Nike");
        VR vr3 = new VR(8, "Serum");
        vr1.setManufacturer("Arthur");
        vr2.setManufacturer("Dutch");
        vr3.setManufacturer("Jecker");
        System.out.println(vr1);
        System.out.println(vr2);
        System.out.println(vr3);
    }
}
