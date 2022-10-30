public class JDBC_Driver {
    public static void main(final String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver berhasil terdeteksi");
        } catch (final InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            System.out.print(ex);
        }
    }
}
