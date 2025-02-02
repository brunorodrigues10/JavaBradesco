public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        // Sem break - cada plano adiciona as vantagens do plano anterior.
        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram Grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
