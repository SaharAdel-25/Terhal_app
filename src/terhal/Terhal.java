
package terhal;

import java.sql.Connection;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Terhal {

 
public static void main(String[] args) throws SQLException {
        // Assume the connection is automatically provided by NetBeans (verify with your NetBeans settings)
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_app", "root", "password");

       SwingUtilities.invokeLater(() -> {
            TravelAppGUI appGUI = new TravelAppGUI(connection);
            appGUI.showLoginOrRegister();  // Start by showing login or register screen
        });
    }
}

