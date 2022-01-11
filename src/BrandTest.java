/*
*
* */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/*
* 查询：查询所有数据
* 添加：添加品牌
* 修改：根据id修改
* 删除：根据id删除
* */

public class BrandTest {
    public static void main(String[] argv) throws Exception {
        Database database = new Database();

//        database.addData("Tesla", "Tesla",
//                100, "Electric Cars, Solar & Clean Energy", 1);
        database.deleteData(5);
        database.queryData();


//        String brandName = "Tesla";
//        String companyName = "Tesla";
//        int ordered = 100;
//        String description = "Electric Cars, Solar & Clean Energy";
//        int status = 1;
//        int id = 4;

//        PreparedStatement pstmt = conn.prepareStatement(sql);

//        pstmt.setString(1, brandName);
//        pstmt.setString(2, companyName);
//        pstmt.setInt(3, ordered);
//        pstmt.setString(4, description);
//        pstmt.setInt(5, status);
//        pstmt.setInt(6, id);

//        int count = pstmt.executeUpdate();
//
//        System.out.println(count > 0);



//        ResultSet rs = pstmt.executeQuery();


//        Brand brand = null;
//        List<Brand> brands = new ArrayList<>();

//        while (rs.next()) {
//            int id = rs.getInt("id");
//            String brandName = rs.getString("brand_name");
//            String companyName = rs.getString("company_name");
//            int ordered = rs.getInt("ordered");
//            String description = rs.getString("description");
//            int status = rs.getInt("status");
//
//            brand = new Brand(id, brandName, companyName, ordered, description, status);
//            brands.add(brand);
//
//        }
//
//        System.out.println(brands);

//        rs.close();
//        pstmt.close();
//        conn.close();

    }



}
