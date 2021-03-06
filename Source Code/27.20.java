/** @author Frank M. Carrano, Timothy M. Henry
    @version 5.0 */
public static <T extends Comparable<? super T>>
       void heapSort(T[] array, int n)
{
   // Create first heap
   for (int rootIndex = n / 2 - 1; rootIndex >= 0; rootIndex--)
      reheap(array, rootIndex, n - 1);

   swap(array, 0, n - 1);

   for (int lastIndex = n - 2; lastIndex > 0; lastIndex--)
   {
      reheap(array, 0, lastIndex);
      swap(array, 0, lastIndex);
   } // end for
} // end heapSort

