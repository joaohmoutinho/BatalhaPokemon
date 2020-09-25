package pokesimulator2;

public class Pokemon {

//Criar os atributos genericos de um pokemon
    //Atributos genericos do pokemon
    // Encapsulamento
    String nome;
    private String tipo;
    private int level;
    private int vida = 200;
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
            case "Fogo":
                vida = vida - 90;
                ataque = 82;
                defesa = 62;
                break;
            case "Agua":
                vida =  vida - 37;
                ataque = 20;
                defesa = 99;
                break;
            case "Terra":
                vida = vida - 50;
                ataque = 80;
                defesa = 45;
                break;
            case "Ar":
                vida = vida -5;
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

    int getHP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}