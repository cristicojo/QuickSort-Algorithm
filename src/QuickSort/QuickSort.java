package QuickSort;

public class QuickSort {

    private int length;
    private int array[];

    public void callquicksort(int userInput[]) {

        this.array = userInput;
        this.length = userInput.length;

        quicksort(0, length - 1);
    }

    private void quicksort(int lowerIndex, int higherIndex) {


        int indexMic = lowerIndex;
        int indexMare = higherIndex;
        //alegem pivotul sa fie elementul al carui index este din mijlocul array
        int pivot = array[indexMic + (indexMare - indexMic) / 2];

        //impartim array mare in doua array mici
        while (indexMic <= indexMare) {

            /**
             In each iteration, we will identify a number from left side which
             is greater then the pivot value, and also we will identify a number
             from right side which is less then the pivot value. Once the search
             is done, then we exchange both numbers.
             */

            while (array[indexMic] < pivot) {
                indexMic++;
            }

            while (array[indexMare] > pivot) {
                indexMare--;
            }

            //facem schimbul de elem
            if (indexMic <= indexMare) {
                exchangeNumbers(indexMic, indexMare);
                //mutam indexul pe urmatoarea pozitie in ambele parti
                indexMic++;
                indexMare--;
            }
        }

        //apelam metoda quicksort() recursiv pt subarray din stanga pivotului respectiv dreapta lui
        if (lowerIndex < indexMare) {
            quicksort(lowerIndex, indexMare);
        }
        if (higherIndex > indexMic) {
            quicksort(indexMic, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}

