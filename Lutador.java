public class Lutador {
  // Atibutos
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias, derrotas, empates;

  // Construtor
  public Lutador(
    String nome,
    String nacionalidade,
    int idade,
    float altura,
    float peso,
    int vitorias,
    int derrotas,
    int empates
  ) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    setPeso(peso);
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
  }
  
  public void apresentar() {
    System.out.println("-----------------------------------------------------------");
    System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
    System.out.println("Diretamente de: " + this.getNacionalidade());
    System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
    System.out.println("Pesando " + getPeso() + " kg");
    System.out.println(this.getVitorias() + " vitórias");
    System.out.println(this.getDerrotas() + " derrotas e");
    System.out.println(this.getEmpates() + " empates!");
  }

  public void status() {
    System.out.println("===== STATUS =====");
    System.out.println(this.getNome() + " é um peso " + this.getCategoria());
    System.out.println("Ganhou " + this.getVitorias() + " vezes");
    System.out.println("Perdeu " + this.getDerrotas() + " vezes");
    System.out.println("Empatou " + this.getEmpates() + " vezes");
  }

  public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
  }

  public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
  }

  public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
  }
  
  // Getters
  public String getNome() {
    return this.nome;
  }
  public String getNacionalidade() {
    return this.nacionalidade;
  }
  public int getIdade() {
    return this.idade;
  }
  public float getAltura() {
    return this.altura;
  }
  public float getPeso() {
    return this.peso;
  }
  public String getCategoria() {
    return this.categoria;
  }
  public int getVitorias() {
    return this.vitorias;
  }
  public int getDerrotas() {
    return this.derrotas;
  }
  public int getEmpates() {
    return this.empates;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public void setAltura(float altura) {
    this.altura = altura;
  }
  public void setPeso(float peso) {
    this.peso = peso;
    this.setCategoria();
  }
  private void setCategoria() {
    if(this.peso < 52.2) {
      this.categoria = "Inválido - Muito abaixo";
    } else if(this.peso <= 70.3) {
      this.categoria = "Leve";
    } else if(this.peso <= 83.9) {
      this.categoria = "Médio";
    } else if(this.peso <= 120.2) {
      this.categoria = "Pesado";
    } else {
      this.categoria = "Inválido - Muito acima";
    }
  }
  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }
  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }
  public void setEmpates(int empates) {
    this.empates = empates;
  }
}