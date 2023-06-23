import java.util.ArrayList;
import java.util.List;

public class CadastroSuperHerois {
    private List<SuperHeroi> superHerois;
    //declara a lista 

    //cadastra o heroi
    public CadastroSuperHerois() {
        superHerois = new ArrayList<>();
    }

    public void adicionarSuperHeroi(SuperHeroi superHeroi) {
        superHerois.add(superHeroi);
    }

    //remove heroi do sistema 
    public void removerSuperHeroi (SuperHeroi superHeroi) {
        superHerois.remove(superHeroi);
    }

    //busca por um heroi no sistema
    public SuperHeroi buscarSuperHeroi (String nome) {
        for (SuperHeroi superHeroi : superHerois) {
            if (superHeroi.getNome().equals(nome)) {
                return superHeroi;
            }
        }
        return null;
    }

    //retorna a lista de todos super herois no sistema
    public List<SuperHeroi> listarSuperHerois() {
        return superHerois;
    }
}

