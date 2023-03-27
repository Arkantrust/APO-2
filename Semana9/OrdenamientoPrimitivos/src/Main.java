import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(4);
        numbers.add(8);
        numbers.add(-2);
        numbers.add(-4);

        // Selection sort
        for (int i = 0; i < numbers.size(); i++){
            for (int j = i+1; j < numbers.size(); j++){
                if(numbers.get(i) > numbers.get(j)){
                    int actual = numbers.get(i);
                    int next = numbers.get(j);
                    numbers.set(i, next);
                    numbers.set(j, actual);
                }
            }
        }

        for (int n: numbers) {
            System.out.print(n+" ");
        }


        // Bubble sort by Sebastian
        for(int i = 0; i < numbers.size(); i++){
            for(int j = 0; j < numbers.size(); j++){
                if(numbers.get(i) < numbers.get(j)){
                    int actual = numbers.get(i);
                    int next = numbers.get(j);
                    numbers.set(i, next);
                    numbers.set(j, actual);
                }
            }
        }


        // Bubble sort
        boolean swapped;
        do{
            swapped = false;
            for (int i = 0; i < numbers.size()-1; i++){
                if(numbers.get(i) > numbers.get(i+1)){
                    swapped = true;
                    int actual = numbers.get(i);
                    int next = numbers.get(i+1);
                    numbers.set(i, next);
                    numbers.set(i+1, actual);
                }
            }
        }while (swapped);

    }



}