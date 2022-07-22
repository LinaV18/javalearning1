class Byte {
    public static void main(String[] args) {
        byte m, l;
        m = -127;
        l = 127;
        System.out.println(m); // prints 127
        System.out.println(l); //throws an error because it cannot store more than 127
    }
}
