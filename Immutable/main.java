class Main {
   public static void main(String[] args){
      Immutable myImmutable = new Position(1, 2);
      Mutable myMutable = new Position(3, 4);
      System.out.println(myImmutable.getX());
      System.out.println(myMutable.getX());
     // myImmutable.setX(5); uncomment if you want the compiler error
      System.out.println(myImmutable.getX());
      myMutable.setX(5);
      System.out.println(myMutable.getX());
   }
}