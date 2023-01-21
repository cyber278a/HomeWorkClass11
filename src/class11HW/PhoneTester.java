package class11HW;

public class PhoneTester {
    public static void main(String[] args) {
Phone iphone=new Phone();

iphone.color="silver";
iphone.model="14 Pro";
iphone.waterproof=true;

        System.out.println(iphone.model);
iphone.alarm();

Phone Samsung=new Phone();
Samsung.color="black";
Samsung.durability=true;
Samsung.memory=128;
        System.out.println(Samsung.memory);

  Phone Pixel=new Phone();
Pixel.model="7";
  Pixel.color="lemongrass";

Pixel.memory=256;
        System.out.println(Pixel.color);
      Pixel.calculator();

    }
}
