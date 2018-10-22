package lab1;

public class main {

    public static void main(String args[]){
        IntroJavaCourse intro = new IntroJavaCourse("intro", "00001", 2.00);
        AdvancedJavaCourse adv = new AdvancedJavaCourse("adv","00002");

        intro.course();
        adv.course();

        System.out.println(intro.getCourseName()+ " " + intro.getCourseNumber());
        System.out.println(adv.getCourseName() + " " + adv.getCourseNumber());
    }
}
