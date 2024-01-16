class Personne {

    String prenom;
    String nom;
    static private int age;
    int nbPersonnes = 0;

    public Personne(String p, String n, int a){

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

