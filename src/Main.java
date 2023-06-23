import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        CadastroSuperHerois cadastro = new CadastroSuperHerois();

        //criando super herois e viloes 
        SuperHeroi BaraoZemo = new Vilao("Helmut Zemo", 44, "Manipulação, Hipnose, Combate", 
        "Hydra", "Aniquilar os super soldados", "Prisão de segurança máxima de Berlin");
        SuperHeroi DrEstranho = new Heroi("Stephen Strange", 50, "Magia, Inteligencia", 
        "Vingadores", "Salvar o multi-verso", "Santuário Nova York");
        SuperHeroi FeiticeiraEscarlate = new Heroi("Wanda Maximoff", 35, "Magia, Joia da mente", 
        "Vingadores", "Batalha contra Ultron", "Nova York");
        SuperHeroi homemAranha = new Heroi("Peter Parker", 16, "Inteligencia", "Vingadores", 
        "Salvar a terra do Thanos", "New Jersey");

       //adicionando herois ao arquivo 
       cadastro.adicionarSuperHeroi(homemAranha);
       cadastro.adicionarSuperHeroi(BaraoZemo);
       cadastro.adicionarSuperHeroi(FeiticeiraEscarlate);
       cadastro.adicionarSuperHeroi(DrEstranho);
       
       //exibindo as informaçãoes dos herois 
       System.out.println("Lista de Super Herois e Vilões cadastrados:");
       List<SuperHeroi> listaSuperHerois = cadastro.listarSuperHerois();

       for (SuperHeroi superHeroi : listaSuperHerois) {
          System.out.println("Nome: " + superHeroi.getNome());
          System.out.println("Idade: " + superHeroi.getIdade());
          System.out.println("Habilidades: " + superHeroi.getHabilidades());
          System.out.println("Filiação: " + superHeroi.getFiliacao());
          System.out.println("Missões: " + superHeroi.getHistóricoMissoes());
          System.out.println("Localização: " + superHeroi.getLocalizacao());
       }

       //permitindo que o usuario insira um nome a ser pesquisado
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite o arquivo que você quer localizar: ");
       String nomeBusca = scanner.nextLine();

       SuperHeroi resultadoBusca = null;

       for (SuperHeroi superHeroi : listaSuperHerois) {
          if (superHeroi.getNome().equalsIgnoreCase(nomeBusca)) {
          resultadoBusca = superHeroi;
          break;
    }
}


       if (resultadoBusca != null) {
        System.out.println("Herói encontrado: " + resultadoBusca.getNome());
            System.out.println("Idade: " + resultadoBusca.getIdade());
            System.out.println("Habilidades: " + resultadoBusca.getHabilidades());
            System.out.println("Filiação: " + resultadoBusca.getFiliacao());
            System.out.println("Histórico de Missões: " + resultadoBusca.getHistóricoMissoes());
            System.out.println("Localização: " + resultadoBusca.getLocalizacao());
        } else {
            System.out.println("Herói não encontrado com o nome: " + nomeBusca);
        }
        
       scanner.close();

       }
       
    }


