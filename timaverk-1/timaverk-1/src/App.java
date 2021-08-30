public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.print("Góðan daginn ");
        for (int i = 0; i < args.length; i++) {
            if (i == args.length) {
                System.out.print("og " + args[i]);
            }
            else{
                System.out.print(args[i] + " ");
            }
        }
    }
}
