//αυτο ειναι το πρωτο προγραμμα του βαγγελη 
//σε java

package vaggelis;

public class Vaggelis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1;  //μεταβλητη 1 ακεραιος
        double n2;  //μεταβλητη 2 ακεραιος
        double sum1; //αποτελεσμα προσθεσης
        double sum2; //αποτελεσμα αφαιρεσης
        double sum3; //αποτελεσμα πολλαπλασιασμου
        double sum4; //αποτελεσμα διαιρεσης
        
        n1 = 199;
        n2 = 187;
        
        sum1 = n1 + n2;
        sum2 = n1 - n2;
        sum3 = n1 * n2;
        sum4 = n1 / n2;
        
        System.out.println("το αποτελεσμα του αριθμου: "+ n1);
        System.out.println("και του αριθμου: "+ n2);
        System.out.println("για την προσθεση ειναι: "+ sum1);
        System.out.println("για την αφαιρεση ειναι: "+ sum2);
        System.out.println("για τον πολλαπλασιασμο ειναι: "+ sum3);
        System.out.println("για τη διαιρεση ειναι: "+ sum4);
        System.out.flush();
               
    }
    
}
