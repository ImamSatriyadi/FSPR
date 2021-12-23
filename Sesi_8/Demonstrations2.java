package Sesi_8;

class Sample {
    // Public field
    public int pubInt = 1;

    // Public method
    public void showPublicMethod() {
        System.out.println("The showPublicMethod() is a public method.");
    }

    // Private field
    private int priInt = 2;

    public int getPubInt() {
        return pubInt;
    }

    public void setPubInt(int pubInt) {
        this.pubInt = pubInt;
    }

    // Private method
    private void showPrivateMethod() {
        System.out.println("The showPrivateMethod() is a private method.");
    }

    public int getPriInt() {
        return priInt;
    }

    public void setPriInt(int priInt) {
        this.priInt = priInt;
    }
}

class Demonstrations2 {
    public static void main(String[] args) {
        System.out.println("***Demonstration-2. Introducing access control using private and public modifiers.***\n");
        Sample sampleOb = new Sample();
        System.out.println("The pubInt=" + sampleOb.pubInt);// 1
        sampleOb.showPublicMethod();
        // Compile-time error
        System.out.println(" The priInt=" + sampleOb.getPubInt());
        // Compile-time error
        sampleOb.getPriInt();
    }
}