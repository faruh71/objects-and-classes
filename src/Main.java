public class Main {
    public static void main(String[] args) {
        Author snayderZak = new Author("snayder","zak ");
        Book mom = new Book("mom",snayderZak , 1997  );
        System.out.println("название книги = " + mom.getName());
        System.out.println("автор = " + snayderZak.getName()+" "+snayderZak.getSurname());
        System.out.println(" год публикации  = " + mom.getYearPublish());
        mom.setYearPublish(2000);
        System.out.println(" год  перепубликации  = " + mom. getYearPublish());

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        Author kiril = new Author(" Вацура","Кирил");
        Book karl = new Book("закон волка" , kiril ,1996);
        System.out.println("название книги = " + karl.getName());
        System.out.println(" автор = "+kiril.getName()  +" "+kiril.getSurname() );
        System.out.println(" год публикации  = " + karl.getYearPublish() );
        karl.setYearPublish(2015);
        System.out.println(" год перепубликации  = " + karl.getYearPublish() );
    }
}