	import java.util.ArrayList;
	import java.util.List;

		public class Matriz {
			public static List<Integer> percorreEspiral(int[][] matriz) {
			List<Integer> resultado = new ArrayList<>();

			if (matriz == null || matriz.length == 0) {
            return resultado; 
			}

			int linhaInicio = 0;
			int linhaFim = matriz.length - 1;
			int colunaInicio = 0;
			int colunaFim = matriz[0].length - 1;

			while (linhaInicio <= linhaFim && colunaInicio <= colunaFim) {
            
            for (int i = colunaInicio; i <= colunaFim; i++) {
                resultado.add(matriz[linhaInicio][i]);
            }
            linhaInicio++;

            
            for (int i = linhaInicio; i <= linhaFim; i++) {
                resultado.add(matriz[i][colunaFim]);
            }
            colunaFim--;

            
            if (linhaInicio <= linhaFim) {
                for (int i = colunaFim; i >= colunaInicio; i--) {
                    resultado.add(matriz[linhaFim][i]);
                }
                linhaFim--;
            }

            if (colunaInicio <= colunaFim) {
                for (int i = linhaFim; i >= linhaInicio; i--) {
                    resultado.add(matriz[i][colunaInicio]);
                }
                colunaInicio++;
            }
        }

			return resultado;
    }

			public static void main(String[] args) {
				int[][] matriz = {
						{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
        };

        List<Integer> resultado = percorreEspiral(matriz);
        System.out.println(resultado);
    }
}

	