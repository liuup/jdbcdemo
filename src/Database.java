import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Database {
    private final String url = "jdbc:mysql://localhost:3306/temp";
    private final String user = "admin";
    private final String password = "123698745leo";

    public boolean queryData() throws Exception {
        Connection conn = DriverManager.getConnection(this.url, this.user, this.password);

        String sql = "select * from tb_brand";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        Brand brand = null;
        ArrayList<Brand> brands = new ArrayList<>();

        while(rs.next()) {
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");

            brand = new Brand(id, brandName, companyName, ordered, description, status);
            brands.add(brand);
        }

        for (Brand value : brands) {
            System.out.println(value);
        }

        rs.close();
        pstmt.close();
        conn.close();

        return true;
    }


    public boolean addData(String brandName, String companyName, int ordered,
                           String description, int status) throws Exception {
        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = "insert into tb_brand(brand_name, company_name, ordered, description, status)" +
                "values(?, ?, ?, ?, ?)";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, brandName);
        pstmt.setString(2, companyName);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);

        int count = pstmt.executeUpdate();

        return count > 0;
    }


    public boolean deleteData(int id) throws Exception{
        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = "delete from tb_brand where id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);

        int count = pstmt.executeUpdate();

        return count > 0;
    }
}
