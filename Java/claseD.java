class D {
    A a;
    B b;

    public D() {
        a = new A(5, 10);
        b = new B(5, 10);
    }

    public void incrementaXYZ() {
        a.x++;
        b.y++;
        a.z++;
        b.z = a.z;
    }

    public void mostrar() {
        System.out.println("x = " + a.x + ", y = " + b.y + ", z = " + a.z);
    }
}