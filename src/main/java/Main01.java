import pl.coderslab.utils.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Main01 {

    public static void main(String[] args) {

        try {
            Connection conn = DbUtil.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
