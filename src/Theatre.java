public class Theatre {
    public static void main(String[] args) {
        // 1. Создаём актёров
        Actor actor1 = new Actor("Анна", "Петрова", Person.Gender.FEMALE, 1.70);
        Actor actor2 = new Actor("Иван", "Сидоров", Person.Gender.MALE, 1.85);
        Actor actor3 = new Actor("Мария", "Кузнецова", Person.Gender.FEMALE, 1.65);

        // 2. Создаём режиссёров
        Director director1 = new Director("Пётр", "Иванов", Person.Gender.MALE, 10);
        Director director2 = new Director("Елена", "Смирнова", Person.Gender.FEMALE, 8);

        // 3. Создаём автора музыки и хореографа (используются как строки в спектаклях)
        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Мариус Петипа";

        // 4. Создаём три спектакля: обычный, оперный и балет
        Show regularShow = new Show("Горе от ума", 150, director1);
        Opera opera = new Opera("Травиата", 180, director2, "Джузеппе Верди",
                "Трагическая история любви молодой куртизанки Виолетты Валери", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 160, director1, musicAuthor,
                "История о заколдованной принцессе-лебеди Одетте", choreographer);

        // 5. Распределяем актёров по спектаклям
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        // 6. Выводим списки актёров для каждого спектакля
        System.out.println("=== Спектакль «Горе от ума» ===");
        regularShow.printActorsList();

        System.out.println("\n=== Опера «Травиата» ===");
        opera.printActorsList();

        System.out.println("\n=== Балет «Лебединое озеро» ===");
        ballet.printActorsList();

        // 7. Заменяем актёра в балете (Сидорова на нового)
        System.out.println("\n--- Замена актёра в балете ---");
        Actor newActor = new Actor("Алексей", "Новиков", Person.Gender.MALE, 1.80);
        ballet.replaceActor("Сидоров", newActor);

        System.out.println("\nСписок актёров балета после замены:");
        ballet.printActorsList();


        // 8. Пытаемся заменить несуществующего актёра в опере
        System.out.println("\n--- Попытка замены несуществующего актёра в опере ---");
        opera.replaceActor("Васильев", new Actor("Дмитрий", "Васильев", Person.Gender.MALE, 1.78));

        // 9. Выводим либретто для оперного и балетного спектаклей
        System.out.println("\n=== Либретто оперы «Травиата» ===");
        opera.printLibretto();


        System.out.println("\n=== Либретто балета «Лебединое озеро» ===");
        ballet.printLibretto();
    }
}
