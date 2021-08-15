package wmff.sorts;

class BubbleSort extends AbstractSort {

    void sort(Object[] array) {
        bubbleSort(array);
    }

    private void bubbleSort(Object[] array) 
    {
	for (int i = 0; i < array.length -1; i++)
	{
		for (int j=array.length-1; j>i; j--)
		{
			if ((int) array[j] < (int) array[j - 1]) 
                	{
				swap(array, j, j-1);
        	        }				
		}
	}
    }
}                                            