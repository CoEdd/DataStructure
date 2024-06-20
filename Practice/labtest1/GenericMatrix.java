package Practice.labtest1;

public abstract class GenericMatrix<E extends Number> {

    public GenericMatrix(){

    }
    
    public abstract E[][] add();

    public abstract E multiply();

    public abstract E zero();

    public void addMatrix(){

    }

    public void multiplyMatrix(){

    }

    public static <E> void printResult(E[][] result){
        for(int i = 0; i < result.length ; i++){
            for(int j = 0; j < result[i].length ; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class IntegerMatrix extends GenericMatrix<Integer>{

    private Integer[][] matrix1;
    private Integer[][] matrix2;

    public IntegerMatrix(Integer[][] matrix1, Integer[][] matrix2){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }


    public Integer[][] add(){
        Integer[][] result = new Integer[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length ; i++){
            for(int j = 0; j < matrix1[i].length ; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public Integer multiply(){
        return 0 ;
    }

    public Integer zero(){
        return 0;
    }

}

class TestIntegerMatrix{
    public static void main(String[] args) {

        Integer[][] matrix1 = {{1,2},{2,4},{1,1}};
        Integer[][] matrix2 = {{1,2},{2,4},{1,1}};

        IntegerMatrix kira = new IntegerMatrix(matrix1, matrix2);

        Integer[][] r = kira.add();

        GenericMatrix.printResult(r);


        
    }
}

