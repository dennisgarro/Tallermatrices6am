public class metodos {
    public int[][] LlenarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 100);
            }
        }
        return m;
    }

    public void MostarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println(" - " + m[i][j] + " - ");
            }
        }
    }

    public int SumaTotal(int[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                suma = suma + m[i][j];
            }
        }
        return suma;

    }
}
