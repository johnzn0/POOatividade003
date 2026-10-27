public class TestePetShop {
    public static void main(String[] args) {
        Cachorro rex = new Cachorro("Rex", 3, "Labrador");
        Gato mia = new Gato("Mia", 2, "curta");

        Animal[] animais = {rex, mia};
        for (Animal animal : animais) {
            System.out.println(animal.descrever());
        }

        System.out.println(rex.idadeEmMeses());
        System.out.println(rex.idadeEmMeses(6));
    }
}
