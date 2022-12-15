
public class mergeSort {

	void BottomUpMergeSort(int[] origArray)
	{
		int[] workArray = new int[origArray.length];		//PSEUDO - Instantiate int[] workArray
		//PSEUDO - Use copyArray to copy origArray to workArray

		for(int width = 1; width < origArray.length; width = 2 * width)
		{ 
			for(int i = 0; i < origArray.length; i = i+(2*width))
			{
				// merge subarrays X and Y, where:
					//X = origArray[i:min(i+width, origArray.length)-1] and
					//Y = origArray[min(i+width, origArray.length):min(i+(2*width), origArray.length)-1]
				int end_idx_sub_array_X = min(i+width, origArray.length);
				int end_idx_sub_array_Y = min(i+(2*width), origArray.length);

				//Note - we are dividing origArray into two adjacent, already sorted subarrays and have
				//bottomUpMerge merge them into a single contiguous sorted subarray
				bottomUpMerge(origArray, i, end_idx_sub_array_X, end_idx_sub_array_Y, workArray);
			}
			
			//PSEUDO - Use copyArray to copy workArray to origArray
		}
	}
	
	
	

	//Note: left, right, and end defines two adjacent sorted subarrays:
		//namely arrayA[left:right-1] and arrayA[right:end-1],
	//that are sorted into one contiguous sorted subarray:
		//namely, arrayB[left:end-1].
	void BottomUpMerge(int[] arrayA, int left, int right, int end, int[] arrayB)
	{
		set i = left, j = right

		for( int k = left; k < end; k++ )
		{ 
			//Note: This if statement works as desired with careful consideration. 
			// We are heavily relying on lazy evaluation here.

				// Case 1: If i < right is true and j >= end is false.
				// This means we have not fully merged the left sublist 
				// nor the right sublist yet.
				// So, the arrayA[i] <= arrayA[j] is evaluated, and 
				// dictates which element from either sublist we are going to grab next.

				// Case 2: If i < right is true and j >= end is true.
				// This means that we have fully merged the right sublist, 
				// but have not yet fully merged the left sublist.
				// So, we fall into the if block to copy elements remaining 
				// in the left sublist that still need to be merged. 
				// Note that the arrayA[i] <= arrayA[j] is not executed here 
				// due to lazy evaluation.

				// Case 3: If i < right is false, and j >= end is false.
				// This means that we have fully merged the left sublist, 
				// but have not yet fully merged the right sublist.
				// So, we fall into the else block to copy elements remaining 
				// in the right sublist that still need to be merged.
				// Note that the arrayA[i] <= arrayA[j] is not executed here 
				// due to lazy evaluation.

				// Case 4: If i < right is false, and j >= end is true.
				// This means that we have fully merged both 
				// the left and right sublists, which means we are done.
				// In reality, this case will never occur during execution, 
				// because the for loop goes from k = left to k < end.
				// No matter what complicated order the merge occurs in, 
				// i and j will not both be incremented to the point
				// where this case can occur.

			if( (i < right) and ((j >= end) or (arrayA[i] <= arrayA[j])) )
			{
				//Copy the next element from the left sublist into arrayB.

				//Note - we only arrive here if arrayA[i] <= arrayA[j] or we have already copied
				//all of the right sublist to arrayB
				arrayB[k] = arrayA[i]
				i = i+1
			}
			else
			{
				//Copy the next element from the right sublist into arrayB.

				//Note - we only arrive here if arrayA[i] > arrayA[j] or we have already copied 
				//all of the left sublist to arrayB
				arrayB[k] = arrayA[j]
				j = j+1
			}
		}
	}
	
	
}
