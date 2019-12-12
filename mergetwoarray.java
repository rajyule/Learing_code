import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class mergetwoarray {
	private static int[] mergetwoarray(int[] arrayA,int[] arrayB) {
		int[] mergearr = new int[arrayA.length + arrayB.length];
		int i=0, j=0,k=0;
		while(i< arrayA.length){
			mergearr[k] = arrayA[i];
			i++;
			k++;
		}
		while(j<arrayB.length) {
			mergearr[k]=arrayB[j];
			j++;
			k++;
		}
		Set<Integer> setWithNoDuplicates = new HashSet<>();
		for (int m = 0; m < mergearr.length; m++) 
        {
            setWithNoDuplicates.add(mergearr[m]);
        }
		Iterator it = (Iterator) setWithNoDuplicates.iterator();
		int[] mergedArrayWithNoDuplicates = new int[setWithNoDuplicates.size()];
        
        int n = 0;
         
        while (it.hasNext()) 
        {
            mergedArrayWithNoDuplicates[n] = it.next();
            n++;
        }  
        Arrays.sort(mergedArrayWithNoDuplicates);
         
        return mergedArrayWithNoDuplicates;
    }
		
		
		
}
