package lesson2;

public class Main {

    public static void main(String[] args) {

        String[][] S = {
                {"12", "5", "5", "hg"},
                {"6", "21", "11", "4"},
                {"9", "7", "8", "6"},
                {"1", "2", "3", "4"}
        };

        try {
            System.out.println(arrayElementSum(S));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Размеры масива должны быть: " + e.getA() + " на " + e.getB());
        } catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println(e.getMessage() + " в ячейке: " + e.getX() + " " + e.getY());
        }

    }




    static int arrayElementSum(String[][] str) throws MyArraySizeException, MyArrayDataException{
        int summ = 0;
        for (int i=0; i < str.length; i++) {
            if (str.length < 4 || str.length > 4 || str[i].length<4 || str[i].length>4) {
                throw new MyArraySizeException("вы вышли за рамки размера массива", 4, 4);
            }
            for (int g =0; g< str.length; g++){
                if (Integer.getInteger(str[i][g]) == null){
                    throw new MyArrayDataException("неверный формат данных" , i , g);
                }
                summ += Integer.parseInt(str[i][g]);
            }
        }
        return summ;
    }



}
