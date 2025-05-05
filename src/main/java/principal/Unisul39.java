package principal;
import javax.swing.JOptionPane;
public class Unisul39 {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        try{
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        } catch (java.lang.NumberFormatException d){
            System.out.println("Erro na entrada de dados, digite um número inteiro." + d);
        } 
        
        try{
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
        } catch (java.lang.NumberFormatException f){
            System.out.println("Erro na entrada de dados, digite um número inteiro." + f);
        } 
        int n = 0;
        
        try{
            n = n1/n2;
        } catch (java.lang.ArithmeticException e){
            System.out.println("Erro na aritmética, digitar número diferente de zero." + e);
        }
        
        System.out.println("Divisão: " + n);
    }
}
