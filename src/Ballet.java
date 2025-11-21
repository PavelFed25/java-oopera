public class Ballet extends MusicalShow {
    private String choreographer;

    /**
     * Конструктор балета
     * @param title название спектакля
     * @param duration длительность в минутах
     * @param director режиссёр
     * @param musicAuthor автор музыки
     * @param librettoText текст либретто
     * @param choreographer хореограф
     */
    public Ballet(String title, int duration, Director director,
                  String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    /**
     * Получает имя хореографа
     * @return имя хореографа
     */
    public String getChoreographer() {
        return choreographer;
    }

    /**
     * Устанавливает имя хореографа
     * @param choreographer новое имя хореографа
     */
    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Хореограф: " + choreographer;
    }

    /**
     * Переопределяет метод вывода либретто, добавляя информацию о хореографе
     */
    @Override
    public void printLibretto() {
        System.out.println("Текст либретто балета «" + getTitle() + "»:");
        System.out.println(getLibrettoText());
        System.out.println("Хореограф: " + choreographer);
    }
}
