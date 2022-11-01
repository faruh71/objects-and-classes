import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {
        Author snayderZak = new Author("snayder","zak ");
        Book mom = new Book("mom",snayderZak , 1997  );
        System.out.println("название книги = " + mom.getName());
        System.out.println("автор = " + snayderZak.getName()+" "+snayderZak.getSurname());
        System.out.println(" год публикации  = " + mom.getYearPublish());
        mom.setYearPublish(2000);
        System.out.println(" год  перепубликации  = " + mom. getYearPublish());

        System.out.println();

        Author kiril = new Author(" Вацура","Кирил");
        Book karl = new Book("закон волка" , kiril ,1996);
        System.out.println("название книги = " + karl.getName());
        System.out.println(" автор = "+kiril.getName()  +" "+kiril.getSurname() );
        System.out.println(" год публикации  = " + karl.getYearPublish() );
        karl.setYearPublish(2015);
        System.out.println(" год перепубликации  = " + karl.getYearPublish() );
        System.out.println();


        System.out.println(" методы обьектов" );
        //Реализовать методы toString, equals и hashCode в классах Author и Book,
        // которые были созданы на прошлом уроке. Обратите внимание, что toString книги не должен дублировать
        // код из toString автора, а должен делегировать (вызывать) его версию метода.

        Author weyn = new Author("atom", "weyn");
        Book communications = new Book("communications", weyn, 1912);
        System.out.println(communications);
        System.out.println();

        Author deyl = new Author("kernegi", "deyl");
        Book frend = new Book("fend", deyl, 1992);
        System.out.println(frend);
        System.out.println();

        System.out.println(frend.equals(frend));
        System.out.println(communications.equals(frend));
        System.out.println(communications.hashCode());
        System.out.println(frend.hashCode());
    }
}