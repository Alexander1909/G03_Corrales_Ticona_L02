
public class exist {
    public static <T> boolean existe(T[] array, T elemnto){
        for (T item : array){
            if(item.equals(elemnto)){
                return true;
            }
        
        }
        return false;
    }

}
