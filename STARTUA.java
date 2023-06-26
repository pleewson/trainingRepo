public class STARTUA {
    public static void main(String[] args) {

        PARENT parent = new PARENT();
        parent.sing();

        CHILD child = new CHILD();
        child.sing();

        PARENT kidos = new CHILD();
        kidos.sing();
    }
}

