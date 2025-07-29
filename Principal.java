public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Calculadora");
        Calculadora objeto1 = new Calculadora();
        Calculadora objeto2 = new Calculadora();

        System.out.println(objeto1.sumar(6, 9));
        System.out.println(objeto1.restar(6, 9));
        System.out.println(objeto1.division(6.0, 9.0));
        System.out.println(objeto1.multi(6, 9));

    }

}