public class persona {
        private String name;
        private int age;
        public persona(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void saludar() {
            System.out.println("Hola soy " + name);
        }

        public String getName(){
            return name;
        }
    public class Main {
        public static void main(String[] args) {
            persona persona1 = new persona("Jesus", 21);
            persona1.saludar();
        }
    }
}