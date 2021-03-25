package Programacion.Swing1;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class Querys {
    private static final String URL = "jdbc:mysql://194.224.79.42:43306/addressbook?useUnicode=true&useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String USERNAME = "alumne";
    private static final String PASSWORD = "tofol";
    private Connection connection; // manages connection
    private PreparedStatement selectAllPeople;
    private PreparedStatement selectPeopleByLastName;
    private PreparedStatement insertNewPerson;
    private PreparedStatement borrarPerson;
    private PreparedStatement actualizarPerson;
    private PreparedStatement getId;
    // constructor
    public Querys()
    {
        try
        {
            connection =
                    DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // create query that selects all entries in the AddressBook
            selectAllPeople =
                    connection.prepareStatement("SELECT * FROM ADDRESSES");
            // create query that selects entries with a specific last name
            selectPeopleByLastName = connection.prepareStatement(
                    "SELECT * FROM ADDRESSES WHERE LastName = ?");
            // create insert that adds a new entry into the database
            insertNewPerson = connection.prepareStatement(
                    "INSERT INTO ADDRESSES " +
                            "(FirstName, LastName, Email, PhoneNumber, AddressID) " +
                            "VALUES (?, ?, ?, ?, ?)");
            actualizarPerson = connection.prepareStatement(
                    "UPDATE ADDRESSES SET FirstName = ?, LastName = ?, Email = ?, PhoneNumber = ? WHERE AddressID = ?");
            borrarPerson = connection.prepareStatement(
                    "DELETE FROM ADDRESSES WHERE AddressID = ?");
            getId = connection.prepareStatement(
                    "SELECT * FROM ADDRESSES WHERE AddressID = ?");
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            System.exit(1);
        }
    }
    // select all of the addresses in the database
    public List<Persona> getAllPeople()
    {
        List< Persona > results = null;
        ResultSet resultSet = null;
        try
        {
            // executeQuery returns ResultSet containing matching entries
            resultSet = selectAllPeople.executeQuery();
            results = new ArrayList< Persona >();
            while (resultSet.next())
            {
                results.add(new Persona(
                        resultSet.getInt("addressID"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("LastName"),
                        resultSet.getString("Email"),
                        resultSet.getString("PhoneNumber")));
            }
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        finally
        {
            try
            {
                resultSet.close();
            }
            catch (SQLException sqlException)
            {
                sqlException.printStackTrace();
                close();
            }
        }
        return results;
    }
    // select person by last name
    public List<Persona> getPeopleByLastName(String name)
    {
        List<Persona> results = null;
        ResultSet resultSet = null;
        try
        {
            selectPeopleByLastName.setString(1, name); // specify last name

            // executeQuery returns ResultSet containing matching entries
            resultSet = selectPeopleByLastName.executeQuery();
            results = new ArrayList< Persona >();
            while (resultSet.next())
            {
                results.add(new Persona(resultSet.getInt("addressID"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("LastName"),
                        resultSet.getString("Email"),
                        resultSet.getString("PhoneNumber")));
            }
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        finally
        {
            try
            {
                resultSet.close();
            }
            catch (SQLException sqlException)
            {
                sqlException.printStackTrace();
                close();
            }
        }
        return results;
    }
    // add an entry
    public int addPerson(
            String fname, String lname, String email, String num)
    {
        int result = 0;
        // set parameters, then execute
        try
        {
            insertNewPerson.setString(1,fname);
            insertNewPerson.setString(2,lname);
            insertNewPerson.setString(3,email);
            insertNewPerson.setString(4,num);
            insertNewPerson.setInt(5, generadorId());

            // insert the new entry; returns # of rows updated
            result = insertNewPerson.executeUpdate();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            close();
        }
        return result;
    }

    // Método para borrar los datos de una persona
    public int borrarPerson(
            int id)
    {
        int result = 0;
        // set parameters, then execute
        try
        {
            borrarPerson.setInt(1, id);
            // insert the new entry; returns # of rows updated
            result = borrarPerson.executeUpdate();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            close();
        }
        return result;
    }

    // Método para actualizar los datos de una persona
    public int actualizarPerson(
            String fname, String lname, String email, String num, int id)
    {
        int result = 0;
        // set parameters, then execute
        try
        {
            actualizarPerson.setString(1, fname);
            actualizarPerson.setString(2, lname);
            actualizarPerson.setString(3, email);
            actualizarPerson.setString(4, num);
            actualizarPerson.setInt(5, id);
            // insert the new entry; returns # of rows updated
            result = actualizarPerson.executeUpdate();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            close();
        }
        return result;
    }

    // Genera un ID a partir del último id de la base de datos.
    private int generadorId() throws SQLException{
        //Cercar ID Maxim
        Statement cercaMaxId = connection.createStatement();
        ResultSet r = cercaMaxId.executeQuery("SELECT MAX(AddressID) FROM ADDRESSES");
        if(r.next()) return (1 + r.getInt(1));
        else return 1;
    }
    // close the database connection
    public void close()
    {
        try
        {
            connection.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
}
