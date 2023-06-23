public class SuperHeroi {
   
    //atributos
    private String nome;
    private int idade;
    private String habilidades;
    private String filiacao;
    private String históricoMissoes;
    private String localizacao;
    
    //getters e setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getHistóricoMissoes() {
        return históricoMissoes;
    }

    public void setHistóricoMissoes(String históricoMissoes) {
        this.históricoMissoes = históricoMissoes;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    //construtor
    public SuperHeroi(String nome, int idade, String habilidades, String filiacao, String históricoMissoes,
            String localizacao) {
        this.nome = nome;
        this.idade = idade;
        this.habilidades = habilidades;
        this.filiacao = filiacao;
        this.históricoMissoes = históricoMissoes;
        this.localizacao = localizacao;
    }

}
