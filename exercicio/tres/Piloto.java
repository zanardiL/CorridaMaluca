package exercicio.tres;

public class Piloto {
    private String nome;
    private Integer idade;
    private Enum Sexo;
    private String equipe;

    public Piloto(String nome, Integer idade, Enum Sexo, String equipe) {
        this.nome = nome;
        this.idade = idade;
        this.Sexo = Sexo;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Enum getSexo() {
        return Sexo;
    }

    public void setSexo(Enum sexo) {
        this.Sexo = sexo;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "\nPiloto:" +
                "\n- Nome: " + nome +
                "\n- Idade: " + idade +
                "\n- Sexo: " + Sexo +
                "\n- Equipe: " + equipe;
    }
}
