abstract class Animals {
 abstract void cats();
    abstract void dogs();}
class Cats extends Animals {
    @Override
void cats() {
      System.out.println("Cats meow");}
    @Override
    void dogs() {}}
class Dogs extends Animals {
    @Override
    void dogs() {
        System.out.println("Dogs bark");}
    @Override
    void cats() {}}
public class Mavenproject1 {
    public static void main (String[] args) {
        Animals cat = new Cats();
        Animals dog = new Dogs();
        cat.cats();
        dog.dogs();}}
