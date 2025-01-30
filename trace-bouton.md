
| ligne exécutée           | effet                                                      | pile d'appels |
|--------------------------|------------------------------------------------------------|---------------|
|    super.onCreate(savedInstanceState)               | appel la class parent.                           |onCreate     |
|binding = ActivityMainBinding.inflate(layoutInflater)           | gonfle fichier xml        | onCreate      |
|setContentView(binding.root) |   affiche fichier xml     | onCreate      |
| Toast.makeText(this, "N", Toast.LENGTH_SHORT).show()               | affiche "N"                                        | onCreate |
|actionBouton()        | appelle actionBouton()                    | onCreate |
| Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | Affiche "O" | actionBouton() <br> onCreate      |
| Toast.makeText(this, "Ë", Toast.LENGTH_SHORT).show()             | Affiche"Ë"                                      | actionBouton() <br> onCreate |
| Toast.makeText(this, "L", Toast.LENGTH_SHORT).show()                | Affiche "L"                  | onCreate |
|Toast.makeText(this, "H", Toast.LENGTH_SHORT).show() | Affiche "H" | binding.btnConnexion.setOnClickListener    |
|Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | Affiche "O" | binding.btnConnexion.setOnClickListener     |
|Toast.makeText(this, "H", Toast.LENGTH_SHORT).show() | Affiche "H" | binding.btnConnexion.setOnClickListener      |
|Toast.makeText(this, "O", Toast.LENGTH_SHORT).show() | Affiche "O" | binding.btnConnexion.setOnClickListener     |
super.onCreate appel la class parent.
gonfle fichier xml
affiche fichier xml
