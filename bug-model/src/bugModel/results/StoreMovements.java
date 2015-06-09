package bugModel.results;

public interface StoreMovements {
    /**
      * Results class implements this method
      */
    public void saveMovements(Code c); 
    /**
      * Results class implements this method
      */
    public void undoMovements(Code c);
}
