import java.util.*;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Exercicio 1:");
       multiplica();
       int[] l={1,1,2,3,3,4,4,5,5,6,6};
      //  System.out.println( "O número de ocorrências do número é:"+ nOcorrencias(l,2));
       // System.out.println(hasRepeat(l));
        System.out.println(nroRepeat(l));

    }

    public static void multiplica(){
        int[] arranjo = new int[20];
        for (int i = 0; i < arranjo.length; i++) {
            int intarable = i * 10;
            arranjo[i] = intarable;
            System.out.println(intarable);
        }
        System.out.println("invertendo");
        for (int i = arranjo.length-1; i >= 0; i--) {
            System.out.println(arranjo[i]);
        }
    }
    public static int nOcorrencias(int[] l, Integer el) {
        int nOcorrencias = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] == el) {
                nOcorrencias++;
            }
      }
        return nOcorrencias;
    }
    public static boolean hasRepeat(int[] l){
        int repeated=0;
        boolean occurrence=false;
        for (int i=0; i<l.length;i++){
            for(int k=i+1;k<l.length;k++){
                if(l[i]==l[k]){
                    repeated++;
                }
            }
        }
        if(repeated >= 1){
            occurrence=true;
        }
        return occurrence;
    }
    public static int nroRepeat(int[] l){
        int repeated=0;
        for (int i=0; i<l.length;i++){
            for(int k=i+1;k<l.length;k++){
                int control;
                if(l[i]==l[k]){
                    repeated++;
                }
                //if(control>1){
                 //   repeated--;
                //}
            }
        }
        return repeated;
    }
}
