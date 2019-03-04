class Voorbeeld {

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(args[0]);

        Bank ing = new Bank(); //referentie identifie //objectype

        ing.name = "ABN-AMRO";

        Bank tweedeBank = new Bank();
        tweedeBank.name = "Triodos";
        tweedeBank.balance = 14;

        System.out.println(ing.balance);
    }

}

class Bank {
        String name = "ING";
        static int balance;
}