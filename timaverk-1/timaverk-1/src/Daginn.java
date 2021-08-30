public class Daginn {
    public static void main(String[] args) throws Exception {
        
        System.out.print("Góðan daginn ");
        for (int i = 0; i < args.length; i++) {
            if (i == args.length - 1) {
                System.out.print("og " + args[i]);
            }
            else{
                System.out.print(args[i] + " ");
            }
        }
    }
}
