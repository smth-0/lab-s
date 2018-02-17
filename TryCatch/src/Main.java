public class Main {

    void throwingMethod() throws MyException {
        throw new MyException("EXCEPTION!!!", 256);
    }

    public static void main(String[] argv) {
        Main main = new Main();
        try {
            main.throwingMethod();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }
    }
}
