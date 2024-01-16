class Personnep {

    String prenom;
    String nom;
    int age;
    int nbPersonnes = 0;

    public Personnep(String p, String n, int a){

        prenom = p;
        nom = n;
        age = a;
        nbPersonnes++;
   }
    public void affichePersonne1(){
        System.out.println(prenom);
        System.out.println(nom);
        System.out.println(age);
   }
}

