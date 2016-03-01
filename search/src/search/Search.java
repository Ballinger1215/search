
package search;

/**
 *
 * @author Mark
 */
public class Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {1, 2, 2, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        java.util.Arrays.sort(array);
        
//        System.out.println(search(array, 4));
//        System.out.println(search(array, 12));
        //System.out.println(findMax(array));
        //print(array);
        System.out.println(binarySearch(array, 0 , array.length - 1, 5));
        
    }
    
//    public static void print(int[] array)
//    {
//        String data = "";
//        for(int i = 0; i < array.length; i++)
//            data = data
//            
//    }
    
    
    public static boolean binarySearch(int[] a, int first, int last, int desiredItem)
    {

        int mid;

        mid = (first + last) / 2;
        
        if(first > last)
            return false;
        
        else if(desiredItem == a[mid])
            return true;
        
        else if(desiredItem < a[mid])
            return binarySearch(a, first, mid - 1, desiredItem);
        
        else
            return binarySearch(a, mid + 1, last, desiredItem);
        
    }
    
    
    public static int findMax(int[] array)
    {
        int[] count = new int[10];
        
        
      for(int i = 0; i < array.length; i++)
      {
          count[array[i]]++;
      }
      
      int max = 0;
      int maxIndex = -1;
      for(int i = 0; i < count.length; i++)
      {
          
              if(count[i] > max)
              {
                  
                  max = count[i];
                  maxIndex = i;
                  
              }
              
      }
        return maxIndex;
    }
    
    
    
    
    
    public static int search(int[] array, int find)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == find)
                return i+1;
        }
        return 0;
    }
    
}
