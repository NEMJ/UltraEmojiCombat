import java.util.Random;

public class Luta {
  // Atributos
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;


  // Métodos
  public void marcarLuta(Lutador l1, Lutador l2) {
    // if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
    // O operador '==' tem o mesmo sentido do .equals()
    if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
      this.aprovada = true;
      this.desafiado = l1;
      this.desafiante = l2;
    } else {
      this.aprovada = false;
      this.desafiado = null;
      this.desafiante = null;
    }
  }

  public void lutar() {
    if(this.aprovada) {
      System.out.println("### DESAFIADO ###");
      this.desafiado.apresentar();
      System.out.println("### DESAFIANTE ###");
      this.desafiante.apresentar();
      
      Random random = new Random();
      int vencedor = random.nextInt(3); // 3 resultados aleatórios: 0, 1 ou 2

      System.out.println("====== RESULTADO DA LUTA ======");
      switch(vencedor) {
        case 0: // Empate
          System.out.println("Empatou!");
          desafiado.empatarLuta();
          desafiante.empatarLuta();
        break;
        case 1: // Desafiado vence
          System.out.println("Vitória do " + this.desafiado.getNome());
          desafiado.ganharLuta();
          desafiante.perderLuta();
        break;
        case 2: //Desafiante vence
          System.out.println("Vitória do " + this.desafiante.getNome());
          desafiado.perderLuta();
          desafiante.ganharLuta();
        break;
      }
      System.out.println("===============================");
    } else {
      System.out.println("A luta não pode acontecer!");
    }
  }

  // Getters
  public Lutador getDesafiado() {
    return this.desafiado;
  }
  public Lutador getDesafiante() {
    return this.desafiante;
  }
  public int getRounds() {
    return this.rounds;
  }
  public boolean getAprovada() {
    return this.aprovada;
  }

  // Setters
  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }
  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }
  public void setRounds(int rounds) {
    this.rounds = rounds;
  }
  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }
}