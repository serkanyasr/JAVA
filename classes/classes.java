public class classes {
    public static void main(String[] args) {
        makeMusicians();
    }

    public static void makeMusicians() {
        Musicians serkan = new Musicians("Serkan", "Gitar", 22);
        System.out.println(serkan.getName()); // w Getter
        serkan.setName();
        System.out.println(serkan.getName()); // w Setter

    }
}
