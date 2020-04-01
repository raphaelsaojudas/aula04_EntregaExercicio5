import javax.swing.JOptionPane;

public class Aula04Ex5 {
   public static void main (String arg[]){
      String nome1 = "fim";
      String nome2 = JOptionPane.showInputDialog ("digite nome:");
      while (!nome1.equals(nome2)){
         JOptionPane.showMessageDialog (null, nome2);
         nome2 = JOptionPane.showInputDialog ("digite nome novamente:");
      }
   }
}