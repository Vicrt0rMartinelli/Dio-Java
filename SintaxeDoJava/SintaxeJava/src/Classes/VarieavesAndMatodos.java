package Classes;
public class VarieavesAndMatodos {
public static void main (String []args) {
        ///Variaveis///
    String MyName = "José";
    int AgeOfFrabrication = 2006;
    boolean YesOrNO = true; 
    AgeOfFrabrication = 2007;
    System.out.print("My name is "+MyName+" I was fabricated in "+AgeOfFrabrication+" . Is it true? "+YesOrNO+"\n");

         ///Metodos///
    String FirstName = "José";
    String SecondName = "Victor";
    String NamyComplet = NamyComplet (FirstName, SecondName);
    System.out.print(NamyComplet);
}
    public static String NamyComplet (String FirstName, String SecondName){
        return "Resultado do Método \n" + FirstName.concat(" ").concat(SecondName);
    }
}