package pokesimulator2;

public class Batalha {
    private int meuPokemonHP;
    private int outroPokemonHP;
    private String meuPokemonNome;
    private String outroPokemonNome;
    
    
    public void meuPokemon(String nome, int hp){
        this.meuPokemonHP = hp;
        this.meuPokemonNome = nome;
        
    }
    public void outroPokemon(String nome, int hp){
        this.outroPokemonHP = hp;
        this.outroPokemonNome = nome;
    }
    
    
    public void start(){
        if(meuPokemonHP > outroPokemonHP){
            System.out.println("Pokemon vencedor " + meuPokemonNome);
        } else {
            System.out.println("Pokemon vencedor " + outroPokemonNome);
        }
    }
}