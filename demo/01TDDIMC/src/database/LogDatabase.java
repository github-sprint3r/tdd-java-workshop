package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LogDatabase {

    private Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public List<Log> getAll() {
        List<Log> resultList = new ArrayList<Log>();
        String sql = "SELECT * FROM LOG";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                Log log = new Log(0, "");
                resultList.add(log);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    public void insert(Log newLog) {
        String sql = "INSERT INTO LOG(code, message) VALUES (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, newLog.getCode());
            preparedStatement.setString(2, newLog.getMessage());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
