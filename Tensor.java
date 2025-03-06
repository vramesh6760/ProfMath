package profmath;
import java.util.*;

public class Tensor<T extends AbstractNumber<T>> {
    public static boolean LU_MODE = false;
    int row, col;
    T[][] data;

    public Tensor(int row, int col, T init) {
        this.row = row;
        this.col = col;
        data = (T[][]) new AbstractNumber[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                data[i][j] = init.zero();
    }

    public T det() {
        if (row == 2 && col == 2) {
            return data[0][0].mul(data[1][1]).sub(data[0][1].mul(data[1][0]));
        }
        T d = data[0][0].zero();
        for (int j = 0; j < col; j++) {
            T sign = (j % 2 == 0) ? data[0][0].one() : data[0][0].one().neg();
            d = d.add(sign.mul(data[0][j]).mul(minor(0, j).det()));
        }
        return d;
    }

    public Tensor<T> minor(int r, int c) {
        Tensor<T> result = new Tensor<>(row - 1, col - 1, data[0][0]);
        for (int i = 0, p = 0; i < row; i++) {
            if (i == r) continue;
            for (int j = 0, q = 0; j < col; j++) {
                if (j == c) continue;
                result.data[p][q] = data[i][j];
                q++;
            }
            p++;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Tensor) {
            Tensor<?> other = (Tensor<?>) o;
            if (row != other.row || col != other.col)
                return false;
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++)
                    if (!data[i][j].equals(other.data[i][j]))
                        return false;
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                hash ^= data[i][j].hashCode();
        return hash;
    }

    // Other Tensor methods go here...
}


