package testMybatis;

import testMybatis.dao.StoreProcedureDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StoreProcedureDAO storeProcedureDAO;
        storeProcedureDAO = new StoreProcedureDAO();
        System.out.println("Result: " + storeProcedureDAO.callGetTotalCityStateIdTest());
        System.out.println( "Hello World!" );
    }
}
