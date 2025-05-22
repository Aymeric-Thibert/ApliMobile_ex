| ligne exécutée           | effet                                                      | pile d'appels |
| -------------------------|----------------------------------------------------------- | --------------|
| super.onCreate(savedInstanceState)| appel la fonction parent savedInstanceState   | onCreate |
| setContentView(R.layout.activity_main)| affiche le layout activity_main | onCreate |
| val salutation = "hi" | créer la valeur salutation = hi | onCreate |
|retrofit.service.getLongueurMot(salutation).enqueue(object : retrofit2.Callback<Int> [...] | appelle la méthode getLongeuerMot avec salutation en parametre ->lance en asyncrhome la requête Get http://10.0.2.2:8080/longueur/salutation  | onCreate |
|if (mot.length >= 3) | vérifie si le mot salutation est plus long que 3 hi < 3 -> false | getLongueur |
| else { return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Mot trop court!"); | retourne un bar request avec le body : Mot trop court! | getLongueur |
| if (response.isSuccessful) | vérifie si la réponse de la requête est un succès -> false  | onResponse |
| Toast.makeText(this@MainActivity, "Erreur: Mot trop court!", Toast.LENGTH_LONG).show()  | affiche le message d'erreur : Erreur: mot trop court! dans un toast | onResponse |



