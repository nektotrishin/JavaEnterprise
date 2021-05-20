public class Task02 {

    //Проверка строки на палиндром
    public static void main(String[] args) {
        String palidnrom = "А роза упала на лапу Азора";

        String palidnromWithoutSpace = palidnrom.replace(" ", "");
        String reversedPalindromWithoutSpace = new StringBuilder(palidnromWithoutSpace).reverse().toString();

        if (palidnromWithoutSpace.equalsIgnoreCase(reversedPalindromWithoutSpace)) {
            System.out.println("Строка \'" + palidnrom + "\' является палиндромом без учета пробелов и регистра");
        } else {
            System.out.println("Строка \'" + palidnrom + "\' не является палиндромом");
        }

    }
}
