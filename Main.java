class Animal {
    public String nome;
    public int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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
}

class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, int idade, String alimento) {
        super(nome, idade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}

class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, int idade, String caracteristica) {
        super(nome, idade);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Característica: " + caracteristica;
    }
}

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Leão", 5, "Carne");
        System.out.println("Nome do mamífero: " + mamifero.getNome());
        System.out.println("Alimento do mamífero: " + mamifero.getAlimento());
        System.out.println("Idade do mamífero: " + mamifero.getIdade());
        Peixe peixe = new Peixe("Tubarão", 8, "Barbatanas");
        System.out.println("Característica do peixe: " + peixe.getCaracteristica());
        System.out.println(peixe.toString());

    }
}
