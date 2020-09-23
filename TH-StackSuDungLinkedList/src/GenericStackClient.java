public class GenericStackClient {
    private static void stackOfIsString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("huynh,");
        stack.push("tuan,");
        stack.push("hokh,");
        stack.push("hu1h,");
        stack.push("dcchuah,");
        System.out.println("kich thuoc sau khi push: " + stack.size());
//        System.out.println("phan tu: ");

        System.out.println("pop cac phan tu trong stack : ");
        while (!stack.isEmpty()) {
            System.out.printf("%s", stack.pop());
        }
        System.out.println("size sau khi pop: " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack1 = new MyGenericStack<>();
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(2);

        System.out.println("size sau khi push: " + stack1.size());
        System.out.println("pop cac phan tu pop: ");
        while (!stack1.isEmpty()) {
            System.out.printf("%d",stack1.pop());
        }
        System.out.println("size sau khi pop: " +stack1.size());
    }

    public static void main(String[] args) {
        stackOfIsString();
        stackOfIntegers();
    }
}
