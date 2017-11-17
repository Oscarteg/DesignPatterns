package creationalpatterns.objectPool;

import java.sql.Connection;

/**
 * Created by Oscar on 14/07/2017.
 */
public class Main {
    public static void main(String args[]) {
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        Connection con = pool.checkOut();

        pool.checkIn(con);

    }
}
