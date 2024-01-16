public class ProgPrincipalp {
    public static void anniversaire(Personnep p){
       p.age+=1;
    }

public static void main(String[] args){

    Personnep p1 = new Personnep("Jean", "Durand", 25);
    p1.affichePersonne1();
    anniversaire(p1);
    p1.affichePersonne1();
    

}
}
