package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    static void main(String[] args) {

        //Primeiro Array representa os meses
        //{1,2,3,4,5,6,7,8,9,10,11,12}
        // Segundo Array representa os dias
        //{31, 28, 31,30}

        int[][] dias = new int[3][3];
        dias [0][0] = 1;
        dias [0][1] = 2;
        dias [0][2] = 3;

        dias [1][0] = 4;
        dias [1][1] = 5;
        dias [1][2] = 6;
        

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }

}
