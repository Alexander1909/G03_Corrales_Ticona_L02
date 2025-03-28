public class TestGen {
    public static <T> boolean exist(T[] array, T elemnto){
        for (T item : array){
            if(item.equals(elemnto)){
                return true;
            }
        
        }
        return false;
    }

}


