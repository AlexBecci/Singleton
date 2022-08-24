
public class Main {

    public static void main(String[] args) {
        Logger usuarioA = Logger.getInstance();
        Logger usuarioB = Logger.getInstance();
        //       Logger ejemplo = new Logger();//Error!!!!

        usuarioA.setValue("UsuarioA...");//Se declara el tipo de dato a la variable usuarioA

        System.out.println(usuarioB.getValue());//Como solo hay una instancia de la clase Logger el usuarioB tiene los mismos datos que usuarioA

    }
}
