public class Pokemon {

//Criar os atributos genericos de um pokemon
    //Atributos genericos do pokemon
    private String nome;
    private String tipo;
    private int level;
    private int vida = 230;
    private int ataque;
    private int defesa;

    //Construtor de classe
    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        calculaAtributos();
        calculaBonus();
    }
//metodos que podem ser usados por um objeto do tipo pokemon

    public void calculaAtributos() {
        switch (tipo){
            case "Fire":
                vida = vida - 90;
                ataque = 82;
                defesa = 62;
                break;
            case "Water":
                vida =  vida - 56;
                ataque = 25;
                defesa = 100;
                break;
            case "Dirt":
                vida = vida - 45;
                ataque = 90;
                defesa = 50;
                break;
            case "Air":
                vida = vida -7;
                ataque = 50;
                defesa = 95;
                break;

        }
    }
    public void calculaBonus(){
        vida = vida + (level / 2);
        ataque = ataque + ( level/3);
        defesa = defesa + (level /4);
    }
    

    public void imprimiPokemon() {
        System.out.println("Nome: " + nome + " || "
                + " Tipo: " + tipo + " || "
                + " Level: " + level + " || "
                + " Vida: " + vida + " || "
                + " Ataque: " + ataque + " || "
                + " Defesa:" + defesa);
    }

}