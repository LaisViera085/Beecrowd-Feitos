package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class Exercicio1040{
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
 
        Double n1, n2, n3, n4, mf, ex, mf2, tpm;
        String r;
 
        r = scan.next();
        n1 = Double.valueOf(r);
        r = scan.next();
        n2 = Double.valueOf(r);
        r = scan.next();
        n3 = Double.valueOf(r);
        r = scan.next();
        n4 = Double.valueOf(r);
 
        mf = ((n1*2) + (n2*3) + (n3*4) + n4)/10;   
        scan.close();
 
        if (mf >= 7) {
            r = String.valueOf(df.format(mf));
            mf = Double.parseDouble(r.replace(',', '.'));
            System.out.println("Media: " + mf + "\nAluno aprovado.");
        } else if (mf < 5) {             r = String.valueOf(df.format(mf));          mf = Double.parseDouble(r.replace(',', '.'));           System.out.println("Media: " + mf + "\nAluno reprovado.");                  } else {            r = scan.next();            tpm = ex = Double.valueOf(r);           mf2 = (mf + ex) / 2;            r = String.valueOf(df.format(mf));          mf = Double.parseDouble(r.replace(',', '.'));           r = String.valueOf(df.format(ex));          ex = Double.parseDouble(r.replace(',', '.'));           System.out.println("Media: " + mf);             System.out.println("Aluno em exame.");          System.out.println("Nota do exame: " + ex);             r = String.valueOf(df.format(mf2));             mf2 = Double.parseDouble(r.replace(',', '.'));          if(tpm >= 5)
                System.out.println("Aluno aprovado.\nMedia final: " + mf2);
            else
                System.out.println("Aluno reprovado.\nMedia final: " + mf2);
        }
    }
}
