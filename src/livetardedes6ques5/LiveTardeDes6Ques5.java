package livetardedes6ques5;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveTardeDes6Ques5 {

    /**
     * Escrever um algoritmo que leia N, inteiro e positivo, e calcule e 
     * mostre o termo de ordem N da sucessão abaixo:
     * ordem:  1 2 3 4 5   6  7  8
     * termo: -1 0 5 6 11 12 17 18
     */
    public static void main(String[] args) {
        int ordem, n, termo; String r="";String r1="";
        termo=-1; 
        n=Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor N:"));
        
        for(ordem=1; ordem<=n;ordem++){
           if(ordem==1){
            r1 = r1 + "Ordem:";   
            r = r   + "Termo: "+termo;
           }else{
             
               r = r + " "+termo;
           }
           if(ordem>n){
               r1 = r1 + "  "+ordem+"\n";
           }else{
            r1 = r1 + "  "+ordem;
           }
            if(ordem % 2 != 0){
                termo++;
            }else{
                termo+=5;
            };//FIM IF
 
        }//fim loop
        JOptionPane.showMessageDialog(null,"Resultado\n"+r1+"\n"+r);
    }
    
}
